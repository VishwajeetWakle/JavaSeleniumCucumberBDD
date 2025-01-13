package stepDefinations;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import utilities.DriverUtil;

public class FooterSteps {

	WebDriver driver = DriverUtil.getDriver();
	HomePage homePage = new HomePage(driver);

	@Given("I am on the Hotstar home page")
	public void i_am_on_the_hotstar_home_page() {
		driver.get("https://www.hotstar.com/in/home");
	}

	@Then("I should see the footer")
	public void i_should_see_the_footer() {
		assertTrue(homePage.isFooterDesplayed());
	}

	@When("I click on the {string} link in the footer")
	public void i_click_on_the_link_in_the_footer(String string) {
		homePage.clickOnFooterLink(string);
	}

	@Then("I should be navigated to the About Us page")
	public void i_should_be_navigated_to_the_about_us_page() {
		Set<String> windows = driver.getWindowHandles();
		List<String> urls = new ArrayList<String>();
		for (String s : windows) {
			driver.switchTo().window(s);
			urls.add(driver.getCurrentUrl());
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println(urls);
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		assertTrue(urls.contains("https://www.hotstar.com/about-us/in"));
	}

	/*
	@Then("I should be navigated to the Careers page")
	public void i_should_be_navigated_to_the_careers_page() {
		Set<String> windows = driver.getWindowHandles();
		List<String> urls = new ArrayList<String>();
		for (String s : windows) {
			driver.switchTo().window(s);
			urls.add(driver.getCurrentUrl());
		}
			assertTrue(urls.contains("https://careers.hotstar.com/"));
		
	}

	@Then("I should be navigated to the Visit Help Center page")
	public void i_should_be_navigated_to_the_visit_help_center_page() {
		Set<String> windows = driver.getWindowHandles();
		List<String> urls = new ArrayList<String>();
		for (String s : windows) {
			driver.switchTo().window(s);
			urls.add(driver.getCurrentUrl());
		}
		assertTrue(urls.contains("https://help.hotstar.com/in/en/support/home"));
		
	}

	@Then("I should be navigated to the Share Feedback page")
	public void i_should_be_navigated_to_the_share_feedback_page() {
		Set<String> windows = driver.getWindowHandles();
		List<String> urls = new ArrayList<String>();
		for (String s : windows) {
			driver.switchTo().window(s);
			urls.add(driver.getCurrentUrl());
		}
		assertTrue(urls.contains("https://help.hotstar.com/in/en/support/tickets/feedback"));
	}

	@Then("I should be navigated to the Terms of Use page")
	public void i_should_be_navigated_to_the_terms_of_use_page() {
		Set<String> windows = driver.getWindowHandles();
		List<String> urls = new ArrayList<String>();
		for (String s : windows) {
			driver.switchTo().window(s);
			urls.add(driver.getCurrentUrl());
		}
		assertTrue(urls.contains("https://www.hotstar.com/tnc/in"));
	}

	@Then("I should be navigated to the Privacy Policy page")
	public void i_should_be_navigated_to_the_privacy_policy_page() {
		Set<String> windows = driver.getWindowHandles();
		List<String> urls = new ArrayList<String>();
		for (String s : windows) {
			driver.switchTo().window(s);
			urls.add(driver.getCurrentUrl());
		}
		assertTrue(urls.contains("https://www.hotstar.com/privacy-policy/in"));
	}

	@Then("I should be navigated to the FAQs page")
	public void i_should_be_navigated_to_the_fa_qs_page() {
		Set<String> windows = driver.getWindowHandles();
		List<String> urls = new ArrayList<String>();
		for (String s : windows) {
			driver.switchTo().window(s);
			urls.add(driver.getCurrentUrl());
		}
		assertTrue(urls.contains("https://help.hotstar.com/in/en/support/home"));
	}
	*/

}
