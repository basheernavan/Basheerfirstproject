package Pack15WebDriver;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MultipleDropdownboxesHandling {
	@Test
	public void dropboxOptions(){
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.zigwheels.com/used-car/Delhi");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='websortbyusedcar']")).sendKeys("Kms Driven : Low to High");
		//WebElement RelevancyOptions=driver.findElement(By.xpath("//*[@id='websortbyusedcar']"));
		WebElement priceFromOptions=driver.findElement(By.xpath("//*[@id='priceFrom']"));
		List<WebElement> options = priceFromOptions.findElements(By.tagName("option"));
		
		System.out.println("Total options: "+options.size());
		
		for(int i=0;i<options.size();i++){
			System.out.println("Option Name: "+options.get(i).getText());
		}
		
		
	}
}
