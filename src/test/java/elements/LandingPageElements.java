package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LandingPageElements {
	WebDriver driver;
	public LandingPageElements(WebDriver driver1)
	{
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'nav__userMenu navbar')]/a/span") 
	 public WebElement lnk_signin;
	
	@FindBy(xpath="//span[text()=\"Sign in with IMDb\"]")
    public WebElement btn_imdbsignin;
	
		
    @FindBy(xpath="//input[@id='ap_email']")
    public WebElement text_username;
    
		  
    @FindBy(xpath="//input[@id='ap_password']") 
    public WebElement text_password;
    
   @FindBy(xpath="//input[@id='signInSubmit']")
   public WebElement button_signin;
   
	/*
	 * @FindBy(xpath="//span[@class=\"ipc-btn__text\"]/span") public WebElement
	 * lbl_signinusername;
	 */
   @FindBy(xpath="//span[@class='imdb-header__account-toggle--logged-in imdb-header__accountmenu-toggle navbar__user-name navbar__user-menu-toggle__name navbar__user-menu-toggle--desktop']") public WebElement
	 lbl_signinusername;
   
}
