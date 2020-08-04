package Pack15WebDriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFrames {
	@Test
	public void testframes(){
		System.setProperty("webdriver.gecko.driver", "resources/drivers/gecko79/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
	}

}
