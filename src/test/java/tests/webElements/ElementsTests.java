package tests.webElements;

import core.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.authorization.LoginSteps;
import steps.webElements.ElementsSteps;

@DisplayName("Елементи на сайті")
public class ElementsTests extends BaseTest {

    @BeforeEach
    public void beforeEach(){
        driver.get(URL_DEV);
        steps.get(LoginSteps.class).login(ACC_MAIN_LOGIN, ACC_MAIN_PASSWORD);
    }

    @DisplayName("Інлайновий ввід")
    @Test()
    public void inlineInput(){
        steps.get(ElementsSteps.class).inlineLoader();
    }
}
