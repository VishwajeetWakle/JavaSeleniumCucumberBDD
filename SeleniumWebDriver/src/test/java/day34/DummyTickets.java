package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DummyTickets {

	
	// 21 Sept 2024 -> Not Implemented 
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://dummy-tickets.com/");
		
		// Selecting flight & hotel both 
		driver.findElement(By.xpath("//a[text()='Both']")).click();
		
		WebElement roundTrip = driver.findElement(By.xpath("//input[@value='roundtripfh']"));
		if(roundTrip.isSelected()==false) roundTrip.click();
		
		driver.findElement(By.cssSelector("#flight_oneway > div.route_1.row.p-0.pt-3 > div:nth-child(2) > input")).sendKeys("p");
		
		driver.findElement(By.xpath("//ul[@class='suggestions-list']/li[3]")).click();
		
		driver.findElement(By.cssSelector("#flight_oneway > div.route_1.row.p-0.pt-3 > div:nth-child(2) > input")).sendKeys("b");
		
		driver.findElement(By.xpath("//ul[@class='suggestions-list']/li[3]")).click();
		
		List<WebElement> depature = driver.findElements(By.xpath("//div[@class='row p-0 pt-2']/div[@class='col-sm-12 p-0']/label[text()='Departure']"));
		
		depature.get(0).click();
		
		Thread.sleep(10000);

	}

}
