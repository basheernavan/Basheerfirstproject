package Pack15WebDriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//https://github.com/mozilla/geckodriver/releases
public class VerifyGoogleAllIcons {
	@Test
	public void browserbuttons() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "resources/drivers/gecko79/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://google.com");
		driver.navigate().to("http://google.com");
		driver.findElement(By.xpath("//*[@title='Google apps']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div/c-wiz/div/div/c-wiz/div/div/ul[1]/li[1]/a/div/span")).click();
		
		
	}
	

}
