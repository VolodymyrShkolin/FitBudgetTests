package steps.reports;

import core.BaseSteps;
import core.PageProvider;
import core.StepFactory;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageObjects.login.MainPage;
import steps.goTo.GoToReportsSteps;
import steps.mainSteps.CatalogSteps;
import steps.mainSteps.DatepickerSteps;
import steps.mainSteps.PrintAndExportSteps;

import static constants.Print.html;
import static constants.Print.pdf;
import static steps.mainSteps.DatepickerSteps.ukrTime;
import static steps.mainSteps.DatepickerSteps.yyyyMMdd;

public class JournalOfPostingsSteps extends BaseSteps {
    public JournalOfPostingsSteps(WebDriver driver, PageProvider pages, StepFactory steps) {
        super(driver, pages, steps);
    }

    @Step("Формування журнала проводок")
    public void journalOfPosting(){
        String fileName = "download_" + yyyyMMdd.format(currentDate) + ukrTime;

        steps.get(GoToReportsSteps.class).goToJournalOfPostings();
        steps.get(CatalogSteps.class).selectRandomData(pages.get(MainPage.class).objectTypeBtn);
        steps.get(DatepickerSteps.class).setFullMonth(
                pages.get(MainPage.class).calendarIcn.getFirst(),
                pages.get(MainPage.class).calendarIcn.get(1));
        steps.get(PrintAndExportSteps.class).specPrint(html, fileName, pages.get(MainPage.class).printBtn2);
        steps.get(PrintAndExportSteps.class).specPrint(pdf, fileName, pages.get(MainPage.class).printBtn2);
    }
}
