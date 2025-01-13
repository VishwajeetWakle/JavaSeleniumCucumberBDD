package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.WaitUtil;

public class HomePage {

	@FindBy(xpath = "//div[@data-testid=\"tray-container\"]")
	WebElement trayContainer; // All Rails Tray Container

	@FindBy(xpath = "//nav")
	WebElement navMenu;

	@FindBy(xpath = "//nav//a")
	List<WebElement> navMenuLinks;

	@FindBy(xpath = "//nav/child::div")
	List<WebElement> navMenuItems;

	@FindBy(xpath = "//nav/child::div[1]")
	WebElement navMySpace;

	@FindBy(xpath = "//nav/child::div[2]")
	WebElement navSearch;

	@FindBy(xpath = "//nav/child::div[3]")
	WebElement navHome;

	@FindBy(xpath = "//nav/child::div[4]")
	WebElement navTV;

	@FindBy(xpath = "//nav/child::div[5]")
	WebElement navMovies;

	@FindBy(xpath = "//nav/child::div[6]")
	WebElement navSports;

	@FindBy(xpath = "//nav/child::div[7]")
	WebElement navCategories;

	/*
	 * Footer Locators
	 */
	@FindBy(xpath = "//footer")
	WebElement footer;
	@FindBy(xpath = "//h4")
	List<WebElement> footerHeadings;
	@FindBy(xpath = "//h4[normalize-space()='Company']")
	WebElement footerCompany;
	@FindBy(xpath = "//h4[normalize-space()='Company']/following::li")
	List<WebElement> footerList;
	@FindBy(xpath = "//h4[normalize-space()='Company']/following::li//a")
	List<WebElement> footerLinks;
	@FindBy(xpath = "//h4[normalize-space()='Company']/following::li//a//div")
	List<WebElement> footerLinksDiv;
	@FindBy(css = ".ON_SURFACE_ALT_2.BODY4_MEDIUM")
	WebElement footerAllRightsRes;

	
	
	// Objects
	WebDriver driver;
	WaitUtil wait = new WaitUtil(driver, 30);
	
	
	

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // Initializes all @FindBy elements
	}

	public boolean isFooterDesplayed() {
		return wait.waitForElementToBeVisible(footer).isDisplayed();
	}

	public void clickOnFooterLink(String linkText) {
		boolean flag = true;
		if (flag) {
			for (WebElement e : wait.waitForElementsToBeClickable(footerLinksDiv)) {
				if (linkText.equalsIgnoreCase(e.getText())) {
					flag = false;
					e.click();
					break;
				}
			}
		}/*
		if (flag) {
			for (WebElement e : footerLinks) {
				if (linkText.equalsIgnoreCase(e.getText())) {
					e.click();
					break;
				}
			}
		}*/
	}

	public List<String> footerHeadingC() {
		List<String> text = new ArrayList<String>();
		for (WebElement e : footerHeadings) {
			try {
				text.add(e.getText());
			} catch (Exception e2) {
				text.add("");
			}
		}
		return text;
	}

}
