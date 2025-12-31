package core;

import org.openqa.selenium.WebDriver;
import steps.admin.AdminPanelSteps;
import steps.authorization.LoginSteps;
import steps.goTo.GoToDevPanelSteps;
import steps.goTo.GoToDksuSteps;
import steps.goTo.GoToReportsSteps;
import steps.mainSteps.CatalogSteps;
import steps.mainSteps.DatepickerSteps;
import steps.mainSteps.PrintAndExportSteps;
import steps.operations.MainOperationsSteps;
import steps.reports.JournalOfPostingsSteps;
import steps.webElements.ElementsSteps;


public final class StepFactory {
    private final WebDriver driver;
    private final PageProvider pages;

    private AdminPanelSteps adminPanelSteps;
    private LoginSteps loginSteps;
    private GoToDevPanelSteps goToDevPanelSteps;
    private GoToDksuSteps goToDksuSteps;
    private GoToReportsSteps goToReportsSteps;
    private CatalogSteps catalogSteps;
    private DatepickerSteps datepickerSteps;
    private PrintAndExportSteps printAndExportSteps;
    private MainOperationsSteps mainOperationsSteps;
    private JournalOfPostingsSteps journalOfPostingsSteps;
    private ElementsSteps elementsSteps;


    public StepFactory(WebDriver driver, PageProvider pages) {
        this.driver = driver;
        this.pages = pages;
    }

    public AdminPanelSteps adminPanelSteps(){
        if(adminPanelSteps == null){
            adminPanelSteps = new AdminPanelSteps(driver, pages, this);
        }
        return adminPanelSteps;
    }

    public LoginSteps loginSteps(){
        if(loginSteps == null){
            loginSteps = new LoginSteps(driver, pages, this);
        }
        return loginSteps;
    }

    public GoToDevPanelSteps goToDevPanelSteps(){
        if(goToDevPanelSteps == null){
            goToDevPanelSteps = new GoToDevPanelSteps(driver, pages, this);
        }
        return goToDevPanelSteps;
    }

    public GoToDksuSteps goToDksuSteps(){
        if(goToDksuSteps == null){
            goToDksuSteps = new GoToDksuSteps(driver, pages, this);
        }
        return goToDksuSteps;
    }

    public GoToReportsSteps goToReportsSteps(){
        if(goToReportsSteps == null){
            goToReportsSteps = new GoToReportsSteps(driver, pages, this);
        }
        return goToReportsSteps;
    }

    public CatalogSteps catalogSteps(){
        if(catalogSteps == null){
            catalogSteps = new CatalogSteps(driver, pages, this);
        }
        return catalogSteps;
    }

    public DatepickerSteps datepickerSteps(){
        if(datepickerSteps == null){
            datepickerSteps = new DatepickerSteps(driver, pages, this);
        }
        return datepickerSteps;
    }

    public PrintAndExportSteps printAndExportSteps(){
        if(printAndExportSteps == null){
            printAndExportSteps = new PrintAndExportSteps(driver, pages, this);
        }
        return printAndExportSteps;
    }

    public MainOperationsSteps mainOperationsSteps(){
        if(mainOperationsSteps == null){
            mainOperationsSteps = new MainOperationsSteps(driver, pages, this);
        }
        return mainOperationsSteps;
    }
    public JournalOfPostingsSteps journalOfPostingsSteps(){
        if(journalOfPostingsSteps == null){
            journalOfPostingsSteps = new JournalOfPostingsSteps(driver, pages, this);
        }
        return journalOfPostingsSteps;
    }

    public ElementsSteps elementsSteps(){
        if(elementsSteps == null){
            elementsSteps = new ElementsSteps(driver, pages, this);
        }
        return elementsSteps;
    }


}
