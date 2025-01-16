package screens;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class MainScreen {
    private final SelenideElement announcementText = $(id("org.wikipedia.alpha:id/view_announcement_text")),
            wikipediaLogo = $(id("org.wikipedia.alpha:id/main_toolbar_wordmark"));

    @Step("Проверить, что на главном экране текст соответствует")
    public void checkAnnoncementText(String text) {
        announcementText.shouldHave(text(text));
    }

    @Step("Проверить, что на экране Explore отображен логотип Wikipedia")
    public void checkWikipediaLogoIsVisible() {
        wikipediaLogo.shouldBe(visible);
    }
}
