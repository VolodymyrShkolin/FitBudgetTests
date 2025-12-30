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
import pageObjects.dksu.FinObligationPage;
import pageObjects.login.MainPage;
import steps.goTo.GoToDksuSteps;

public class ElementsSteps extends BaseSteps {
    public ElementsSteps(WebDriver driver, PageProvider pages, StepFactory steps) {
        super(driver, pages, steps);
    }

    @SneakyThrows
    @Step("Ââ³ä çíà÷åííÿ â ³íëàéíîâå ïîëå")
    public void inlineLoader() {
        steps.get(GoToDksuSteps.class).goToFinObligation();
        click(pages.get(FinObligationPage.class).BtnAddFinOblig);
        type(pages.get(FinObligationPage.class).kekvInput, Kekv.KEKV.getFirst());
        wait.until(ExpectedConditions.visibilityOfAllElements(pages.get(MainPage.class).catalogField³Search));
        pages.get(FinObligationPage.class).kekvInput.sendKeys(Keys.chord(Keys.ENTER));
        wait.until(d -> Kekv.KEKV.getFirst().equals(pages.get(FinObligationPage.class).kekvInput.getDomProperty("value")));
    }
}
