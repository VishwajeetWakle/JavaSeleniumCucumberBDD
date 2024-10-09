package day43;

import org.testng.annotations.*;

public class AllAnnotations {
	
	@BeforeGroups
	void bGroup() {
		System.out.println("Before Group\n");
	}
	
	@BeforeSuite
	void bSuite() {
		System.out.println("Before Suite\n");
	}
	
	@BeforeTest
	void bTest() {
		System.out.println("Before Test\n");
	}
	
	@BeforeClass
	void bClass() {
		System.out.println("Before Class\n");
	}
	
	@BeforeMethod
	void bMethod() {
		System.out.println("Before Method\n");
	}
	
	@AfterGroups
	void aGroup() {
		System.out.println("After Group\n");
	}
	
	@AfterSuite
	void aSuite() {
		System.out.println("After Suite\n");
	}
	
	@AfterTest
	void aTest() {
		System.out.println("After Test\n");
	}
	
	@AfterClass
	void aClass() {
		System.out.println("After Class\n");
	}
	
	@AfterMethod
	void aMethod() {
		System.out.println("After Method\n");
	}

	@Test
	void t1() {
		System.out.println("Test 1\n");
	}
	
	@Test
	void t2() {
		System.out.println("Test 2\n");
	}
}
