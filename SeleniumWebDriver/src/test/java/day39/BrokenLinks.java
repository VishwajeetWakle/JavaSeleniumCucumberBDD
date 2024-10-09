package day39;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinks {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		int noOfBrokenLinks = 0;
		int nonBrokenLinks = 0;
		int exceptionOccures = 0;
		List<String> exceptionMsgs = new ArrayList<String>();
		for (WebElement a : links) {
			String url = a.getAttribute("href");
			if (url == null || url.isEmpty()) {
				System.out.println("Link not present Not possible to verify");
			} else {
				try {
					URL link = new URL(url);
					HttpURLConnection con = (HttpURLConnection) link.openConnection();
					con.connect();

					if (con.getResponseCode() >= 400) {
						//System.out.println("This is the broken link : " + url);
						noOfBrokenLinks++;
					} else {
						//System.out.println("This is not a broken link : " + url);
						nonBrokenLinks++;
					}

				} catch (Exception e) {
					//System.out.println(e.getMessage());
					exceptionMsgs.add(e.getMessage());
					exceptionOccures++;
				}

			}
		}

		System.out.println("Number of broken links : " + noOfBrokenLinks);
		System.out.println("Number of non broken links : " + nonBrokenLinks);
		System.out.println("Exception occured : "+exceptionOccures +" Error Messages : "+exceptionMsgs);

		driver.quit();
	}

}
