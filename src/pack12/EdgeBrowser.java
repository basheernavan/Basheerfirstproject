package pack12;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class EdgeBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "resources/drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://google.com");
		//driver.manage().window().maximize();
		
		//driver.quit();
	}

	

}
