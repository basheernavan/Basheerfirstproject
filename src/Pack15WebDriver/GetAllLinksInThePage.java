package Pack15WebDriver;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//https://github.com/mozilla/geckodriver/releases
public class GetAllLinksInThePage {
	@Test
	public void browserbuttons() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://google.com");
		driver.navigate().to("https://play.google.com");
		driver.manage().window().maximize();
		//List<WebElement> links = driver.findElements(By.tagName("a"));
		List<WebElement> links = driver.findElements(By.tagName("button"));
		System.out.println("Total Links: "+links.size());
		
		for(int i=0;i<links.size();i++){
			System.out.println("Button: "+links.get(i).getText());
		}
		
	}
}
