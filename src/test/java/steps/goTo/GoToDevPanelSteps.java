package steps.goTo;

import core.BaseSteps;
import core.PageProvider;
import core.StepFactory;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class GoToDevPanelSteps extends BaseSteps {

    public GoToDevPanelSteps(WebDriver driver, PageProvider pages, StepFactory steps) {
        super(driver, pages, steps);
    }

    @Step("Go to All catalogs list")
    public void goToAllCatalogList(){
        devPageCalling();
        click(pages.devPage().allCatalogListLink);
        wait.until(ExpectedConditions.textToBePresentInElement(
                pages.mainPage().pageHeader,
                "Development catalogs"
        ));
    }

    @Step("Go to Catalogs choice table")
    public void goToCatalogsChoiceTable(){
        devPageCalling();
        click(pages.devPage().catalogChoiceTableLink);
        assertTrue(isVisible(pages.mainPage().exitButton));
    }

    @Step("Go to Generation-from-html")
    public void goToGenerationFromHtml(){
        devPageCalling();
        pages.devPage().genFromHtmlLink.click();
        assertTrue(isVisible(pages.devPage().componentOfCoreHtml));
    }

    @Step("Go to Inputs")
    public void goToInputs(){
        devPageCalling();
        pages.devPage().inputsLink.click();
        wait.until(ExpectedConditions.textToBePresentInElement(
                pages.mainPage().pageHeader,
                "Development all inputs for test"
        ));
    }

    @Step("Go to Rest - split-html")
    public void goToRestSplitHtml(){
        devPageCalling();
        pages.devPage().restSplitHtmlLink.click();
        assertTrue(isVisible(pages.devPage().elemSplit));
    }

    @Step("Tables - default")
    public void goToTablesDefault(){
        devPageCalling();
        pages.devPage().tablesDefaultLink.click();
        assertTrue(isVisible(pages.devPage().tableWrapper));

    }

    @Step("Tables - sum")
    public void goToTablesSum(){
        devPageCalling();
        pages.devPage().tablesSumLink.click();
        assertTrue(isVisible(pages.devPage().tableWrapper));
    }

    @Step("Tables - validation")
    public void goToTablesValidation(){
        devPageCalling();
        pages.devPage().tablesValidationLink.click();
        assertTrue(isVisible(pages.devPage().tableWrapper));
    }



    @Step("Ctrl + F2 click")
    private void devPageCalling(){
        click(pages.mainPage().appSearch);
        isVisible(pages.mainPage().appSearchInput);
        type(pages.mainPage().appSearchInput, Keys.chord(Keys.CONTROL, Keys.F2));
    }
}
