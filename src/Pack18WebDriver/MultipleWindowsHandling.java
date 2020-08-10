package Pack18WebDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindowsHandling {
	@Test
	public void multipleWindowsHandling() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.hsbc.co.in/nri/products/nro-account/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//*[@class='A-BTNP-RW-ALL'])[1]")).click();
		Thread.sleep(5000);
		//Need to handle multiple windows need to get the window ids:
		
		Set<String> allwindowids = driver.getWindowHandles();
		Iterator<String> iter = allwindowids.iterator();
		//to get all the window ids need to use while loop:
		/*while(iter.hasNext()){
			System.out.println("Windowid: "+iter.next());
		}*/
		
		String mainwindow = iter.next();
		String popupwindow = iter.next();
		driver.switchTo().window(popupwindow);
		driver.close();
		driver.switchTo().window(mainwindow);
		driver.close();
		
		driver.findElement(By.xpath("//*[@class='notNull letters']")).sendKeys("Basheer");
		
	}

}
