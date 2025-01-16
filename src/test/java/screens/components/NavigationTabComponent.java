package screens.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class NavigationTabComponent {
    private final SelenideElement exploreTabButton = $(id("org.wikipedia.alpha:id/nav_tab_explore")),
            savedTabButton = $(id("org.wikipedia.alpha:id/nav_tab_reading_lists")),
            searchTabButton = $(id("org.wikipedia.alpha:id/nav_tab_search")),
            contributeTabButton = $(id("org.wikipedia.alpha:id/nav_tab_edits")),
            moreTabButton = $(id("org.wikipedia.alpha:id/nav_tab_more"));

    @Step("Кликнуть на вкладку 'Explore'")
    public void clickOnExplore() {
        exploreTabButton.click();
    }

    @Step("Кликнуть на вкладку 'Saved'")
    public void clickOnSaved() {
        savedTabButton.click();
    }

    @Step("Кликнуть на вкладку 'Search'")
    public void clickOnSearch() {
        searchTabButton.click();
    }

    @Step("Кликнуть на вкладку 'Contribute'")
    public void clickOnContribute() {
        contributeTabButton.click();
    }

    @Step("Кликнуть на вкладку 'More'")
    public void clickOnMore() {
        moreTabButton.click();
    }
}
