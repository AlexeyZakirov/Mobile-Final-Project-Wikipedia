package screens.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class MainToolbarComponent {
    private final SelenideElement toolbarTitle = $(id("org.wikipedia.alpha:id/toolbarTitle"));

    @Step("Проверить, что в заголовке отображён текст - {0}")
    public void checkToolbarTitleText(String text) {
        toolbarTitle.shouldHave(text(text));
    }
}
