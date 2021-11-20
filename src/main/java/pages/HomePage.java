package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		action=new Actions(driver);
		

	}

	@FindBy(css = "a[title='My Account']")
	WebElement myaccountlink;

	@FindBy(linkText = "Register")
	WebElement registerlink;

	@FindBy(linkText = 	"Logout")
	WebElement logoutbtn;
	
	@FindBy(linkText = 	"Login")
	WebElement loginbtn;
	
	
	@FindBy(linkText="Desktops")
	WebElement desktopmenu;
	
	@FindBy(linkText ="Mac (1)")
	WebElement macicon;
	
	

	

	
	public void openMyAccountLink()
	{
		myaccountlink.click();
	}

	public void openRegistrationPage()
	{
		registerlink.click();
	}

	public void logout()
	{
		myaccountlink.click();
		logoutbtn.click();
		
	}
	
	public void openloginpage()
	{
		myaccountlink.click();
		loginbtn.click();
	}
	
	public void openmacpage() throws InterruptedException
	{
		action.moveToElement(desktopmenu).perform();	
		macicon.click();
		
		
		
	}
	
	
	
	







}





