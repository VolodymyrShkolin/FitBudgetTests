package pageObjects.salary;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalaryOperationsLinksPage extends BasePage {
    public SalaryOperationsLinksPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[data-qa-id='navigation-page-entries-log-accruals']")
    public WebElement accrualsAndDeductionsJournalLink;
    @FindBy(css = "[data-qa-id='navigation-page-entries-log']")
    public WebElement journalOfPostingsLink;
}
