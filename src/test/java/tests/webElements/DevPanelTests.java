package tests.webElements;

import core.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.authorization.LoginSteps;
import steps.goTo.GoToDevPanelSteps;


@DisplayName("Сторінка для розробки")
public class DevPanelTests extends BaseTest {

    @BeforeEach
    public void beforeEach(){
        steps.get(LoginSteps.class).login(ACC_MAIN_LOGIN, ACC_MAIN_PASSWORD);
    }

    @DisplayName("All catalogs list")
    @Test
    public void allCatalogList(){
        steps.get(GoToDevPanelSteps.class).goToAllCatalogList();
    }

    @DisplayName("Catalogs choice table")
    @Test
    public void catalogsChoiceTable(){
        steps.get(GoToDevPanelSteps.class).goToCatalogsChoiceTable();
    }

    @DisplayName("Generation-from-html")
    @Test
    public void generationFromHtml(){
        steps.get(GoToDevPanelSteps.class).goToGenerationFromHtml();
    }

    @DisplayName("Inputs")
    @Test
    public void inputs(){
        steps.get(GoToDevPanelSteps.class).goToInputs();
    }

    @DisplayName("Rest - split-html")
    @Test
    public void restSplitHtml(){
        steps.get(GoToDevPanelSteps.class).goToRestSplitHtml();
    }

    @DisplayName("Tables - default")
    @Test
    public void tablesDefault(){
        steps.get(GoToDevPanelSteps.class).goToTablesDefault();
    }

    @DisplayName("Tables - sum")
    @Test
    public void tablesSum(){
        steps.get(GoToDevPanelSteps.class).goToTablesSum();
    }

    @DisplayName("Tables - validation")
    @Test
    public void tablesValidation(){
        steps.get(GoToDevPanelSteps.class).goToTablesValidation();
    }
}
