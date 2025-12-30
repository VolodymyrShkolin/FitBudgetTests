package pageObjects.data;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DataSelectorsPage extends BasePage {
    public DataSelectorsPage(WebDriver driver) {
        super(driver);
    }

    public final String ORG_BUTTONS = "//tr/td [text()='%s'] /../td /a";


    public List<WebElement> getDataSelectors(String date, String selector){
        String linkPath = String.format(selector, date);
        return driver.findElements(By.xpath(linkPath));
    }

    public WebElement getDataSelector(String date, String selector){
        String linkPath = String.format(selector, date);
        return driver.findElement(By.xpath(linkPath));
    }
}
