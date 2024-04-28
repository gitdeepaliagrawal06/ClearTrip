package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogoutPageElements {
	WebDriver driver;
	public LogoutPageElements(WebDriver driver1)
	{
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Sign out']")
    public WebElement lbl_logoutofield;
    
  
}
