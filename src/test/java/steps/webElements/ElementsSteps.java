package steps.webElements;

import constants.Kekv;
import core.BaseSteps;
import core.PageProvider;
import core.StepFactory;
import io.qameta.allure.Step;
import lombok.SneakyThrows;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ElementsSteps extends BaseSteps {
    public ElementsSteps(WebDriver driver, PageProvider pages, StepFactory steps) {
        super(driver, pages, steps);
    }

    @SneakyThrows
    @Step("Ввід значення в інлайнове поле")
    public void inlineLoader() {
        steps.goToDksuSteps().goToFinObligation();
        click(pages.finObligationPage().BtnAddFinOblig);
        type(pages.finObligationPage().kekvInput, Kekv.KEKV.getFirst());
        wait.until(ExpectedConditions.visibilityOfAllElements(pages.mainPage().catalogFieldsSearch));
        pages.finObligationPage().kekvInput.sendKeys(Keys.chord(Keys.ENTER));
        wait.until(d -> Kekv.KEKV.getFirst().equals(pages.finObligationPage().kekvInput.getDomProperty("value")));
    }
}
