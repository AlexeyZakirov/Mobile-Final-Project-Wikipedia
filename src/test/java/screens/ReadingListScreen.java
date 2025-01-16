package screens;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class ReadingListScreen {
    private final SelenideElement nameReadingList = $(id("org.wikipedia.alpha:id/item_title")),
            descriptionReadingList = $(id("org.wikipedia.alpha:id/item_description")),
            closeNotificationButton = $(id("org.wikipedia.alpha:id/buttonView"));

    @Step("Проверить имя Reading List")
    public ReadingListScreen checkName(String text) {
        closeNotificationButton.click();
        nameReadingList.shouldHave(text(text));
        return this;
    }

    @Step("Проверить описание Reading List")
    public ReadingListScreen checkDescription(String text) {
        descriptionReadingList.shouldHave(text(text));
        return this;
    }
}
