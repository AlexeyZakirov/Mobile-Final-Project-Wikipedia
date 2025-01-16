package config;

import org.aeonbits.owner.ConfigFactory;

public enum ConfigReader {
    INSTANCE;

    private static final BrowserstackConfig browserstackConfig =
            ConfigFactory.create(
                    BrowserstackConfig.class,
                    System.getProperties()
            );
    private static final EmulatorRealDeviceConfig emulatorRealDeviceConfig =
            ConfigFactory.create(
                    EmulatorRealDeviceConfig.class,
                    System.getProperties()
            );
    private static final AuthWikiConfig authWikiConfig =
            ConfigFactory.create(
                    AuthWikiConfig.class,
                    System.getProperties()
            );

    public BrowserstackConfig readBrowserstackConfig() {
        return browserstackConfig;
    }

    public EmulatorRealDeviceConfig readEmulatorRealDeviceConfig() {
        return emulatorRealDeviceConfig;
    }

    public AuthWikiConfig readAuthWikiConfig() {
        return authWikiConfig;
    }
}
