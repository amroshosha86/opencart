package tests;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;


public class TestBase {

	public static WebDriver driver;
	String path=System.getProperty("user.dir");
	Faker fake=new Faker();


	@BeforeSuite
	//StartDriver
	public void startDriver() {
		//System.setProperty("webdriver.chrome.driver", 
		//System.getProperty("user.dir")+"\\Sources\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		driver = new ChromeDriver(); 
		//driver = new FirefoxDriver(); 
		driver.get("https://demo.opencart.com/index.php?route=common/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}

	@AfterMethod 
	public void takescreenshot(ITestResult result) throws IOException
	{
		if (ITestResult.FAILURE==result.getStatus()) 
		{
			try{
				//add the AShot dependency
				//https://mvnrepository.com/artifact/ru.yandex.qatools.ashot/ashot/1.5.4
				Screenshot screen = new AShot().takeScreenshot(driver);
				ImageIO.write(screen.getImage(),"PNG",new File(path+"\\Screenshots\\"+result.getName()+".png"));

			}
			catch (Exception e)
			{
				System.out.println("Exception while taking screenshot "+e.getMessage());
			} 

		}







	}



	// close browser
	@AfterSuite
	public void quitBrowser() {
		driver.quit();
	}

}


