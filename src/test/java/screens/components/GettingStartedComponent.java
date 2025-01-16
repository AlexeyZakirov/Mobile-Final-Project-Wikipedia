package screens.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class GettingStartedComponent {
    private final SelenideElement continueButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")),
            doneButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button")),
            primaryText = $(id("org.wikipedia.alpha:id/primaryTextView"));

    @Step("Кликнуть \"Continue\"")
    public GettingStartedComponent clickContinueButton() {
        continueButton.click();
        return this;
    }

    @Step("Кликнуть кнопку Get Started")
    public void clickDoneButton() {
        doneButton.click();
    }

    @Step("Проверить главный текст страницы")
    public GettingStartedComponent checkPrimaryTextOnScreen(String text) {
        primaryText.shouldHave(text(text));
        return this;
    }
}
