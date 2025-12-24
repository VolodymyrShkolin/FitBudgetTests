package steps.authorization;

import core.BaseSteps;
import core.PageProvider;
import core.StepFactory;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageObjects.login.LoginPage;

public class LoginSteps extends BaseSteps {
    public LoginSteps(WebDriver driver, PageProvider pages, StepFactory steps) {
        super(driver, pages, steps);
    }

    @Step("Авторизація")
    public void login(String login, String pass) {
        clear(pages.get(LoginPage.class).fieldLogin);
        type(pages.get(LoginPage.class).fieldLogin, login);
        clear(pages.get(LoginPage.class).fieldPass);
        type(pages.get(LoginPage.class).fieldPass, pass);
        click(pages.get(LoginPage.class).btnEnter);
    }
}
