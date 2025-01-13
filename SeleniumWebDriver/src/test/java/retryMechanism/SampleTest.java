package retryMechanism;

import org.testng.annotations.Test;

public class SampleTest {

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testMethod() {
        System.out.println("Executing test...");
        // Example failure to trigger retry
        assert false : "Test failed intentionally!";
    }
}
