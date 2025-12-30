package steps.goTo;

import core.BaseSteps;
import core.PageProvider;
import core.StepFactory;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import pageObjects.link.DksuModulePage;
import pageObjects.link.ModuleMenuPage;

@DisplayName("Переід до операцій модуля ДКСУ")
public class GoToDksuSteps extends BaseSteps {
    public GoToDksuSteps(WebDriver driver, PageProvider pages, StepFactory steps) {
        super(driver, pages, steps);
    }

    @Step("Перехід до фінансових зобов'язаннь")
    public void goToFinObligation() {
        click(pages.get(ModuleMenuPage.class).dksu);
        click(pages.get(DksuModulePage.class).financeObligations);;
    }
}
