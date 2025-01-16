package config;

import org.aeonbits.owner.Config;


@Config.Sources(
        "classpath:properties/${deviceHost}.properties"
)
public interface BrowserstackConfig extends Config {

    @DefaultValue("bs://sample.app")
    String app();

    String remoteUrl();

    String device();

    @Key("os_version")
    String osVersion();
}
