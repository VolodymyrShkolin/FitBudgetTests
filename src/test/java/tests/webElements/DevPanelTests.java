package tests.webElements;

import core.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Сторінка для розробки")
public class DevPanelTests extends BaseTest {

    @BeforeEach
    public void beforeEach(){
        steps.loginSteps().login(ACC_MAIN_LOGIN, ACC_MAIN_PASSWORD);
    }

    @DisplayName("All catalogs list")
    @Test
    public void allCatalogList(){
        steps.goToDevPanelSteps().goToAllCatalogList();
    }

    @DisplayName("Catalogs choice table")
    @Test
    public void catalogsChoiceTable(){
        steps.goToDevPanelSteps().goToCatalogsChoiceTable();
    }

    @DisplayName("Generation-from-html")
    @Test
    public void generationFromHtml(){
        steps.goToDevPanelSteps().goToGenerationFromHtml();
    }

    @DisplayName("Inputs")
    @Test
    public void inputs(){
        steps.goToDevPanelSteps().goToInputs();
    }

    @DisplayName("Rest - split-html")
    @Test
    public void restSplitHtml(){
        steps.goToDevPanelSteps().goToRestSplitHtml();
    }

    @DisplayName("Tables - default")
    @Test
    public void tablesDefault(){
        steps.goToDevPanelSteps().goToTablesDefault();
    }

    @DisplayName("Tables - sum")
    @Test
    public void tablesSum(){
        steps.goToDevPanelSteps().goToTablesSum();
    }

    @DisplayName("Tables - validation")
    @Test
    public void tablesValidation(){
        steps.goToDevPanelSteps().goToTablesValidation();
    }
}
