package tests.reports;

import core.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Журнал проводок")
public class JournalOfPostingTests extends BaseTest {

    @BeforeEach
    public void beforeEach(){
        steps.loginSteps().login(ACC_MAIN_LOGIN, ACC_MAIN_PASSWORD);
    }



    @DisplayName("Журнал проводок - Друк")
    @Test
    public void cashCost(){
       steps.journalOfPostingsSteps().journalOfPosting();
    }

}
