package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	protected WebDriver driver;
	public Actions action;
	public Select select;
	public JavascriptExecutor js;



	public PageBase ( WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}

	public void scrollToBottom() 

	{
		js.executeScript("scrollBy(0,3000)"); 

	}

	public void clickbutton(WebElement button) 

	{
		button.click();

	}


	static public void settext(WebElement input , String value) 

	{
		input.sendKeys(value);

	}






}
