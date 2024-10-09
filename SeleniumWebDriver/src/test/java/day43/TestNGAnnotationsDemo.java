package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationsDemo {

//	@BeforeMethod  // --> Executes before every test method of the class
//	@BeforeClass  // --> Executes before all test method of the class
	@BeforeTest // --> Executes before each test of testng.xml file
	void login() {
		System.out.println("Login");
	}
	
	@Test(priority = 1)
	void search() {
		System.out.println("Search");
	}
	
	@Test(priority = 2)
	void advanceSearch() {
		System.out.println("Advance Search");
	}
	
//	@AfterMethod // --> Executes after every test method of the class
//	@AfterClass // --> Executes before all test method of the class
	@AfterTest
	void logout() {
		System.out.println("Logout");
	}
	
	
}
