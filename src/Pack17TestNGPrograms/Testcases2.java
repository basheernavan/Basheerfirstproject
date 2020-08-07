package Pack17TestNGPrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcases2 extends Testcases1{
	
	
	@Test
	public void dropbox(){		
		driver.get("http://dropbox.com");		
	}
	
	@Test
	public void ebay(){	
		driver.get("http://ebay.com");
		
		
	}
	
	@Test
	public void irctc(){	
		driver.get("http://irctc.co.in");
		
	}	
	
}
