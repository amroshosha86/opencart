package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase {

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath ="(//button[@type='button'])[9]")
	WebElement addtocart;
	
	@FindBy(css =".alert.alert-success.alert-dismissible")
	public WebElement addcartsuccessmessage;
	
	@FindBy(css ="#cart")
	 WebElement cartbtn;
	@FindBy(linkText = "Checkout")
	 WebElement checkout;
	
	
	
	
	
	public void addtocart() throws InterruptedException
	{
		
		addtocart.click();
		
		
	}
	
	public void opencartpage() throws InterruptedException
	{
		
		cartbtn.click();
		checkout.click();
		
		
	}
	
	
	
	

}
