package core;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BaseSelenium {
    protected final WebDriver driver;
    protected final WebDriverWait wait;
    protected final WebDriverWait longWait;
    protected final JavascriptExecutor js;
    protected static final By LOADER = By.cssSelector("[data-qa-id='tab-item-loading']");

    protected BaseSelenium(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        this.longWait = new WebDriverWait(driver, Duration.ofSeconds(40));
        this.js = (JavascriptExecutor) driver;
    }

    protected void click(WebElement element) {
        waitForUiReady();
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    protected void type(WebElement element, String text) {
        waitForUiReady();
        WebElement el = wait.until(ExpectedConditions.visibilityOf(element));
        el.clear();
        el.sendKeys(text);
    }

    protected void clear(WebElement element) {
        waitForUiReady();
        wait.until(ExpectedConditions.visibilityOf(element)).clear();
    }

    public String textOf(WebElement element) {
        waitForUiReady();
        return wait.until(ExpectedConditions.visibilityOf(element)).getText();
    }

    public boolean isVisible(WebElement element) {
        try {
            return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
            //return wait.until(d -> element.isDisplayed());
        } catch (TimeoutException e) {
            return false;
        }
    }


    public void scrollIntoView(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView({block:'center'});", element);
    }



    private void waitForUiReady() {
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(LOADER));
        } catch (TimeoutException ignored) {
        }
    }
}
