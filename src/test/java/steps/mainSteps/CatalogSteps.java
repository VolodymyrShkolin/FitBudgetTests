package steps.mainSteps;

import core.BaseSteps;
import core.PageProvider;
import core.StepFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CatalogSteps extends BaseSteps {
    public CatalogSteps(WebDriver driver, PageProvider pages, StepFactory steps) {
        super(driver, pages, steps);
    }

    public void selectRandomData(WebElement catalogBtn){
        click(catalogBtn);
        randomSelection(pages.mainPage().catalogListObjectNew);
        click(pages.mainPage().selectListBtn);

    }

    public String randomSelection(List<WebElement> catalogElements){
        wait.until(ExpectedConditions.visibilityOfAllElements(catalogElements));
        int size = catalogElements.size();
        int randomObject = random.nextInt(size);
        String text = catalogElements.get(randomObject).getDomProperty("innerHTML");
        boolean flag = text.contains("data-qa-id=\"cell-folder\"");
        doubleClick(catalogElements.get(randomObject));
        while(flag) {
            randomObject = random.nextInt(size);
            doubleClick(catalogElements.get(randomObject));
            text = catalogElements.get(randomObject).getDomProperty("innerHTML");
            flag = text.contains("data-qa-id=\"cell-folder\"");
        }
        return catalogElements.get(randomObject).getText();
    }
}
