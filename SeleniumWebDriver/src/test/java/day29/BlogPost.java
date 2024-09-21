package day29;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlogPost {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
/*		// 1. provide some string to search for it
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// 2. count number of links
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']/a"));
		System.out.println("Count of Links : "+links.size());
		
		// 3. click on each link using for loop
		for(WebElement a : links) {
			a.click();
		}
		
		// 4. Get Window ID's 
		Set<String> windowIds = driver.getWindowHandles();
		System.out.println(windowIds);
		
		// 5. Close specific windows
		for(String id : windowIds) {
			driver.switchTo().window(id);
			String title = driver.getTitle();
			if(title.equals("Selenium disulfide - Wikipedia") || title.equals("Selenium in biology - Wikipedia")) {
				System.out.println(title+" Is Closed");
				driver.close();
			}
		}*/
		
		// select last 3 check boxes on home page
		List<WebElement> checkboxs = driver.findElements(By.xpath("//div/input[@type='checkbox']"));
		
		// aproach 1st
		/*
		checkboxs.get(checkboxs.size()-1).click();
		checkboxs.get(checkboxs.size()-2).click();
		checkboxs.get(checkboxs.size()-3).click();
		*/
		//aproach 2nd
		for(int i=( checkboxs.size()-1 ); i>= 0; i-- ) {
			checkboxs.get(i).click();
			System.out.println(checkboxs.get(i).isSelected());
		}
		
	}
}
