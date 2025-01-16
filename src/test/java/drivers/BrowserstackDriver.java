package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.AuthWikiConfig;
import config.BrowserstackConfig;
import config.ConfigReader;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackDriver implements WebDriverProvider {

    private final BrowserstackConfig config;
    private final AuthWikiConfig authWikiConfig;

    public BrowserstackDriver() {
        this.config = ConfigReader.INSTANCE.readBrowserstackConfig();
        this.authWikiConfig = ConfigReader.INSTANCE.readAuthWikiConfig();
    }

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        MutableCapabilities caps = new MutableCapabilities();

        caps.setCapability("browserstack.user", authWikiConfig.user());
        caps.setCapability("browserstack.key", authWikiConfig.key());

        caps.setCapability("app", config.app());
        caps.setCapability("device", config.device());
        caps.setCapability("os_version", config.osVersion());

        try {
            return new RemoteWebDriver(
                    new URL(config.remoteUrl()), caps
            );
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }
}
