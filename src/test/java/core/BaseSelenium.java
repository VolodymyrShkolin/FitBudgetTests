package core;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

public abstract class BaseSelenium {
    protected final WebDriver driver;
    protected final WebDriverWait wait;
    protected final WebDriverWait longWait;
    protected final JavascriptExecutor js;
    protected final Random random;
    protected final Actions actions;
    protected final Date currentDate;
    protected final Calendar calendar;
    protected static final By LOADER = By.cssSelector("[data-qa-id='tab-item-loading']");

    protected BaseSelenium(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        this.longWait = new WebDriverWait(driver, Duration.ofSeconds(40));
        this.js = (JavascriptExecutor) driver;
        this.random = new Random();
        this.actions = new Actions(driver);
        this.calendar = Calendar.getInstance();
        this.currentDate = calendar.getTime();
    }

    protected void click(WebElement element) {
        waitForUiReady();
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    protected void doubleClick(WebElement element) {
        waitForUiReady();
        wait.until(ExpectedConditions.elementToBeClickable(element));
        actions.doubleClick(element).perform();
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
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
            //return wait.until(d -> element.isDisplayed());
        } catch (TimeoutException e) {
            return false;
        }
    }


    public void scrollIntoView(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView({block:'center'});", element);
    }



    private void waitForUiReady() {
        List<WebElement> loaders = driver.findElements(LOADER);
        if(!loaders.isEmpty()){
            wait.until(ExpectedConditions.invisibilityOfElementLocated(LOADER));
        }
    }
}
