package tests.webElements;

import core.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Елементи на сайті")
public class ElementsTests extends BaseTest {

    @BeforeEach
    public void beforeEach(){
        steps.loginSteps().login(ACC_MAIN_LOGIN, ACC_MAIN_PASSWORD);
    }

    @DisplayName("Інлайновий ввід")
    @Test()
    public void inlineInput(){
        steps.elementsSteps().inlineLoader();
    }
}
