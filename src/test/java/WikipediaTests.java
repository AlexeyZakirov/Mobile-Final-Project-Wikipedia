import com.github.javafaker.Faker;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.*;
import screens.components.*;

import static com.codeborne.selenide.Selenide.back;
import static io.qameta.allure.Allure.step;

@Owner("Alexey Zakirov")
public class WikipediaTests extends TestBase {
    private final MainScreen mainScreen = new MainScreen();
    private final GettingStartedComponent gettingStartedComponent = new GettingStartedComponent();
    private final NavigationTabComponent navigationTabComponent = new NavigationTabComponent();
    private final MainToolbarComponent mainToolbarComponent = new MainToolbarComponent();
    private final MoreScreen moreScreen = new MoreScreen();
    private final SignUpScreen signUpScreen = new SignUpScreen();
    private final LogInScreen logInScreen = new LogInScreen();
    private final Snackbar snackbar = new Snackbar();
    private final SavedScreen savedScreen = new SavedScreen();
    private final ActionBarCreateList actionBarCreateList = new ActionBarCreateList();
    private final ReadingListScreen readingListScreen = new ReadingListScreen();

    @DisplayName("Проверка соответствия всех экранов онбординга")
    @Tag("onboarding_test")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void gettingStartedTest() {
        gettingStartedComponent.checkPrimaryTextOnScreen("The Free Encyclopedia")
                .clickContinueButton()
                .checkPrimaryTextOnScreen("New ways to explore")
                .clickContinueButton()
                .checkPrimaryTextOnScreen("Reading lists with sync")
                .clickContinueButton()
                .checkPrimaryTextOnScreen("Data & Privacy")
                .clickDoneButton();
        mainScreen.checkAnnoncementText("Customize your Explore feed");
    }

    @DisplayName("Проверка перехода по экранам посредством навигации")
    @Tag("navigation_test")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void navigationToolBarTest() {
        back();
        navigationTabComponent.clickOnSaved();
        mainToolbarComponent.checkToolbarTitleText("Saved");
        navigationTabComponent.clickOnSearch();
        mainToolbarComponent.checkToolbarTitleText("Search");
        navigationTabComponent.clickOnContribute();
        mainToolbarComponent.checkToolbarTitleText("Logged-out user");
        navigationTabComponent.clickOnMore();
        moreScreen.checkMoreMenuIsVisible()
                .closeMoreMenu();
        navigationTabComponent.clickOnExplore();
        mainScreen.checkWikipediaLogoIsVisible();
    }

    @DisplayName("Попытка авторизации с некорректными данными")
    @Tag("login_test")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void logInWithIncorrectCredentialsTest() {
        String incorrectPassword = "wrongPass";
        String incorrectUser = "wrongUser";
        step("Перейти на главную страницу", x -> {
            back();
        });
        navigationTabComponent.clickOnMore();
        moreScreen.checkMoreMenuIsVisible()
                .clickOnSignUp();
        signUpScreen.clickOnLogInButton();
        logInScreen.logIn(incorrectUser, incorrectPassword);
        snackbar.checkSnackbarText("Incorrect username or password entered.\nPlease try again.");
    }

    @DisplayName("Создание reading list")
    @Tag("readingList_test")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void createReadingList() {
        Faker faker = new Faker();
        String name = faker.harryPotter().book();
        String desc = faker.starTrek().character();

        step("Перейти на главную страницу", x -> {
            back();
        });

        navigationTabComponent.clickOnSaved();
        mainToolbarComponent.checkToolbarTitleText("Saved");
        savedScreen.createNewList();
        actionBarCreateList.fillReadingList(name, desc);
        savedScreen.clickOnFirstReadingList();
        readingListScreen.checkName(name).checkDescription(desc);
    }

}
