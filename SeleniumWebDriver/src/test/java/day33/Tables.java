package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");

		int row = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr")).size();
		int col = driver.findElements(By.xpath("//table[@id='productTable']/thead//th")).size();

		int tablePages = driver.findElements(By.xpath("//ul/li")).size();
		
		for (int p = 1; p <= tablePages; p++) {
			if (p > 1) {
				driver.findElement(By.xpath("//ul/li["+p+"]")).click();
				for (int r = 1; r <= row; r++) {
					for (int c = 1; c <= col; c++) {
						String td = driver
								.findElement(By.xpath("//table[@id='productTable']//tr[" + r + "]/td[" + c + "]"))
								.getText();
						System.out.print(td + "\t");
						if (c == col)
							driver.findElement(
									By.xpath("//table[@id='productTable']//tr[" + r + "]/td[" + c + "]/input")).click();
					}
					System.out.println();
				}
			}
			
		}

	}
}
