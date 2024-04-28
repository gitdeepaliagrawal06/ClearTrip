package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LandingPage;

public class LoginSteps{
	LandingPage lp;
	public LoginSteps(LandingPage lp1)
	{
		this.lp=lp1;	
	}
@Given("I am on IMDB home page")
public void i_am_on_imdb_home_page() throws InterruptedException 
{
	lp.redirectToLandingPage();  
}

@When("I click on signin option")
public void i_click_on_signin_option() 
{
	lp.clickSignInOption();
}

@When("I enter username")
public void enter_username()
{
	lp.enterUserName();
	}

@When("I click continue button")
public void click_continue()
{ 
	//lp.clickOnContinue();
}

@When("I enter password")
public void enter_password()
{
	lp.enterPassWord();
	}

@When("I click on signin button")
public void click_signbutton()
{
	lp.clickOnSigninButton();
	}

@Then("now we are under signin page")
public void now_we_are_under_signin_page() throws InterruptedException 
{
	lp.verifyLogin();
}
   
}