package Pack14Webdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateDropboxAccount {
	@Test
	public void multipleCheckboxes() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/SeleniumSoftwares/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dropbox.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("fname")).sendKeys("Vinay");
		//driver.findElement(By.xpath("//*[text()='Last name']")).sendKeys("lastname");
		//xpath is the unique property out of all locators
		driver.findElement(By.name("fname")).sendKeys(Keys.TAB, "Ruhul123");
		//driver.findElement(By.xpath("//label[contains(@for, 'lname')]")).sendKeys("pranay");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("test@admin.com");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys(Keys.TAB, Keys.TAB, Keys.SPACE);
		//driver.findElement(By.xpath("(//label[@class='checkbox_label'])[2]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='login-button button-primary']")).click();
		Thread.sleep(5000);
		
	}

}
