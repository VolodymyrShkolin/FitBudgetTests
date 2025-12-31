package core;

import org.openqa.selenium.WebDriver;
import pageObjects.adminPanel.AdminPanelPage;
import pageObjects.data.DataSelectorsPage;
import pageObjects.devPanel.DevPage;
import pageObjects.dksu.FinObligationPage;
import pageObjects.link.DksuModulePage;
import pageObjects.link.ModuleMenuPage;
import pageObjects.login.LoginPage;
import pageObjects.login.MainPage;
import pageObjects.salary.SalaryOperationsLinksPage;


public final class PageProvider {
    private final WebDriver driver;

    private MainPage mainPage;
    private LoginPage loginPage;
    private DevPage devPage;
    private ModuleMenuPage moduleMenuPage;
    private DksuModulePage dksuModulePage;
    private FinObligationPage finObligationPage;
    private AdminPanelPage adminPanelPage;
    private DataSelectorsPage dataSelectorsPage;
    private SalaryOperationsLinksPage salaryOperationsLinksPage;

    public PageProvider(WebDriver driver) {
        this.driver = driver;
    }


    public MainPage mainPage(){
        if(mainPage == null){
            mainPage = new MainPage(driver);
        }
        return mainPage;
    }

    public LoginPage loginPage(){
        if(loginPage == null){
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    public DataSelectorsPage dataSelectorsPage(){
        if(dataSelectorsPage == null){
            dataSelectorsPage = new DataSelectorsPage(driver);
        }
        return dataSelectorsPage;
    }

    public SalaryOperationsLinksPage salaryOperationsLinksPage(){
        if(salaryOperationsLinksPage == null){
            salaryOperationsLinksPage = new SalaryOperationsLinksPage(driver);
        }
        return salaryOperationsLinksPage;
    }

    public DevPage devPage() {
        if (devPage == null) {
            devPage = new DevPage(driver);
        }
        return devPage;
    }

    public ModuleMenuPage moduleMenuPage() {
        if (moduleMenuPage == null) {
            moduleMenuPage = new ModuleMenuPage(driver);
        }
        return moduleMenuPage;
    }

    public DksuModulePage dksuModulePage() {
        if (dksuModulePage == null) {
            dksuModulePage = new DksuModulePage(driver);
        }
        return dksuModulePage;
    }

    public FinObligationPage finObligationPage() {
        if (finObligationPage == null) {
            finObligationPage = new FinObligationPage(driver);
        }
        return finObligationPage;
    }

    public AdminPanelPage adminPanelPage(){
        if (adminPanelPage == null){
            adminPanelPage = new AdminPanelPage(driver);
        }
        return adminPanelPage;
    }

}
