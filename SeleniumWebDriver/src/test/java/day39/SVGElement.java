package day39;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElement {

	// SVG elements doesn't support standard XPath format.
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
		
		driver.findElement(By.xpath("//input[@placeholder='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		// Finding SVG element and performing click action on it
		// SVG elements are captured by name() method
		driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M422,332H9')]")).click();
		
		if(driver.findElement(By.xpath("//h6[normalize-space()='Select Employee']")).getText().equals("Select Employee")) System.out.println("Landed on Time Page...");

		driver.quit();
	}

}
