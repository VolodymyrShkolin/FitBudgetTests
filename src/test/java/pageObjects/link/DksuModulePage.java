package pageObjects.link;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DksuModulePage extends BasePage {
    public DksuModulePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how= How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='navigation-page-financial-obligations']")
    public WebElement financeObligations;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='navigation-page-registers-of-fin-obligs']")
    public WebElement registerFinanceObligations;
}
