package pack12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "resources/drivers/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		driver.quit();
		
	}

}
