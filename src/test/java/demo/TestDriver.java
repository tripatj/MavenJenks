package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDriver {
	
	@Test
	public void runner() throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();		
	}

}
