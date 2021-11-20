package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageBase {

	public CheckoutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(linkText = "Checkout")
	 WebElement checkout;
	public void checkoutdetailspage() throws InterruptedException
	{
			
		checkout.click();
		
		
	}
	

}
