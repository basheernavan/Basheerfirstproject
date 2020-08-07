package Pack14Webdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownbox {
	@Test
	public void multipleCheckboxes() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.id("gh-cat")).click();
		driver.findElement(By.id("gh-cat")).sendKeys("Baby");
		
	}

}
