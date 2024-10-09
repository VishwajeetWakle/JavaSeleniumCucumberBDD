package day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenshotDemo {

	public static void main(String[] args) {
		
		
		// ChromeOption Headless mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://dummy-tickets.com/");
		
		// Full page screenshot after launching the application
		takeScreenshot(driver,"dummy-tickets-full-page.png");

		
		// take screenshot of web element
		takeScreenshotOfWeb(driver.findElement(By.xpath("//div[@class='contact_form_box_all type_five']")), "contact_form_box_all.png");
		
		
		// close browser
		driver.quit();
	}
	
	public static void takeScreenshotOfWeb(WebElement element, String fileName) {
		File fullPage = element.getScreenshotAs(OutputType.FILE);
		File fullPageTr = new File(System.getProperty("user.dir")+"\\screenshots\\"+fileName);
		fullPage.renameTo(fullPageTr);
	}
	
	
	public static void takeScreenshot(WebDriver driver, String fileName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File fullPage = ts.getScreenshotAs(OutputType.FILE);
		File fullPageTr = new File(System.getProperty("user.dir")+"\\screenshots\\"+fileName);
		fullPage.renameTo(fullPageTr);
	}

}
