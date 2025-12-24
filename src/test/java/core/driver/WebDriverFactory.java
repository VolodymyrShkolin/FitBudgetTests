package core.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public final class WebDriverFactory {

    private WebDriverFactory() {}

    public static WebDriver createDriver(BrowserType browser) {
        return switch (browser) {
            case CHROME -> createChromeDriver();
            case FIREFOX -> throw new UnsupportedOperationException("Firefox not implemented yet");
        };
    }

    public static WebDriver createChromeDriver() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = createChromeOptions();
        WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().window().maximize();

        return driver;
    }

    private static ChromeOptions createChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");

        if (isHeadless()) {
            options.addArguments("--headless=new");
        }

        return options;
    }

    private static boolean isHeadless() {
        return Boolean.parseBoolean(System.getProperty("headless", "false"));
    }
}

