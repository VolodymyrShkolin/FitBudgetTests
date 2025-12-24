package steps.goTo;

import core.BaseSteps;
import core.PageProvider;
import core.StepFactory;
import org.openqa.selenium.WebDriver;
import pageObjects.link.DksuModulePage;
import pageObjects.link.ModuleMenuPage;

public class DksuModuleSteps extends BaseSteps {
    public DksuModuleSteps(WebDriver driver, PageProvider pages, StepFactory steps) {
        super(driver, pages, steps);
    }

    public void goToFinObligation() {
        click(pages.get(ModuleMenuPage.class).dksu);
        click(pages.get(DksuModulePage.class).financeObligations);;
    }
}
