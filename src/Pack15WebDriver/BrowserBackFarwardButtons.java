package Pack15WebDriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//https://github.com/mozilla/geckodriver/releases
public class BrowserBackFarwardButtons {
	@Test
	public void browserbuttons() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "resources/drivers/gecko79/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://google.com");
		driver.navigate().to("http://google.com");
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(2000);
		driver.navigate().back(); //it'll click browser back button
		Thread.sleep(2000);
		driver.navigate().forward(); //it'll click browser forward button
		
	}
	

}
