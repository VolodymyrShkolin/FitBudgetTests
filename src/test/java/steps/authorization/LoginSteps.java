package steps.authorization;

import core.BaseSteps;
import core.PageProvider;
import core.StepFactory;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class LoginSteps extends BaseSteps {
    public LoginSteps(WebDriver driver, PageProvider pages, StepFactory steps) {
        super(driver, pages, steps);
    }

    @Step("Авторизація")
    public void login(String login, String pass) {
        clear(pages.loginPage().fieldLogin);
        type(pages.loginPage().fieldLogin, login);
        clear(pages.loginPage().fieldPass);
        type(pages.loginPage().fieldPass, pass);
        click(pages.loginPage().btnEnter);
    }
}
