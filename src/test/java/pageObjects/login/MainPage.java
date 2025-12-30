package pageObjects.login;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how= How.CSS, using = "body")
    public WebElement body;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='navigation-page-catalogs-core']")
    public WebElement allCatalogListBtn;

    //business transactions buttons for almost every list of operations
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-add']")
    public WebElement btnAddBusTrans;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='button-add']")
    public WebElement modalAddBtn;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='button-fill']")
    public WebElement fillBtn;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='table-wrapper']:nth-child(4) [data-qa-id='button-add']")
    public WebElement btnAddTransSecondTable;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-edit']")
    public WebElement btnEditBusTrans;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-delete']")
    public WebElement btnDeleteBusTrans;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='button-delete']")
    public WebElement btnDeleteModal;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-delete']")
    public List<WebElement> deleteBtns;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-testid='page-header-title']")
    public WebElement pageHeader;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-button-exclude']")
    public WebElement excludeBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-td'] div[title*='-1.00']")
    public WebElement minusOneDateTd;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='table-wrapper']:nth-child(4) [data-qa-id='button-delete']")
    public WebElement btnDeleteTransSecondTable;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-refresh']")
    public WebElement btnRefreshBusTrans;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-reset']")
    public WebElement btnResetBusTrans;

    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='button-print-list']")
    public WebElement printListBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='select-classification']")
    public WebElement dropDownMenu;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='select-classification'] option")
    public List<WebElement> dropDownMenuVariants;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-print'], [data-qa-id='tab-content'] [data-qa-id='button-print-register']")
    public WebElement printButton;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-download'], [data-qa-id='tab-content'] [data-qa-id='button-button-print']")
    public WebElement printReportBtn;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-download'], [data-qa-id='tab-content'] [data-qa-id='button-button-print'], [data-qa-id='tab-content'] [data-qa-id='button-print']")
    public WebElement printBtn2;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='drop-down-list'] [data-qa-id='button-export-ukrsibbank']")
    public WebElement exportUkrsibBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='drop-down-list'] [data-qa-id='button-export-privatbank']")
    public WebElement exportPrivatBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='drop-down-list'] [data-qa-id='button-export-privatbank-ipn']")
    public WebElement exportPrivatIpnBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='drop-down-list'] [data-qa-id='button-export-pumbbank']")
    public WebElement exportPumbBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='drop-down-list'] [data-qa-id='button-export-ukrgazbank']")
    public WebElement exportUkrgazbankBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='drop-down-list'] [data-qa-id='button-export-raiffeisen']")
    public WebElement exportRaiffeisenBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='drop-down-list'] [data-qa-id='button-export-oschadbank']")
    public WebElement exportOschadBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='drop-down-list'] [data-qa-id='button-export-oschadbank-sep4']")
    public WebElement exportOschad4Btn;

    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='print-register-pi']")
    public WebElement printRegPIBtn;

    @FindBy(css = "[data-qa-id='modal-window'] [data-qa-id='table-tr'] [data-qa-id='table-td'] input")
    public WebElement template;
    @FindBy(css = "button .fas.fa-times")
    public WebElement crossBtn;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='open-catalog-employee-btn']")
    public WebElement employeeBtn;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-employee'] input")
    public WebElement employeeField;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-employee']")
    public WebElement employee;

    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='print-pi-1']")
    public WebElement printPiOneBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='print-pi-2']")
    public WebElement printPiTwoBtn;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-export']")
    public WebElement exportButtonInDKSU;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-print']")
    public List<WebElement> printBtn;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-export']")
    public List<WebElement> exportButtonsInDksu;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] div:nth-child(4) [data-qa-id='button-print'], [data-qa-id='tab-content'] [data-qa-id='button-drop-down-print']")
    public WebElement printDropdownButton;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='print-estimates'], [data-qa-id='tab-content'] [data-qa-id='print-estimates-changes']")
    public List<WebElement> printDropdownOptions;

    @FindBy(how=How.XPATH, using = ".//div[@data-qa-id='tab-content'] //div[@data-qa-id='table-td'][4] //div[text()='Активний']")
    public List<WebElement> activeAccStatus;
    @FindBy(how=How.XPATH, using = ".//div[@data-qa-id='tab-content'] //div[@data-qa-id='table-td'][4] //div[text()='Запрошений']")
    public List<WebElement> invitedAccStatus;

    @FindBy(how=How.XPATH, using = ".//div[@data-qa-id='tab-content'] //button[@data-qa-id='button-drop-down-print'] / .. / div[@data-qa-id='drop-down-list'] /button")
    public List<WebElement> printDropdownOptionsNew;
    @FindBy(xpath = "((.//div[@data-qa-id='tab-content'] //div[@data-qa-id='table-wrapper'])[1] //div[@data-qa-id='drop-down-list'])[1] /button")
    public List<WebElement> printList;
    @FindBy(css = "[data-qa-id='modal-print-btn'][data-qa-id2='print-to-html']")
    public WebElement printHtmlButton;
    @FindBy(xpath = ".//div[@data-qa-id='tab-content'] //div[@data-qa-id='table-tr-group'] //div[@data-qa-id='cell-body'][@title='Нарахування додані власноруч'] / .. /div[@data-qa-id='cell-folder']")
    public  WebElement chargesCellFolder;
    @FindBy(css = "[data-qa-id='modal-print-btn'][data-qa-id2='print-to-pdf']")
    public WebElement printPdfBtn;

    @FindBy(how=How.CSS, using = "[data-qa-id='table-wrapper'] [data-qa-id='checkbox']")
    public List<WebElement> tableWrapperCheckbox;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='table-wrapper'] [data-qa-id='button-add']")
    public WebElement tableWrapperAddBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='button-add']")
    public List<WebElement> tableWrapperAddBtns;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='main-table-wrapper'] [data-qa-id='button-add']")
    public WebElement addRegisterBtn;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='table-wrapper'] [data-qa-id='table-tr']")
    public List<WebElement> tableWrapperTr;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-exit']")
    public WebElement btnExitBusTrans;

    @FindBy(how=How.CSS, using = ".show-component .table-core .tr, .show-component tbody tr")
    //The path for old catalog.
    public List<WebElement> listOfBusTransactions;

    @FindBy(css = "[data-qa-id ='row-cell']:nth-child(1)")
    public List<WebElement> printRows;

    @FindBy(xpath = "//div[@class='modal-print-head'] //button")
    public WebElement modalPrintCross;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='table-tr']")
    public List<WebElement> listOfBusTransactionsNew;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='field-document-number']")
    public WebElement BusTransNumber;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-calculate-entry']")
    public WebElement calculateAnalyticsButton;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-calculate']")
    public WebElement calculateBtn;
    @FindBy(how=How.CSS, using = ".show-component [data-qa-id='button-show-analytics']")
    public WebElement expandAnalyticsButton;

    @FindBy(how=How.CSS, using = "[data-qa-id='navigation-menu-work-with-dksy']")
    public WebElement Dksu;

    @FindBy(how=How.CSS, using = "[data-qa-id='navigation-menu-accounting']")
    public WebElement Accounting;

    @FindBy(how=How.CSS, using = "[data-qa-id='navigation-menu-salary-navigation']")
    public WebElement Salary;
    @FindBy(how=How.CSS, using = "[data-qa-id='navigation-menu-reporting-navigation']")
    public WebElement Reporting;

    @FindBy(how=How.CSS, using = "[data-qa-id='navigation-menu-reports-navigation']")
    public WebElement Reports;

    @FindBy(how=How.CSS, using = "[data-qa-id='navigation-menu-content-catalogs']")
    public WebElement ReferenceBooks;

    @FindBy(how = How.CSS, using = "[data-qa-id='navigation-page-reflection-payroll']")
    public WebElement displayAccrualOfSalary;

    @FindBy(how=How.CSS, using = "[data-qa-id='navigation-menu-settings-navigation']")
    public WebElement Settings;
    @FindBy(how=How.CSS, using = "[data-qa-id='navigation-menu-manage-subscriptions']")
    public WebElement Subscription;

    @FindBy(how=How.CSS, using = ".show-component .modal-container .green:not(.table-controls-disabled)")
    //Need to add data-qa-id 18/04/22
    //@FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='button-save']:not([data-qa-id='table-controls-disabled'])")
    public WebElement OkBtn;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='table-controls-btn-yes']")
    public WebElement OkBtnContragent;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-go']")
    public WebElement goBtn;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-go-to-card-file-of-holdings']")
    public WebElement goCardOfHoldingsBtn;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-pdv'] input")
    public WebElement pdvField;

    @FindBy(how=How.CSS, using = ".show-component .catalog [data-qa-id='button-select']")
    public WebElement btnCatalogOk;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-wrapper'] [data-qa-id='button-select']")
    public WebElement btnCatalogOkNew;
    @FindBy(how= How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-types-of-payments'] [data-qa-id='open-catalog-types-of-payments-btn']")
    public WebElement paymentTypeButton;
    @FindBy(how= How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='open-catalog-accounts-btn'], [data-qa-id='tab-content'] [data-qa-id='open-catalog-common-organization-account-btn']")
    public WebElement accountCatalogButton;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id*='catalog-storage'] [data-qa-id='open-catalog-storage-btn']")
    public WebElement storagePlaceBtn;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-financially-responsible-person'] [data-qa-id='open-catalog-financially-responsible-person-btn']")
    public WebElement mvoBtn;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-pdv'] [data-qa-id='open-catalog-pdv-btn']")
    public WebElement pdvBtn;
    @FindBy(how= How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-sources-of-financing-fss'] [data-qa-id='open-catalog-sources-of-financing-fss-btn']")
    public WebElement insuranceFinSourceBtn;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='open-catalog-common-organization-account-btn']")
    public WebElement ommOrgBtn;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-common-organization-account']")
    public WebElement ommOrg;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='pagination-menu-field']")
    public WebElement paginationMenuField;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='pagination-menu-arrow'] [value]")
    public List<WebElement> paginationMenuValues;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='first-page-arrow'] ")
    public WebElement firstPageArrow;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='previous-page-arrow'] ")
    public WebElement previousPageArrow;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='next-page-arrow'] ")
    public WebElement nextPageArrow;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='last-page-arrow'] ")
    public WebElement lastPageArrow;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='current-number-of-page'] ")
    public WebElement currNumberOfPage;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='max-count-of-pages'] ")
    public WebElement maxCountOfPages;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='pagination-field'] ")
    public WebElement paginationField;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='pagination-arrow'] ")
    public WebElement paginationArrow;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='buttons-main'] [data-qa-id='button-clear']")
    public WebElement btnClear;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='open-catalog-state-classifier-cpv-btn']")
    public WebElement classifierCvpBtn;


    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='table-controls-btn-yes']")
    public WebElement btnConfirmYes;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='button-close']")
    public WebElement closeBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='button-button-show-all-fields']")
    public WebElement showAllFieldsBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='button-save-store']")
    public WebElement saveSortBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='button-save-store'][data-qa-id2='active-btn']")
    public WebElement activeSaveSortBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='button-button-duplicate']")
    public WebElement duplicateBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='button-button-calculate']")
    public WebElement calculateButton;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='table-controls-btn-no']")
    public WebElement btnConfirmNo;

    //Object controls
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-save'],  .show-component [data-qa-id='button-save']")
    public WebElement saveButtonNew;


    //Temporary save button
    @FindBy(how=How.CSS, using = "[data-qa-id='modal-window'] [data-qa-id='button-modal-save-btn']")
    public List<WebElement> modalSaveButton;


    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='button-exit']")
    public WebElement 	exitButton;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-conduct']")
    public WebElement postButton;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-take-off-conduct']")
    public WebElement pickUpButton;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='page-of-widgets']")
    public WebElement pageOfWidgets;

    @FindBy(how=How.CSS, using = "[data-qa-id='head-name']")
    public WebElement HeadShrtName;

    @FindBy(how=How.CSS, using = ".show-component .control-panel .input-container span:last-of-type")
    public WebElement fldPanel;

    @FindBy(how=How.CSS, using = ".show-component .controls-item-next")
    public WebElement btnNxtPage;
    @FindBy(how=How.CSS, using = "[data-qa-id='head-email']")
    public WebElement HeadEmail;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-select']")
    public WebElement selectListBtn;
    @FindBy(how=How.CSS, using = ".show.loader-wrapper")
    public WebElement LoaderWrapper;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='table-controls-btn-yes']")
    public WebElement WeirdModalBtn;

    //Need to add data-qa-id 24/06/22
    @FindBy(how=How.CSS, using ="[data-qa-id='tab-content'] [data-qa-id='modal-alerts'] .modal-alerts-common, [data-qa-id='tab-content'] [data-qa-id='modal-alerts'] .modal-alerts-list div:nth-child(1), [data-qa-id='tab-content'] [data-qa-id='modal-confirm-message'], [data-qa-id='tab-content'] [data-qa-id='modal-alerts-list'], [data-qa-id='tab-content'] [data-qa-id='modal-confirm-message']")
    public WebElement modalAllertTextNew;

    @FindBy(how=How.CSS, using = "div[data-qa-id='notification-title']")
    public WebElement cornerAllertText;
    @FindBy(how=How.CSS, using = "div[data-qa-id='notification-title']")
    public List<WebElement> cornerAlerts;

    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='modal-alerts-common']")
    public WebElement modalAlertText;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='clear-catalog-sources-of-financing-btn']")
    public WebElement clearFinOfSource;

    @FindBy(how=How.CSS, using = "[data-qa-id='modal-alerts-list'] div, [data-qa-id='modal-alerts-common']")
    public WebElement cornerAllertList;
    @FindBy(how=How.CSS, using = "[data-qa-id='modal-alerts-list'] div")
    public  List<WebElement> cornerAlertsList;
    @FindBy(how=How.CSS, using = ".show-component .catacatalogListObjectNewog tbody .active-row td")
    public List<WebElement> modalActiveRow;
    //Changes 25/05/22
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-table'] [data-qa-id2='selected-row'] [data-qa-id='table-td']")
    public List<WebElement> modalActiveRowNew;

    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='catalog-table'] [data-qa-id='table-body'] div")
    public List<WebElement> tableCatalog;
    //@FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] .selected-row [data-qa-id='table-td']:not(.box-is-group-container)")
    @FindBy(how=How.CSS, using = "[data-qa-id='modal-window'] [data-qa-id2='selected-row'] [data-qa-id='table-td']:not(.box-is-group-container)")
    public List<WebElement> kekvActiveRowNew;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='table-tr'] > [data-qa-id='table-td']:nth-child(4)")
    public List<WebElement> TableListOfOperationAccs;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id2='selected-row'] [data-qa-id='table-td']:nth-child(1) [data-qa-id='cell-folder']")
    public WebElement ActiveGroupNew;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id2='selected-row']")
    public WebElement selectedRow;

    @FindBy(css = "[data-qa-id='tab-content'] div [data-qa-id='cell-folder']")
    public List<WebElement> mainCallFolder;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-td']:nth-child(1) [data-qa-id='cell-folder']")
    public List<WebElement> callFolder;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='table-td']:nth-child(1) [data-qa-id='cell-folder']")
    public List<WebElement> modalCallFolder;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='table-td']:nth-child(1) ")
    public List<WebElement> modalListObject;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='entries-table-column-debit'] [data-qa-id2='catalogs-field']")
    public List<WebElement> analyticsDt;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='entries-table-column-credit'] [data-qa-id2='catalogs-field']")
    public List<WebElement> analyticsCt;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-copy']")
    public WebElement copyAccounts;
    @FindBy(xpath = "//div[@data-qa-id='catalog-table'] //div[not(contains(@data-qa-id, 'table-tr-group'))] /div[@data-qa-id='table-td'][1]")
    public List<WebElement> tdNotContainsGroup;


    //new BD
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='entries-table-column-debit'] [data-qa-id='analytics-catalog-accounts'] input")
    public WebElement analyticsDtAccount;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='entries-table-column-credit'] [data-qa-id='analytics-catalog-accounts'] input")
    public WebElement analyticsCtAccount;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='field-subgroup']")
    public WebElement subgroupField;
    @FindBy(how=How.CSS, using = "[data-qa-id='modal-window'] tr[data-id] td:nth-child(2)")
    //Need to add data-qa-id and new catalog 10/05/22
    //@FindBy(how=How.CSS, using = "[data-qa-id='modal-window'] [data-qa-id='table-tr'] [data-qa-id='table-td']:nth-child(2)")
    public List<WebElement> OldRefBookA;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-wrapper'] [data-qa-id='button-search-input']")
    public WebElement catalogSearchFieldNew;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='button-search-input']")
    public WebElement modalSearchFieldNew;
    @FindBy(how=How.CSS, using = "[data-qa-id='app-search-input']")
    public WebElement appSearchInput;
    @FindBy(how=How.CSS, using = "[data-qa-id='app-search']")
    public WebElement appSearch;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-search-input']")
    public WebElement catalogSearchFieldMain;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-search-input']")
    public List<WebElement> catalogSearchFields;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-wrapper'] [data-qa-id='button-search-clear']")
    public WebElement catalogSearchClear;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='button-search-clear']")
    public WebElement searchClearBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-tr-group']")
    public List<WebElement> groupTr;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='catalog-inventory-card'] [data-qa-id='open-catalog-inventory-card-btn']")
    public WebElement objectBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='catalog-procedures'] [data-qa-id='open-catalog-procedures-btn']")
    public WebElement procedureBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='table-tr-group']")
    public List<WebElement> modalGroupTr;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id*='table-tr']")
    public List<WebElement> rowTr;
    @FindBy(css = "[data-qa-id='tab-content'] [data-testid='page-header-title']")
    public WebElement pageHeaderTitle;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-wrapper'] [data-qa-id='button-search-submit']")
    public WebElement catalogSearchButtonNew;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-search-submit']")
    public WebElement catalogSearchButtonMain;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='button-search-submit']")
    public WebElement searchButtonModal;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-search-submit']")
    public List<WebElement> catalogSearchButtons;
    //Changes 08/04/22 OLd catalog
    @FindBy(how=How.CSS, using = ".show-component .catalog .list-box td:nth-child(1)")
    public List<WebElement> catalogListObject;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-wrapper'] [data-qa-id='catalog-table'] [data-qa-id='table-td']:nth-child(1)")
    public List<WebElement> catalogListObjectNew;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='table-tr'] [data-qa-id='table-td']:nth-child(1)")
    public List<WebElement> modalWindowListObject;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='field-catalog-accounting-account'] [data-qa-id='open-field-catalog-accounting-account-btn']")
    public WebElement accountCatalogueButton;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='table-tr'] [data-qa-id='table-td']:nth-child(2)")
    public List<WebElement> modalWindowListObject_B;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='table-tr'] [data-qa-id='table-td']:nth-child(3)")
    public List<WebElement> modalWindowListObject_C;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='table-tr'] [data-qa-id='table-td']:nth-child(4)")
    public List<WebElement> modalWindowListObject_D;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='entries-button-replace-analytics-with-debit']")
    public List<WebElement> anDtEntries;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='table-tr']")
    public List<WebElement> windowListObjectTr;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='table-tr'] [data-qa-id='table-td']")
    public List<WebElement> modalWindowListObjectTd;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-wrapper'] [data-qa-id='catalog-table'] [data-qa-id='table-td']")
    public List<WebElement> catalogListObjectMain;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='field-document-number']")
    public WebElement FieldDocumentNumber;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='field-register-number']")
    public WebElement fieldRegisterNumber;

    @FindBy(how=How.CSS, using = "[data-qa-id2='selected-tab'] [data-qa-id='close-tab']")
    public WebElement TabCloserCross;
    @FindBy(how=How.CSS, using = "[data-qa-id2='selected-tab']")
    public WebElement selectedTab;
    @FindBy(how= How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='tab-accrual']")
    public WebElement accrualTab;
    @FindBy(css = "[data-qa-id='tab-content'] .table-wrapper-new [data-qa-id2='selected-row'] [data-qa-id='table-td']:nth-child(5) [data-qa-id='cell-body']")
    public WebElement actualHours;
    @FindBy(css = "[data-qa-id='tab-content'] .table-wrapper-new [data-qa-id2='selected-row'] [data-qa-id='table-td']:nth-child(7)")
    public WebElement actualDays;
    @FindBy(css = "[data-qa-id='tab-content'] .table-wrapper-new [data-qa-id2='selected-row'] [data-qa-id='table-td']:nth-child(4) [data-qa-id='cell-body']")
    public WebElement planHours;
    @FindBy(css = "[data-qa-id='tab-content'] .table-wrapper-new [data-qa-id2='selected-row'] [data-qa-id='table-td']:nth-child(6)")
    public WebElement planDays;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='table-tr']")
    public List<WebElement> ListObject;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] .td-status-content")
    public List<WebElement> statusContent;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-tr']")
    public WebElement oneListObject;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='open-catalog-cashbox-btn']")
    public WebElement cashBoxBtn;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='table-tr-sum'] [data-qa-id='table-td']")
    public List<WebElement> ListObjectSum;
    @FindBy(css = "[data-qa-id='tab-content'] tbody td")
    public List<WebElement> tableTd;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='open-catalog-period-btn']")
    public WebElement catalogPeriodBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='open-catalog-unit-btn']")
    public WebElement catalogDepartmentBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='button-apply']")
    public WebElement applyBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='button-toggle-search']")
    public WebElement toggleSearchBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-thead'] [data-qa-id='filter-cell'] [data-qa-id='button-open-filter']")
    public List<WebElement> filterToggles;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-thead'] div:nth-child(7) [data-qa-id='filter-cell'] div")
    public WebElement filterCallPeriod;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-thead'] div:nth-child(2) [data-qa-id='filter-cell'] div")
    public WebElement filterCallBases;
    @FindBy(css = "[data-qa-id='tab-content']  [data-qa-id='open-catalog-salary-bases-type-btn']")
    public WebElement basesBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-thead'] div:nth-child(6) [data-qa-id='filter-cell'] div")
    public WebElement filterCallDepartment;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-thead'] div:nth-child(1) [data-qa-id='filter-cell'] div")
    public WebElement filterCallPeriodRpv;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-thead'] div:nth-child(3) [data-qa-id='filter-cell'] div")
    public WebElement filterCallDepartmentRpv;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-thead'] div:nth-child(8) [data-qa-id='filter-cell'] div")
    public WebElement filterCallType;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-thead'] [data-qa-id='filter-cell'] div")
    public List<WebElement> filterFields;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='field-filter-2'] option")
    public List<WebElement> fieldFilterOptions;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='field-first']")
    public WebElement sortField;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='field-second']")
    public WebElement secondSortField;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-tr'] [data-qa-id='table-td']:nth-child(3)")
    public List<WebElement> ListObjectTd_C;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-tr'] [data-qa-id='table-td']:nth-child(4)")
    public List<WebElement> ListObjectTd_D;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-tr'] [data-qa-id='table-td']:nth-child(5)")
    public List<WebElement> ListObjectTd_E;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-tr'] [data-qa-id='table-td']:nth-child(6)")
    public List<WebElement> ListObjectTd_F;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-tr'] [data-qa-id='table-td']:nth-child(7)")
    public List<WebElement> ListObjectTd_G;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-tr'] [data-qa-id='table-td']:nth-child(2)")
    public List<WebElement> ListObjectTd_B;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-tr'] [data-qa-id='table-td']:nth-child(1)")
    public List<WebElement> ListObjectTd_A;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-tr'] [data-qa-id='table-td']:nth-child(1) [data-qa-id='cell-body']")
    public List<WebElement> CallBodyTd;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='button-button-clear']")
    public WebElement clearBasesBtn;


    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='entries-table-cell-account-analytics-debit'] button[data-qa-id*='open-analytics']")
    public List<WebElement> analyticsDebitBtns;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='entries-table-cell-account-analytics-debit'] [data-testid='field-catalog'] button")
    public List<WebElement> anDtBtns;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='entries-table-cell-account-analytics-credit'] [data-testid='field-catalog'] button")
    public List<WebElement> anCtBtns;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='entries-table-cell-account-analytics-debit'] button[data-qa-id='open-analytics-catalog-contracts-btn']")
    public WebElement anDtContract;

    @FindBy(xpath = "//div[@data-qa-id='tab-content']  //button[@data-qa-id='button-all-events'] /../div/button")
    public List<WebElement> allBtnsInAllEventsMenu;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='table-tr'] [data-qa-id='table-td']")
    public List<WebElement> ListObjectTd;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='table-tr'] [data-qa-id='table-td'] div")
    public List<WebElement> ListObjectTdTitle;
    @FindBy(how=How.XPATH, using = "//div[@data-qa-id ='tab-personal'] / ../../div[5]/div[@class='catalog']//table[@class='table-body']//td[1]")
    public List<WebElement> catalogListObjectSpecX;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-wrapper'] [data-qa-id='catalog-table'] [data-qa-id='table-td']:nth-child(2)")
    public List<WebElement> catalogListObjectA_New;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-wrapper'] [data-qa-id='catalog-table'] [data-qa-id='table-td']:nth-child(2) :not([title='0'])")
    public List<WebElement> codeNotNull;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-wrapper'] [data-qa-id='catalog-table'] [data-qa-id='table-tr']:nth-child(1) [data-qa-id='table-td']:nth-child(2) div")
    public WebElement catalogListWaitObject;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='catalog-wrapper'] [data-qa-id='catalog-table'] [data-qa-id='table-tr']")
    public List<WebElement> listObjectNotGroup;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='catalog-wrapper'] [data-qa-id='catalog-table'] [data-qa-id='table-tr'] [data-qa-id='table-td']:nth-child(1)")
    public List<WebElement> listObjNotGroup;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-wrapper'] [data-qa-id='catalog-table'] [data-qa-id='table-td']:nth-child(3)")
    public List<WebElement> catalogListObjectB_New;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='main-table-wrapper'] [data-qa-id='table-td']:nth-child(3)")
    public WebElement catalogObjectB_New;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-td']:nth-child(4)")
    public List<WebElement> catalogListObjectC_New;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-td']:nth-child(5)")
    public List<WebElement> catalogListObjectD_New;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-td']:nth-child(6) div")
    public List<WebElement> catalogListObjectE_New;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-td']:nth-child(7)")
    public List<WebElement> catalogListObjectG;

    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-td']:nth-child(10)")
    public List<WebElement> listObjects10;
    @FindBy(how=How.CSS, using = ".show-component .list-box .active-row td")
    public List<WebElement> activeRowTbody;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id2='selected-row']")
    public WebElement selectedRowTbody;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-body'] [data-qa-id='table-tr']:nth-child(1)")
    public WebElement firstTR;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='button-button-change-user']")
    public WebElement changeAcc;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='open-catalog-view-38-btn'], [data-qa-id='tab-content'] [data-qa-id='open-catalog-physical-persons-btn']")
    public WebElement ipnBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='table-td']:nth-child(5) div")
    public List<WebElement> accSumColumn;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id2='selected-row'] [data-qa-id='table-td']")
    public List<WebElement> activeRowTbodyNew;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id2='selected-row'] [data-qa-id='table-td']")
    public List<WebElement> selectedModalWindowRow;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id2='selected-row'] [data-qa-id='table-td'] div")
    public List<WebElement> selectedRowNew;
    @FindBy(xpath = "//div[@data-qa-id='tab-content']  //div[@data-qa-id2='selected-row'] //div[@data-qa-id='table-td'] //div[not(contains(@title, 'Відредагований запис'))]")
    public List<WebElement> specSelectedRow;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id2='selected-row'] [data-qa-id='table-td'] div[data-qa-id='cell-body-posted']")
    public WebElement selectedPostedDiv;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id2='selected-row'] [data-qa-id='table-td'] input")
    public WebElement selectedInput;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id2='selected-row'] [data-qa-id='table-td']")
    public List<WebElement> catalogSelectedRow;
    @FindBy(how=How.CSS, using = "[data-qa-id='modal-window'] [data-qa-id2='selected-row'] [data-qa-id='table-td']")
    public List<WebElement> SelectedList;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='tab-main']")
    public WebElement tabInit;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='tab-nomenclature']")
    public WebElement tabNomen;
    @FindBy(css = "[data-qa-id='tab-content'] [data-elem-type='number']")
    public List<WebElement> modalNumberFields;
    @FindBy(css = "[data-qa-id='tab-content'] [data-elem-type='number']")
    public WebElement numberFields;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='tab-entry']")
    public WebElement tabPosts;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='button-save']")
    public WebElement ModalOkGreenBtn;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='button-create']")
    public WebElement ModalCreateBtn;
    @FindBy(css = "[data-qa-id='modal-window'] [data-qa-id='table-thead'] span:nth-child(1)")
    public List<WebElement> modalTableHeaders;
    @FindBy(how=How.CSS, using = "[data-qa-id='modal-window'] [data-qa-id='table-body'] [data-qa-id='table-tr']")
    public List<WebElement> modalTableRows;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='button-download']")
    public WebElement downloadButton;
    @FindBy(how=How.CSS, using = "[data-qa-id='modal-window'] [data-qa-id='field-file']")
    public WebElement csvFileInput;
    @FindBy(how=How.CSS, using = ".show-component .select-pages")
    public WebElement DropDown;
    @FindBy(css = "[data-qa-id='button-import']")
    public WebElement importBtn;
    @FindBy(css = "[data-qa-id='field-is-headlines']")
    public WebElement firstLineHeadersInput;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='import-core-button-example']")
    public WebElement downloadExampleLink;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-add']")
    public WebElement btnNumenclatAdd;
    @FindBy(how=How.CSS, using = ".show-component .table-controls .table-controls-btn-add + div:not(.green)")
    public WebElement btnNumenclatEdit;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-delete']")
    public WebElement btnNumenclatDelete;
    @FindBy(how=How.CSS, using = ".show-component .entries-main-table tbody td")
    public List<WebElement> ModalEntriesList;
    @FindBy(how=How.CSS, using = ".show-component .entries-main-table input")
    public WebElement ModalEntrySumValue;

    @FindBy(how=How.CSS, using = "[data-qa-id='modal-window'] [data-qa-id='button-cancel']")
    public WebElement modalClose;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='button-save']")
    public WebElement modalSaveNew;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='button-save']")
    public List<WebElement> modalSaveBtns;
    @FindBy(css = "[data-qa-id='salary-holiday-master-tab']")
    public WebElement salHolidayTab;
    @FindBy(css = "[data-qa-id='salary-holiday-mngmnt-tab'] [data-qa-id='close-tab']")
    public WebElement salHolidayClose;
    @FindBy(css = "[data-qa-id='salary-sick-leave-master-tab']")
    public WebElement sickLeaveTab;
    @FindBy(css = "[data-qa-id='salary-sick-leave-mngmnt-tab'] [data-qa-id='close-tab']")
    public WebElement sickLeaveClose;
    @FindBy(css = "[data-qa-id='close-tab']")
    public List<WebElement> tabCloser;
    @FindBy(how=How.CSS, using = ".show-component .entries-amount-cell input, .show-component .entries-table-body .entries-table-column-sum")
    public List<WebElement> entrySummary;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='entries-table-body'] [data-qa-id='entries-table-column-sum']")
    public List<WebElement> entrySummaryNew;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id*='entries-table-cell-account-analytics']")
    public List<WebElement> entryTableCell;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='entries-table-body'] [data-qa-id='entries-table-column-debit']")
    public List<WebElement> entryDbColumns;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='entries-table-body'] [data-qa-id='entries-table-column-debit']")
    public WebElement analyticsCheckBox;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='entries-table-column-debit'] [data-qa-id='analytics-catalog-accounts'] [data-qa-id='open-analytics-catalog-accounts-btn']")
    public WebElement debitAccountButton;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-add-entry-accounting']")
    public WebElement accountingDropBtn;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-add-entry-administrative']")
    public WebElement administrativeDropBtn;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-add-entry']")
    public WebElement accountingAddBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='button-add-group']")
    public WebElement addGroupBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='drop-down-add-group']")
    public WebElement dropDownAddGroupBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='field-name'], [data-qa-id='field-full-name'], [data-qa-id='field-full_name'], [data-qa-id='field-account-name']")
    public WebElement nameField;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='catalog-storage']")
    public WebElement savePlace;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='field-short_name']")
    public WebElement shortNameField;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='open-catalog-measure-btn']")
    public WebElement measureCatalogBtn;
    @FindBy(css = "[data-qa-id='open-catalog-storage-places-btn'], [data-qa-id='open-catalog-nomenclature-works-and-services-btn'], [data-qa-id='open-catalog-contractors-btn']")
    public WebElement groupCatalogBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='open-catalog-storage-places-btn']")
    public WebElement expPlaceBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='open-catalog-storage-btn']")
    public WebElement storageBtn;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='entries-table-column-credit'] [data-qa-id='analytics-catalog-accounts'] [data-qa-id='open-analytics-catalog-accounts-btn']")
    public WebElement creditAccountButton;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='table-thead'] span:not(.sortable-field)")
    public List<WebElement> headerLineNew;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window']")
    public List<WebElement> modalWindow;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window']")
    public WebElement modWindow;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='button-all-events']")
    public WebElement allEventsMenu;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='all-event-delete']")
    public WebElement allEventsDelete;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='drop-down-list'] [data-qa-id*='all-event-export']")
    public WebElement exportInMenu;
    @FindBy(css = "[data-qa-id='tab-content'] .drop-down-item.button-icon-e-data")
    public WebElement innerMenu;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='button-export-act-invoice']")
    public WebElement actExportBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='button-export-specifications']")
    public WebElement specExportBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='all-event-export']")
    public WebElement allEventsExport;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-item-loading']")
    public WebElement loadingSpinnerNew;
    @FindBy(how=How.CSS, using = "[data-qa-id='load-window']")
    public WebElement loadWindow;
    public By loadingSpinner2 = new By.ByCssSelector("[data-qa-id='tab-item-loading']");

    //data table
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='table-thead'] [data-qa-id='td-select-all']")
    public WebElement dataTableSelectAll;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='table-thead'] [data-qa-id='td-select-all']")
    public WebElement dataTableSelectAllModal;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='table-thead'] div div:nth-child(1)")
    public List<WebElement> tableHeaderColumns;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='table-thead'] div div:nth-child(2)")
    public List<WebElement> tableHeaderGroup;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='table-thead'] span")
    public List<WebElement> tableHeaderTitles;
    @FindBy(css = "[data-qa-id='table-thead'] [data-qa-id*='sort']")
    public WebElement tableHeaderSort;


    //Need to add one more path 30/06/22
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='table-thead'] span:nth-child(1)") //[data-qa-id='tab-content'] [data-qa-id='table-core'] span:nth-child(1)
    public List<WebElement> dataTableHeadersNew;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content']  [data-qa-id='modal-window']  [data-qa-id='table-thead'] span:nth-child(1)") //[data-qa-id='tab-content'] [data-qa-id='table-core'] span:nth-child(1)
    public List<WebElement> dataTableHeadersModal;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='table-tr']")
    public List<WebElement> dataTableRows;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='table-body'] [data-qa-id='table-tr']")
    public List<WebElement> dataTableRowsNew;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='table-body'] [data-qa-id='table-tr']")
    public List<WebElement> dataTableRowsModal;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='table-body']")
    public WebElement modalTableBody;

    @FindBy(css = "[data-qa-id='tab-content'] .calendar-day-record")
    public List<WebElement> recordCalendarDey;

    @FindBy(css = "[data-qa-id='modal-window'] [data-qa-id='field-evening-hours-hours']")
    public WebElement eveningHoursField;

    @FindBy(css = "[data-qa-id='modal-window'] [data-qa-id='field-evening-hours-minutes']")
    public WebElement eveningMinutesField;

    @FindBy(css = "[data-qa-id='modal-window'] [data-qa-id='field-night-hours-hours']")
    public WebElement nightHoursField;

    @FindBy(css = "[data-qa-id='modal-window'] [data-qa-id='field-night-hours-minutes']")
    public WebElement nightMinutesField;

    //@FindBy(css = "[data-qa-id='modal-window'] [data-qa-id='field-overtime-hours-hours']")
    @FindBy(css = "[data-qa-id='modal-window'] [data-qa-id='field-result-overtime'] input:nth-child(1)")
    public WebElement overtimeHoursField;

    @FindBy(css = "[data-qa-id='modal-window'] [data-qa-id='field-overtime-hours-minutes']")
    public WebElement overtimeMinutesField;

    //@FindBy(css = "[data-qa-id='modal-window'] [data-qa-id='field-holiday-hours-hours']")
    @FindBy(css = "[data-qa-id='modal-window'] [data-qa-id='field-result-holidays'] input:nth-child(1)")
    public List<WebElement> holidayHoursField;

    @FindBy(css = "[data-qa-id='modal-window'] [data-qa-id='field-holiday-hours-minutes']")
    public WebElement holidayMinutesField;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-edit-entry']")
    public WebElement editEntryBtn;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-remove-entry']")
    public WebElement removeEntryBtn;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-to-form']")
    public WebElement generateForm;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='main-table-wrapper'] [data-qa-id='table-body'] [data-qa-id='table-tr']")
    public List<WebElement> getListWithTableCore;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='field-number']")
    public WebElement fieldNumber;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='field-object-number']")
    public WebElement fieldObjectNumber;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='checkbox']")
    public List<WebElement> checkboxes;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='create_title_page']")
    public WebElement titlePageCheckboxe;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='checkbox']")
    public WebElement checkbox;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-modal-window'] [data-qa-id='checkbox']")
    public List<WebElement> modalCheckBoxes;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='modal-window'] [data-qa-id='checkbox']")
    public List<WebElement> modalCB;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id2='selected-row'] [data-qa-id='checkbox']")
    public WebElement selectedCheckboxes;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='button-button-auto-spread']")
    public WebElement autoFillBtn;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='field-template']")
    public WebElement fieldTemplate;

    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='field-sum']")
    public WebElement fieldSum;
    @FindBy(how=How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='field-object']")
    public WebElement fieldObject;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id *='field-sum']")
    public List<WebElement> sumFields;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id ='button-full-screen']")
    public WebElement fullScreenBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='open-catalog-code-of-funds-btn']")
    public WebElement codeCatalogBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='catalog-code-of-funds'] input")
    public WebElement codeCatalogInput;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='open-catalog-sources-of-financing-btn']")
    public WebElement financingSourceCatalogBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='catalog-sources-of-financing']")
    public WebElement financingSource;
    @FindBy(how= How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='catalog-kekv'] [data-qa-id='open-catalog-kekv-btn']")
    public WebElement kekvCatalogBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='catalog-kekv'] input")
    public WebElement kekvCatalogField;

    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='export-modal-window']")
    public WebElement reportModalWindow;

    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='catalog-personal-accounts'] [data-qa-id='open-catalog-personal-accounts-btn']")
    public WebElement personalAccBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='field-notes']")
    public WebElement fieldNotes;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='field-note']")
    public WebElement fieldNote;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='open-catalog-downtime-payment-procedure-btn']")
    public WebElement payProcDowntimeBtn;
    @FindBy(how= How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='field-date-from']")
    public WebElement startDateInput;
    @FindBy(how= How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='field-date-to']")
    public WebElement endDateInput;
    @FindBy(how= How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='field-opening-date']")
    public WebElement openingDateInput;
    @FindBy(how= How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='field-closing-date']")
    public WebElement closingDateInput;
    @FindBy(how= How.CSS, using = "[data-qa-id='tab-content'] [data-qa-id='field-date-of-disablement-sheet']")
    public WebElement disablementSheetDate;

    @FindBy(css = "[data-qa-id='tab-content'] [data-testid='CalendarIcon']")
    public List<WebElement> calendarIcn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='field-first']")
    public List<WebElement> calendarInput;

    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='clear-catalog-commissions-btn']")
    public WebElement clearBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='tab-statement']")
    public WebElement tabStatementBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='button-button-import-from-dbf']")
    public WebElement importDbf;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id^='clear-catalog']")
    public List<WebElement> clearBtns;
    @FindBy(css = "[data-qa-id='modal-window'] [data-testid='CalendarIcon']")
    public List<WebElement> modalCalendarIcn;
    @FindBy(css = "[data-qa-id='modal-window'] [data-testid='CalendarIcon']")
    public WebElement modalCalIcn;
    @FindBy(css = "[aria-current='date']")
    public WebElement Today;
    @FindBy(css = "[role='rowgroup'] button")
    public List<WebElement> day;
    @FindBy(css = "[aria-current='date'] + button")
    public WebElement nextDay;
    @FindBy(css = "[aria-selected='false']:not([aria-current ='date'])")
    public List<WebElement> nonSelectedDays;

    @FindBy(css = "[data-testid='ArrowRightIcon']")
    public WebElement arrowRightBtn;
    @FindBy(css = "[role='grid'] [type='button']")
    public WebElement calendarDay;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='datepicker-date']")
    public WebElement fieldDPSelector;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='date_start']")
    public WebElement dateFrom;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='date_end']")
    public WebElement dateEnd;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='open-catalog-contractors-btn']")
    public WebElement contractorBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='catalog-contractors']")
    public WebElement contragent;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='open-catalog-contracts-btn']")
    public WebElement contractBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='catalog-contracts']")
    public WebElement contract;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='open-catalog-nomenclature-works-and-services-btn']")
    public WebElement nomenclatureWorksBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='open-catalog-view-46-btn']")
    public WebElement physPersonBtn;

    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='open-catalog-physical-persons-btn']")
    public WebElement physPersonBtnNew;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='catalog-physical-persons'] input")
    public WebElement physPersonField;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='open-catalog-positions-btn']")
    public WebElement positionBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id*='open-catalog']")
    public WebElement catalogBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='field-base-number']")
    public WebElement baseNumberField;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='open-catalog-common-organization-account-btn']")
    public WebElement orgAccBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='open-catalog-kdb-btn']")
    public WebElement kdbBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='open-catalog-concentration-accounts-btn']")
    public WebElement concentrationAccBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='catalog-concentration-accounts']")
    public WebElement concentrationAcc;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='modal-header']")
    public WebElement modalHeader;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='field-quantity']")
    public WebElement quantityField;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='open-catalog-view-20022-btn']")
    public WebElement objectTypeBtn;

    //transaction arrows
    @FindBy(xpath = ".//button[not(self::node()[@disabled=''])][contains(@data-qa-id,'replace-analytics-with-debit')]")
    public List<WebElement> availableDebitArrows;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='entries-button-replace-code-with-debit']")
    public List<WebElement> entriesDebitArrows;
    @FindBy(xpath = ".//button[not(self::node()[@disabled=''])][contains(@data-qa-id,'replace-analytics-with-debit')] /..//input")
    public List<WebElement> debitValue;
    @FindBy(xpath = ".//button[not(self::node()[@disabled=''])][contains(@data-qa-id,'replace-analytics-with-debit')] /..//div/button")
    public List<WebElement> availableDebitBtn;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='entries-button-replace-all-with-debit']")
    public List<WebElement> allReplaceDebitArrow;

    @FindBy(xpath = ".//button[not(self::node()[@disabled=''])][contains(@data-qa-id,'replace-analytics-with-credit')]")
    public List<WebElement> availableCreditArrows;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='entries-button-replace-all-with-credit']")
    public List<WebElement> allReplaceCreditArrow;
    @FindBy(css = "[data-qa-id='tab-content'] [data-qa-id='entries-button-replace-code-with-credit']")
    public List<WebElement> entriesCreditArrows;
    @FindBy(xpath = ".//button[not(self::node()[@disabled=''])][contains(@data-qa-id,'replace-analytics-with-credit')] /..//input")
    public List<WebElement> creditValue;
    @FindBy(xpath = ".//button[not(self::node()[@disabled=''])][contains(@data-qa-id,'replace-analytics-with-credit')] /..//div/button")
    public List<WebElement> availableCreditBtn;
    @FindBy(css = "[data-qa-id='tab-content'] .catalog-field-search")
    public List<WebElement> catalogFieldіSearch;
    @FindBy(css = "[data-qa-id='tab-content'] .catalog-field-search")
    public WebElement catalogFieldSearch;
}
