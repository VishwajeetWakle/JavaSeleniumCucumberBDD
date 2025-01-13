package retryMechanism.global;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class SampleTest {
	
    @Test()
    public void testMethod() {
        System.out.println("Executing test...");
        assert false : "Test failed intentionally!";
    }
    
    @Test
    public void testMethod2() {
    	System.out.println("Executing test 2...........");
    	assertEquals(false, false);
    }
}
