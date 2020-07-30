package Pack14Webdriver;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCheckboxesStatus {
	@Test
	public void multipleCheckboxes() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tizag.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("HTML Tutorial")).click();
		driver.findElement(By.partialLinkText("HTML - Checkb")).click();
		
		String Sccorattrvalue = driver.findElement(By.xpath("(//*[@class='display'])[2]//*[@value='soccer']")).getAttribute("checked");
		System.out.println("Attribute value: "+Sccorattrvalue);
		
		String FootBallattrvalue = driver.findElement(By.xpath("(//*[@class='display'])[2]//*[@value='football']")).getAttribute("checked");
		System.out.println("Attribute value: "+FootBallattrvalue);
		
	}

}
