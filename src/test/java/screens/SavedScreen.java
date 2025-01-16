package screens;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class SavedScreen {
    private final SelenideElement moreOptions = $(id("org.wikipedia.alpha:id/menu_overflow_button")),
            createNewListButton = $(id("org.wikipedia.alpha:id/reading_lists_overflow_create_new_list")),
            readingListCollection = $(id("org.wikipedia.alpha:id/recycler_view"));

    @Step("Кликнуть на 3 точки (more options)")
    public void clickMoreOptions() {
        moreOptions.click();
    }

    @Step("Создать новый Reading List")
    public void createNewList() {
        clickMoreOptions();
        createNewListButton.click();
    }

    @Step("Перейти в первый в списке Reading List")
    public void clickOnFirstReadingList() {
        readingListCollection.click();
    }
}
