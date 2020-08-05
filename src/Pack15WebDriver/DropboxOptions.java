package Pack15WebDriver;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DropboxOptions {
	@Test
	public void dropboxOptions(){
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://ebay.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='gh-cat']")).click();
		driver.findElement(By.xpath("//*[@id='gh-cat']")).sendKeys("Baby");
		
		List<WebElement> options = driver.findElements(By.tagName("option"));
		int totalOptions=options.size();
		System.out.println("Total Options: "+totalOptions);
		for(int i=0;i<totalOptions;i++){
			System.out.println("Options: "+options.get(i).getText());
		}
		
		
	}
}
