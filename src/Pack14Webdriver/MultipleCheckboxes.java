package Pack14Webdriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleCheckboxes {
	@Test
	public void multipleCheckboxes() {
		System.setProperty("webdriver.chrome.driver", "E:/SeleniumSoftwares/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tizag.com");
		
	}
	
	

}
