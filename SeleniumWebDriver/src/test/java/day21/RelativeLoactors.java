package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLoactors {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.opencart.com/");
		
		driver.findElement(RelativeLocator.with(By.tagName("img")).below(By.cssSelector("body > main:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(3) > div:nth-child(1)"))).click();
	
	}

}
