package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	static WebDriver driver;

	@Before
	public static void setUp() {
		if (driver == null) {
			driver = DriverUtil.getDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	}

	// Method to close WebDriver
	@After
	public static void tearDown() {
		DriverUtil.closeDriver();
	}
}
