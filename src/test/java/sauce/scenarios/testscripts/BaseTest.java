package sauce.scenarios.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	WebDriver driver;
	
	@BeforeClass
	public void lounchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
	}
	@AfterClass
	public void closeBrowser() {
	  //driver.quit();
	}

}
