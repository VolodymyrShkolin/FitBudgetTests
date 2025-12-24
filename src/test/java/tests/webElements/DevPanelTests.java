package tests.webElements;

import core.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.authorization.LoginSteps;
import steps.oprationManagement.DevPanelManagementSteps;


@DisplayName("Сторінка для розробки")
public class DevPanelTests extends BaseTest {

    @BeforeEach
    public void beforeEach(){
        driver.get(URL_DEV);
        steps.get(LoginSteps.class).login(ACC_MAIN_LOGIN, ACC_MAIN_PASSWORD);
    }

    @DisplayName("All catalogs list")
    @Test
    public void allCatalogList(){
        steps.get(DevPanelManagementSteps.class).goToAllCatalogList();
    }

    @DisplayName("Catalogs choice table")
    @Test
    public void catalogsChoiceTable(){
        steps.get(DevPanelManagementSteps.class).goToCatalogsChoiceTable();
    }

    @DisplayName("Generation-from-html")
    @Test
    public void generationFromHtml(){
        steps.get(DevPanelManagementSteps.class).goToGenerationFromHtml();
    }

    @DisplayName("Inputs")
    @Test
    public void inputs(){
        steps.get(DevPanelManagementSteps.class).goToInputs();
    }

    @DisplayName("Rest - split-html")
    @Test
    public void restSplitHtml(){
        steps.get(DevPanelManagementSteps.class).goToRestSplitHtml();
    }

    @DisplayName("Tables - default")
    @Test
    public void tablesDefault(){
        steps.get(DevPanelManagementSteps.class).goToTablesDefault();
    }

    @DisplayName("Tables - sum")
    @Test
    public void TablesSum(){
        steps.get(DevPanelManagementSteps.class).goToTablesSum();
    }

    @DisplayName("Tables - validation")
    @Test
    public void TablesValidation(){
        steps.get(DevPanelManagementSteps.class).goToTablesValidation();
    }
}
