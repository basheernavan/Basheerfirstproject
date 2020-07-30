package Pack14Webdriver;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickRadioButtons {
	@Test
	public void multipleCheckboxes() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tizag.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("HTML Tutorial")).click();		
		driver.findElement(By.linkText("HTML - Radio")).click();
		//driver.findElement(By.xpath("((//*[@class='display'])[2]//*[@name='food'])[1]")).click();
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[6]/input[2]")).click();
		//driver.findElement(By.cssSelector("body > table:nth-child(4) > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr > td > div:nth-child(14) > input[type=radio]:nth-child(6)")).click();
		
	}

}
