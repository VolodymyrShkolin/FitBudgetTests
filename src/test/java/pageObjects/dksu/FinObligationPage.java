package pageObjects.dksu;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class FinObligationPage extends BasePage {
    public FinObligationPage(WebDriver driver) {
        super(driver);
    }

    //List of operations
    @FindBy(how= How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='table-wrapper'] [data-qa-id='button-add']")
    public WebElement BtnAddFinOblig;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-storno']")
    public WebElement BtnStornate;

    //buttons
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] .fin-obl-btn-autofill-note button")
    public WebElement BtnFillNote;

    //datepickers
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='datepicker-acceptance-date']")
    public WebElement dateAcceptanceFiled;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='datepicker-maturity-date']")
    public WebElement dateMaturityFiled;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='datepicker-acceptance-date']")
    public WebElement DPAField;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='datepicker-maturity-date']")
    public WebElement DPMField;


    //btn inp and inp fields
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-sources-of-financing'] [data-qa-id='open-catalog-sources-of-financing-btn']")
    public WebElement BtnInpSrcFin;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-kekv'] [data-qa-id='open-catalog-kekv-btn']")
    public WebElement BtnInpKekv;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-kekv']  input")
    public WebElement kekvInput;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-legal-obligations'] [data-qa-id='open-catalog-legal-obligations-btn']")
    public WebElement BtnInpLawOblig;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-contractors'] input")
    public WebElement FieldContrag;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-payee-accounts'] [data-qa-id='open-catalog-payee-accounts-btn']")
    public WebElement BtnInpAcc;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-restriction-info'] [data-qa-id='open-catalog-restriction-info-btn']")
    public WebElement BtnInpRestrict;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='field-number']")
    public WebElement documentNumberField;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='field-amount']")
    public WebElement FiendSumOfOblig;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='field-note']")
    public WebElement FieldNote;

    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id^='field-is']")
    public List<WebElement> finCheckboxes;
}
