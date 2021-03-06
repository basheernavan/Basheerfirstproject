package Pack14Webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleCheckboxes {
	@Test
	public void multipleCheckboxes() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tizag.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("HTML Tutorial")).click();
		driver.findElement(By.partialLinkText("HTML - Checkb")).click();
		//driver.findElement(By.xpath("//*[@type='checkbox']")).click();
		//Thread.sleep(2000);
		//First four checkboxes:
		//List<WebElement> checkboxes= driver.findElements(By.xpath("(//*[@class='display'])[2]//*[@name='sports']"));
		
		//second four checkboxes
		List<WebElement> checkboxes= driver.findElements(By.xpath("(//*[@class='display'])[2]//*[@name='sports']"));
		int totalcheckboxes=checkboxes.size();
		System.out.println("Total check boxes: "+totalcheckboxes);
		
		for(int i=0;i<totalcheckboxes;i++){
			checkboxes.get(i).click();
			Thread.sleep(2000); //some delay to click the check boxes
		}
		
	}
	
	

}
