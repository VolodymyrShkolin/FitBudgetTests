package tests.sequentialTests;

import core.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junitpioneer.jupiter.RetryingTest;

@DisplayName("Послідовні тести")
public class ExampleSeqTests extends BaseTest {

    @DisplayName("example")
    @RetryingTest(2)
    public void example(){
        System.out.println("example");
    }
}
