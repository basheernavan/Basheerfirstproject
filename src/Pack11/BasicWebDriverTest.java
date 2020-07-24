package Pack11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebDriverTest {
	public static void main(String[] args) {
		//Set system property for chrome driver: 
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		
		//create object for webdriver:
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
	}

}
