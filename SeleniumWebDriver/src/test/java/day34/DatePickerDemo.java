package day34;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Switching to frame
		
		driver.switchTo().frame("frame-one796456169");
		
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		
		String expectedDate = "20";
		String expectedMonth = "December";
		String expectedYear = "1999";
		
		// Selecting year
		Select years = new  Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		years.selectByVisibleText(expectedYear);
		
		// Selecting month
		while (true) {

			String visibleMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			// Compare month
			
			Month eMonth =  convertMonth(expectedMonth);
			Month vMonth = convertMonth(visibleMonth);
			
			int result = eMonth.compareTo(vMonth);
			
			if(result==0) {
				break;
			}else if(result>0) {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}else if(result<0) {
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			}
			
		}
		
		// Selecting Date
		
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td/a"));
		
		for(WebElement day : allDates) {
			System.out.println(day.getTagName());
			System.out.println(day.getText());
			if(day.getText().equals(expectedDate)) {
				System.out.println(day.getText());
				day.click();
			}
		}
		
		Thread.sleep(10000);
		

	}
	
	public static Month convertMonth(String month) {
		HashMap<String, Month> monthMap = new HashMap<String, Month>();
		
		monthMap.put("January", Month.JANUARY);
		monthMap.put("February", Month.FEBRUARY);
		monthMap.put("March", Month.MARCH);
		monthMap.put("April", Month.APRIL);
		monthMap.put("May", Month.MAY);
		monthMap.put("June", Month.JUNE);
		monthMap.put("July", Month.JULY);
		monthMap.put("August", Month.AUGUST);
		monthMap.put("September", Month.SEPTEMBER);
		monthMap.put("October", Month.OCTOBER);
		monthMap.put("November", Month.NOVEMBER);
		monthMap.put("December", Month.DECEMBER);
		
		Month vMonth = monthMap.get(month);
		
		if(vMonth == null) {
			System.out.println("Invalid Month.....");
		}
		
		return vMonth;
		
	}

}
