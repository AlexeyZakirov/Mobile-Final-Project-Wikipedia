package helpers;

import config.AuthWikiConfig;
import config.ConfigReader;

import static io.restassured.RestAssured.given;

public class BrowserstackVideo {
    private static final AuthWikiConfig authConfig =
            ConfigReader.INSTANCE.readAuthWikiConfig();

    public static String videoUrl(String sessionId) {
        String url = String.format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .auth().basic(authConfig.user(), authConfig.key())
                .get(url)
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .extract().path("automation_session.video_url");
    }
}
