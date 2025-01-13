package parallel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ParallelTesting {
	
	@Test
	public void openChrome() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		System.out.print("On Chrome : ");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	@Test
	public void openFireFox() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		System.out.print("On FireFox : ");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	@Test
	public void openEdge() {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		System.out.print("On Edge : ");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
