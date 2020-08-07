package Pack17TestNGPrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProgramsTestNG {
	public WebDriver driver;
	
	@BeforeMethod
	public void openbrowser(){
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}
	
	
	@Test
	public void google(){		
		driver.get("http://google.com");		
	}
	
	@Test
	public void gmail(){	
		driver.get("http://google.com");
		driver.findElement(By.linkText("Gmail")).click();
		
	}
	
	@Test
	public void images(){	
		driver.get("http://google.com");
		driver.findElement(By.linkText("Images")).click();		
	}
	
	
	@Test
	public void carwale(){		
		driver.get("http://carwale.com");
	}
}
