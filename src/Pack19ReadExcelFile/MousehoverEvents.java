package Pack19ReadExcelFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MousehoverEvents {
	
	@Test
	public void mousehoverEvents() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.hsbc.co.in/");
		driver.manage().window().maximize();
		WebElement MO = driver.findElement(By.xpath("(//*[@data-target='header-doormat-1'])[1]"));
		
		//Create object for Actions:
		Actions actions = new Actions(driver);
		actions.moveToElement(MO).build().perform(); //to keep the mouse on this element
		Thread.sleep(2000);
		driver.findElement(By.linkText("Smart Home")).click();
		Thread.sleep(2000);
		WebElement MO1 = driver.findElement(By.xpath("(//*[@data-target='header-doormat-2'])[1]"));
		
		actions.moveToElement(MO1).build().perform(); //to keep the mouse on this element
		Thread.sleep(2000);
	}

}
