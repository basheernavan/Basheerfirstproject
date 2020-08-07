package Pack17TestNGPrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserOpenOneTimeTestcases {
	public WebDriver driver;
	
	@BeforeClass
	public void openbrowser(){
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public void closeBrowser(){
		driver.quit();
	}
	
	
	@Test
	public void google(){		
		driver.get("http://google.com");		
	}
	
	@Test(dependsOnMethods="google")
	public void gmail(){	
		driver.get("http://google.com");
		driver.findElement(By.linkText("Gmail")).click();
		
	}
	
	@Test(dependsOnMethods="gmail")
	public void images(){	
		driver.get("http://google.com");
		driver.findElement(By.linkText("Images")).click();		
	}
	
	
	@Test(dependsOnMethods="images")
	public void carwale(){		
		driver.get("http://carwale.com");
	}
}
