package steps.goTo;

import core.BaseSteps;
import core.PageProvider;
import core.StepFactory;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;

@DisplayName("Переід до операцій модуля Звіти")
public class GoToReportsSteps extends BaseSteps {
    public GoToReportsSteps(WebDriver driver, PageProvider pages, StepFactory steps) {
        super(driver, pages, steps);
    }

    @Step("Перейти до звіту Журнал проводок")
    public void goToJournalOfPostings(){
        click(pages.moduleMenuPage().reports);
        click(pages.salaryOperationsLinksPage().journalOfPostingsLink);

    }
}
