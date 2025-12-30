package steps.goTo;

import core.BaseSteps;
import core.PageProvider;
import core.StepFactory;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.devPanel.DevPage;
import pageObjects.login.MainPage;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class GoToDevPanelSteps extends BaseSteps {

    public GoToDevPanelSteps(WebDriver driver, PageProvider pages, StepFactory steps) {
        super(driver, pages, steps);
    }

    @Step("Go to All catalogs list")
    public void goToAllCatalogList(){
        devPageCalling();
        click(pages.get(DevPage.class).allCatalogListLink);
        wait.until(ExpectedConditions.textToBePresentInElement(
                pages.get(MainPage.class).pageHeader,
                "Development catalogs"
        ));
    }

    @Step("Go to Catalogs choice table")
    public void goToCatalogsChoiceTable(){
        devPageCalling();
        click(pages.get(DevPage.class).catalogChoiceTableLink);
        assertTrue(isVisible(pages.get(MainPage.class).exitButton));
    }

    @Step("Go to Generation-from-html")
    public void goToGenerationFromHtml(){
        devPageCalling();
        pages.get(DevPage.class).genFromHtmlLink.click();
        assertTrue(isVisible(pages.get(DevPage.class).componentOfCoreHtml));
    }

    @Step("Go to Inputs")
    public void goToInputs(){
        devPageCalling();
        pages.get(DevPage.class).inputsLink.click();
        wait.until(ExpectedConditions.textToBePresentInElement(
                pages.get(MainPage.class).pageHeader,
                "Development all inputs for test"
        ));
    }

    @Step("Go to Rest - split-html")
    public void goToRestSplitHtml(){
        devPageCalling();
        pages.get(DevPage.class).restSplitHtmlLink.click();
        assertTrue(isVisible(pages.get(DevPage.class).elemSplit));
    }

    @Step("Tables - default")
    public void goToTablesDefault(){
        devPageCalling();
        pages.get(DevPage.class).tablesDefaultLink.click();
        assertTrue(isVisible(pages.get(DevPage.class).tableWrapper));

    }

    @Step("Tables - sum")
    public void goToTablesSum(){
        devPageCalling();
        pages.get(DevPage.class).tablesSumLink.click();
        assertTrue(isVisible(pages.get(DevPage.class).tableWrapper));
    }

    @Step("Tables - validation")
    public void goToTablesValidation(){
        devPageCalling();
        pages.get(DevPage.class).tablesValidationLink.click();
        assertTrue(isVisible(pages.get(DevPage.class).tableWrapper));
    }



    @Step("Ctrl + F2 click")
    private void devPageCalling(){
        click(pages.get(MainPage.class).appSearch);
        isVisible(pages.get(MainPage.class).appSearchInput);
        type(pages.get(MainPage.class).appSearchInput, Keys.chord(Keys.CONTROL, Keys.F2));
    }
}
