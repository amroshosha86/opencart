package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.netty.util.Timeout;
import pages.AddressPage;
import pages.HomePage;
import pages.RegsiterPage;
import sharedmethod.SendEmail;

public class AddShippingAddressTest extends TestBase {
	HomePage homeobj;
	RegsiterPage regsiterobj ;
	AddressPage AddressPageobj;

	String FirstName=fake.name().fullName();
	String LastName=fake.name().lastName();
	String email =fake.internet().emailAddress();
	String phone=fake.phoneNumber().cellPhone();
	String password="12345678";
	String fname=fake.name().fullName();
	String lname=fake.name().lastName();
	String companyname=fake.company().name();
	String address=fake.address().fullAddress();
	String city=fake.address().city();
	String postcod="111150";
	



	@Test(priority = 0)
	public void UserCanReg()
	{
		homeobj=new HomePage(driver); 
		regsiterobj=new RegsiterPage(driver);
		homeobj.openMyAccountLink();
		homeobj.openRegistrationPage();
		regsiterobj.userRegForm(FirstName, LastName, email, phone, password);
		

	}
	@Test(priority = 1)
	public void UserCanAddAddress() throws InterruptedException {
		driver.get("https://demo.opencart.com/index.php?route=account/address");
		AddressPageobj= new AddressPage(driver);
		AddressPageobj.openaddnewaddresspage();
		AddressPageobj.filladdressform(fname,lname,companyname,address,city,postcod);
		Assert.assertTrue(AddressPageobj.addresssuccessmessage.getText()
		.contains("address has been successfully added"));


	}
}
