package core.extensions;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import core.PageProvider;
import core.StepFactory;
import core.driver.BrowserType;
import core.driver.WebDriverFactory;

import java.io.File;

import org.openqa.selenium.WebDriver;


public final class GlobalTestSetup {

    public static void main(String[] args) {
        WebDriver driver = null;

        try {
            Config config = loadConfig();

            driver = WebDriverFactory.createDriver(BrowserType.CHROME);
            PageProvider pages = new PageProvider(driver);
            StepFactory steps = new StepFactory(driver, pages);

            loginByBasicAuth(driver, config);


            steps.adminPanelSteps().loginLaravel(
                    config.getString("adminPanel.laravelForm.login"),
                    config.getString("adminPanel.laravelForm.password")
            );

            steps.adminPanelSteps().reloadDatabase(
                    config.getString("usersParams.accMain.edrpoy")
            );

            steps.adminPanelSteps().deleteOrganization(
                    config.getString("usersParams.newUser.edrpoy")
            );

        } catch (Exception e) {
            throw new RuntimeException("Global test setup failed", e);
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    private static Config loadConfig() {
        File configFile = new File("src/test/resources/application.conf");
        return ConfigFactory.parseFile(configFile).resolve();
    }

    private static void loginByBasicAuth(WebDriver driver, Config config) {
        String url = config.getString("urls.url_admin_panel");
        String login = config.getString("adminPanel.browserForm.login");
        String password = config.getString("adminPanel.browserForm.password");

        driver.get("https://" + login + ":" + password + url);
    }
}

