package Pack15WebDriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//https://github.com/mozilla/geckodriver/releases
public class GoogleAllIconsUsingForLoop {
	@Test
	public void browserbuttons() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://google.com");
		driver.navigate().to("http://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@title='Google apps']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		for(int i=1;i<=15;i++){
			driver.findElement(By.xpath("/html/body/div/c-wiz/div/div/c-wiz/div/div/ul[1]/li["+i+"]/a/div/span")).click();
			Thread.sleep(3000);
			//System.out.println("/html/body/div/c-wiz/div/div/c-wiz/div/div/ul[1]/li["+i+"]/a/div/span");
			String title =driver.getTitle();
			System.out.println("Application title: "+title);
			System.out.println("Application Url: "+driver.getCurrentUrl());
			Thread.sleep(1000);
			driver.navigate().back();
			driver.findElement(By.xpath("//*[@title='Google apps']")).click();
			Thread.sleep(2000);
			driver.switchTo().frame(0);
		}
	}
}
