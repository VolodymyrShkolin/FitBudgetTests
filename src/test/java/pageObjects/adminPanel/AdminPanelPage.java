package pageObjects.adminPanel;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPanelPage extends BasePage {
    public AdminPanelPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div input[name='email']")
    public WebElement emailField;
    @FindBy(css = "div input[name='password']")
    public WebElement passwordField;
    @FindBy(css = "div button[type='submit']")
    public WebElement submitBtn;
    @FindBy(css = "div li a[href='/platform/dashboard/qa']")
    public WebElement qaMenu;
    @FindBy(css = "div li a[href='/platform/dashboard/organization']")
    public WebElement orgMenu;
    @FindBy(css = "div.card-header a i.material-icons")
    public WebElement orgSandwichMenu;
    @FindBy(css = "div.card-header a[data-target='#deleteOrganization']")
    public WebElement deleteOrgBtn;
    @FindBy(css = "div [data-qa-id='db-reset-start']")
    public WebElement resetQaBtn;
    @FindBy(css = "div [data-qa-id='db-reset-done']")
    public WebElement resetDone;
    @FindBy(css = ".modal-body button[type='submit']")
    public WebElement modalYesBtn;
}
