package screens.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class Snackbar {
    private final SelenideElement snackbarText = $(id("org.wikipedia.alpha:id/snackbar_text"));

    @Step("Проверить текст в всплывающей нотификации")
    public void checkSnackbarText(String text) {
        snackbarText.shouldHave(text(text));
    }
}
