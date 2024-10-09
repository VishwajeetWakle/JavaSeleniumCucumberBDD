package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationsDemo2 {

//	@BeforeMethod  // --> Executes before every test method of the class
//	@BeforeClass  // --> Executes before all test method of the class
//	@BeforeTest // --> Executes before each test of testng.xml file
	void login() {
		System.out.println("Login 2");
	}
	
	
	@Test(priority = 1)
	void search() {
		System.out.println("Search of 2");
	}
	
	@Test(priority = 2)
	void advanceSearch() {
		System.out.println("Advance Search of 2");
	}
	
//	@AfterMethod // --> Executes after every test method of the class
//	@AfterClass // --> Executes before all test method of the class
//	@AfterTest // --> Executes after each test of testng.xml file
	void logout() {
		System.out.println("Logout 2");
	}
	
	
	@BeforeSuite
	void up() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	void down() {
		System.out.println("After Suite");
	}
}
