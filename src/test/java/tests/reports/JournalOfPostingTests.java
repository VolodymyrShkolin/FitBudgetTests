package tests.reports;

import core.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.authorization.LoginSteps;
import steps.reports.JournalOfPostingsSteps;


@DisplayName("Журнал проводок")
public class JournalOfPostingTests extends BaseTest {

    @BeforeEach
    public void beforeEach(){
        steps.get(LoginSteps.class).login(ACC_MAIN_LOGIN, ACC_MAIN_PASSWORD);
    }



    @DisplayName("Журнал проводок - Друк")
    @Test
    public void cashCost(){
       steps.get(JournalOfPostingsSteps.class).journalOfPosting();
    }

}
