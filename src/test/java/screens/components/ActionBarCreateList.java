package screens.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class ActionBarCreateList {
    private final SelenideElement nameListInput = $(id("org.wikipedia.alpha:id/text_input")),
            descriptionListInput = $(id("org.wikipedia.alpha:id/secondary_text_input")),
            okButton = $(id("android:id/button1"));

    @Step("Заполнить Reading List")
    public void fillReadingList(String name, String description) {
        nameListInput.click();
        nameListInput.sendKeys(name);

        descriptionListInput.click();
        descriptionListInput.sendKeys(description);

        okButton.click();
    }
}
