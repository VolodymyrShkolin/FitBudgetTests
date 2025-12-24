package pageObjects.devPanel;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public final class DevPage extends BasePage {
    public DevPage(WebDriver driver) {
        super(driver);
    }

    //Links
    @FindBy(css = "[data-qa-id='navigation-page-catalogs-core']")
    public WebElement allCatalogListLink;
    @FindBy(css = "[data-qa-id='navigation-page-catalogs-choice-table']")
    public WebElement catalogChoiceTableLink;
    @FindBy(css = "[data-qa-id='navigation-page-generation-from-html']")
    public WebElement genFromHtmlLink;
    @FindBy(css = "[data-qa-id='navigation-page-dev-to-inputs']")
    public WebElement inputsLink;
    @FindBy(css = "[data-qa-id='navigation-page-rest-split-html']")
    public WebElement restSplitHtmlLink;
    @FindBy(css = "[data-qa-id='navigation-page-tables-default']")
    public WebElement tablesDefaultLink;
    @FindBy(css = "[data-qa-id='navigation-page-tables-sum']")
    public WebElement tablesSumLink;
    @FindBy(css = "[data-qa-id='navigation-page-tables-validation']")
    public WebElement tablesValidationLink;

    //elements
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id*='open-catalog']")
    public List<WebElement> openCatalogBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-testid='input-date']")
    public List<WebElement> inputDate;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='component-of-core-html']")
    public WebElement componentOfCoreHtml;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='elem-split']")
    public WebElement elemSplit;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-wrapper']")
    public WebElement tableWrapper;
}
