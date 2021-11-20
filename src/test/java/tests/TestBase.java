package tests;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.github.javafaker.Faker;

public class TestBase {

	public static WebDriver driver;
	Faker fake=new Faker();
	

	@BeforeSuite
	//StartDriver
		public void startDriver() {
		System.setProperty("webdriver.chrome.driver", 
		System.getProperty("user.dir")+"\\Sources\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("https://demo.opencart.com/index.php?route=common/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}
	
	// close browser
	@AfterSuite
	public void quitBrowser() {
		//driver.quit();
		}

}


