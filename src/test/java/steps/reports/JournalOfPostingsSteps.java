package steps.reports;

import core.BaseSteps;
import core.PageProvider;
import core.StepFactory;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

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

        steps.goToReportsSteps().goToJournalOfPostings();
        steps.catalogSteps().selectRandomData(pages.mainPage().objectTypeBtn);
        steps.datepickerSteps().setFullMonth(
                pages.mainPage().calendarIcn.getFirst(),
                pages.mainPage().calendarIcn.get(1));
        steps.printAndExportSteps().print(html, fileName, pages.mainPage().printBtn2);
        steps.printAndExportSteps().print(pdf, fileName, pages.mainPage().printBtn2);
    }
}
