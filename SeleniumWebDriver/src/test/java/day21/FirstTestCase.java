package day21;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	/**
	 * Test Case
	 * Open Chrome Browser 
	 * Launch https://demo.opencart.com/
	 * Validate title "Your Store"
	 * Close Browser
	 */
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.opencart.com/");
		String actualTitle = driver.getTitle();
		String expectedtitle = "Your Store";
		if(actualTitle.equals(expectedtitle)) System.out.println("Test Pass");
		else System.out.println("Test Fail");
		driver.close();
		
		driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		actualTitle = driver.getTitle();
		expectedtitle = "Your Store";
		if(actualTitle.equals(expectedtitle)) System.out.println("Test Pass");
		else System.out.println("Test Fail");
		driver.close();
		
		driver = new EdgeDriver();
		driver.get("https://demo.opencart.com/");
		actualTitle = driver.getTitle();
		expectedtitle = "Your Store";
		if(actualTitle.equals(expectedtitle)) System.out.println("Test Pass");
		else System.out.println("Test Fail");
		driver.close();
		
		
	}
}
