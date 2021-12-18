package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class AddressPage extends PageBase{

	public AddressPage(WebDriver driver) {
		super(driver);
		js = (JavascriptExecutor)driver;
	}

	@FindBy(linkText = "New Address")
	WebElement newaddressbtn;

	@FindBy(name="firstname")
	WebElement firstnametextbox;

	@FindBy(name="lastname")
	WebElement lastnametextbox ;

	@FindBy(name="company")
	WebElement companytextbox;

	@FindBy(name="address_1")
	WebElement addresstextbox ;

	@FindBy(name="city")
	WebElement citytextbox;

	@FindBy(name="postcode")
	WebElement postcodetextbox;


	@FindBy(id = "input-country")
	 WebElement countryddl;


	@FindBy(id = "input-zone")
	 WebElement zoneddl;
	
	@FindBy(css ="input[value='Continue']")
	 WebElement countinebtn;
	
	@FindBy(css =".alert.alert-success.alert-dismissible")
	public  WebElement addresssuccessmessage;
	
	
	
	
	


	public void openaddnewaddresspage()
	{
		clickbutton(newaddressbtn);
	}
	public  void scrooldownagain()

	{
		js.executeScript("window.scrollTo(0,1.600000381469727)");
		js.executeScript("window.scrollTo(0,10)");

	}
	
	
	//@SuppressWarnings("deprecation")
	public void filladdressform
	(String fname,String lname,String companyname , String address,String city , String postcod) 
			throws InterruptedException
	{
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		settext(firstnametextbox,fname);
		settext(lastnametextbox, lname);
		settext(companytextbox, companyname);
		settext(addresstextbox, address);
		settext(citytextbox, city);
		settext(postcodetextbox, postcod);
		select =new Select(countryddl);
		select.selectByVisibleText("Uganda");
		js.executeScript("window.scrollTo(0,150)");
		Thread.sleep(2000);
		select =new Select(zoneddl);
		select.selectByVisibleText("Apac");
		//clickbutton(countinebtn);
		//click btn by java
		js.executeScript("arguments[0].click();", countinebtn);
		
		

	}
	
}
