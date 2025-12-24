package pageObjects.login;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public final class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "[data-qa-id='login-email']")
    public WebElement fieldLogin;
    @FindBy(css = "[data-qa-id='login-pass']")
    public WebElement fieldPass;
    @FindBy(css = "[data-qa-id='login-submit']")
    public WebElement btnEnter;
    @FindBy(css = "[data-qa-id='modal-submit-btn']")
    public WebElement okBtn;
    @FindBy(css = "[data-qa-id='modal-window-content']")
    public WebElement modalWindowContent;
    @FindBy(css = ".input-group-pass")
    public WebElement groupPass;
    @FindBy(css = "[data-qa-id='button-login-out']:nth-child(2)")
    public WebElement loginOutBtnChildTwo;
    @FindBy(css = "[data-qa-id='button-login-out']:nth-child(1)")
    public WebElement loginOutBtnChildOne;
    @FindBy(css = "[data-qa-id='login-recovery']")
    public WebElement loginRecoveryBtn;
    @FindBy(css = "[data-qa-id='recovery-email']")
    public WebElement recEmailFiled;
    @FindBy(css = "[data-qa-id='recovery-code']")
    public WebElement recCodeFiled;
    @FindBy(css = "[data-qa-id='recovery-submit']")
    public WebElement recSubmitBtn;
    @FindBy(css = "[data-qa-id='recovery-auth']")
    public WebElement recAuthBtn;
    @FindBy(css = "[id='recovery-auth-email']")
    public WebElement authEmailField;
    @FindBy(css = "[id='recovery-auth-pass']")
    public WebElement authPassField;
    @FindBy(css = "[data-form-type='recovery-auth'] .button-red")
    public WebElement submitBtn;
}




