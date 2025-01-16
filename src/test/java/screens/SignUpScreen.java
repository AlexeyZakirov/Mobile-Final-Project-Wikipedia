package screens;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class SignUpScreen {
    private final SelenideElement logInButton = $(id("org.wikipedia.alpha:id/create_account_login_button"));

    @Step("Перейти на экран входа в систему через кнопку Log in")
    public void clickOnLogInButton() {
        logInButton.click();
    }
}
