package screens;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class MoreScreen {
    private final SelenideElement moreMenu = $(id("org.wikipedia.alpha:id/design_bottom_sheet")),
            outsideMoreMenu = $(id("org.wikipedia.alpha:id/touch_outside")),
            loginButton = $(id("org.wikipedia.alpha:id/main_drawer_account_container"));

    @Step("Проверить, что отображено меню вкладки 'More'")
    public MoreScreen checkMoreMenuIsVisible() {
        moreMenu.shouldBe(visible);
        return this;
    }

    @Step("Закрыть меню вкладки More")
    public void closeMoreMenu() {
        outsideMoreMenu.click();
    }

    @Step("Перейти на вкладку - Sign Up Wikipedia")
    public void clickOnSignUp() {
        loginButton.click();
    }
}
