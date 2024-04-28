package pages;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import elements.HomePageElements;
import elements.LogoutPageElements;
import steps.AbstractBase;

public class LogoutPage {
	WebDriver driver;
	AbstractBase base; //why??
	String homepageurl;
	LogoutPageElements lope;
	
public LogoutPage(AbstractBase base1)
	{
		this.base =base1;
		this.driver =base.getDriver();
		lope =new LogoutPageElements(this.driver);
	}
	
public void clickfield(String fieldName)
{
	if (fieldName.toLowerCase()=="sign out")
	{
		lope.lbl_logoutofield.click();
	}
		
}
}