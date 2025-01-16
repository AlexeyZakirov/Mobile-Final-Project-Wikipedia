package screens;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class LogInScreen {
    private final SelenideElement usernameInput = $(AppiumBy.xpath("//android.widget.EditText[@text=\"Username\"]")),
            passwordInput = $(AppiumBy.xpath("//android.widget.EditText[@text=\"Password\"]")),
            logInButton = $(id("org.wikipedia.alpha:id/login_button"));

    @Step("Произвести вход в систему посредством ввода имени пользователя и пароля")
    public void logIn(String username, String password) {
        usernameInput.click();
        usernameInput.sendKeys(username);
        passwordInput.click();
        passwordInput.sendKeys(password);
        logInButton.click();
    }
}
