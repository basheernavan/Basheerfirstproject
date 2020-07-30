package Pack14Webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAllTheCheckboxes {
	@Test
	public void multipleCheckboxes() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tizag.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("HTML Tutorial")).click();
		driver.findElement(By.partialLinkText("HTML - Checkb")).click();
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println("Total Checkboxes: "+checkboxes.size());
		for(int i=0;i<checkboxes.size();i++){
			String attrValue = checkboxes.get(i).getAttribute("checked");
			System.out.println("Attribute value: "+attrValue);			
			if(attrValue==null){
				checkboxes.get(i).click();
			}			
		}
		
	}

}
