package Pack14Webdriver;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {
	@Test
	public void handleCheckboxes() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://tizag.com/");
		driver.manage().window().maximize();
		//create implicit wait option:
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("HTML Tutorial")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("HTML - Check")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input[1]")).click();
		driver.findElement(By.xpath("(//*[@value='baseball'])[1]")).click();
		driver.findElement(By.xpath("(//*[@value='baseball'])[2]")).click();
		
	}

}
