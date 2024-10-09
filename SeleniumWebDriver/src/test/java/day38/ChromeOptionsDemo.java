package day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo {

	public static void main(String[] args) {
		// ChromeOption Headless mode
		
		ChromeOptions options = new ChromeOptions();
		// options.addArguments("--headless");
		
		// SSL handling
		options.setAcceptInsecureCerts(true);
		
		// remove the msg of "Chrome is being controlled by automated test software."
		options.setExperimentalOption("excludeSwitches", new String [] {"enable-automation"});
		
		// incognito mode 
//		options.addArguments("--incognito");
		
		// add extentions
		File SelectorHub = new File("D:\\SDET Level 2\\TestProject\\CRX Files\\SelectorsHub.crx");
		options.addExtensions(SelectorHub);

		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		
		// 
		

	}
}
