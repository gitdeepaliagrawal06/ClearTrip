package pages;
import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import elements.LandingPageElements;
import steps.AbstractBase;

public class LandingPage {
	WebDriver driver;
	AbstractBase base; //why??
	String homepageurl;
	LandingPageElements lpe;
	
public LandingPage(AbstractBase base1)
	{
		this.base =base1;
		this.driver =base.getDriver();
		lpe =new LandingPageElements(this.driver);
	}
public void redirectToLandingPage() throws InterruptedException
{
	homepageurl= base.getLandingPageURL();
	driver.get(homepageurl);
	Thread.sleep(5);
}

public void clickSignInOption() 
{
lpe.lnk_signin.click();	
lpe.btn_imdbsignin.click();
}

 public void enterUserName()
 {
   lpe.text_username.sendKeys("deepaliagrawal266@gmail.com");
  }
 
 
 public void enterPassWord()
 { 
   lpe.text_password.sendKeys("Deepali10@"); 
  }
 
 public void clickOnSigninButton()
  { 
	 lpe.button_signin.click(); 
	}


public void verifyLogin() throws InterruptedException
{
	//System.out.println("#########"+lpe.lbl_signinusername.getText());
	Thread.sleep(5000);
	if(lpe.lbl_signinusername.getText().contains("Deepali"))
	{
		System.out.println("#########"+lpe.lbl_signinusername.getText());
	}
	else
		fail("LoginFailed");
}
}