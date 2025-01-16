package config;


import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.FIRST)
@Config.Sources({
        "classpath:properties/${deviceHost}.properties",
        "classpath:properties/emulator.properties"
})
public interface EmulatorRealDeviceConfig extends Config {

    String deviceName();

    String platformVersion();

    String appPackage();

    String appActivity();

    String appiumServerUrl();
}
