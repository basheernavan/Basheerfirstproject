package Pack18WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.Test;
public class TestAlert {
	
	@Test
	public void testAlert() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//*[@name='proceed']")).click();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		
		//get the text from alert or verify the text:
		String text = alt.getText();
		System.out.println("Alert Text: "+text);
		
		Assert.assertEquals("Please enter a valid user55 name", text);
		boolean flag=false;
		/*if(text.equalsIgnoreCase("Please enter a valid user name")){
			flag=true;
		}*/
		//assertTrue(flag);
		//click on OK button
		alt.accept();  //It'll click on Ok button
		//alt.dismiss();  //It'll click on Cancel button
		
	}

}
