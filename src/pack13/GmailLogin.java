package pack13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {
	@Test
	public void gmailLogin() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.linkText("Gmail")).click();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("vardhan.kg");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[text()='Next']")).click();
		
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys(Keys.ENTER);
	}

}
