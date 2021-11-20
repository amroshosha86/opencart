package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductDetailsPage;

public class AddToCartTest extends TestBase {
	HomePage HomePageobj;
	ProductDetailsPage ProductDetailsPageobj;
	CheckoutPage CheckoutPageobj;
	

	@Test(priority = 1)
	public void UserCanAddToCart() throws InterruptedException {
		HomePageobj=new HomePage(driver);
		HomePageobj.openmacpage();
		ProductDetailsPageobj=new ProductDetailsPage(driver);
		ProductDetailsPageobj.addtocart();
		Assert.assertTrue(ProductDetailsPageobj.addcartsuccessmessage.getText().contains("You have added"));
		//Thread.sleep(2000);
		ProductDetailsPageobj.opencartpage();
		CheckoutPageobj=new CheckoutPage(driver);
		CheckoutPageobj.checkoutdetailspage();
		


	}
}
