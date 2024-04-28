package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LandingPage;
import pages.LogoutPage;

public class LogoutSteps{
	LogoutPage los;
	public LogoutSteps(LogoutPage los1)
	{
		this.los=los1;	
	}
   
@When("I click on the {string} logouoption")
public void i_click_on_the_field(String fieldName)
{
    los.clickfield(fieldName);
}

@Then("I should be able to signout {string} of my account")
public void able_to_click_on_field(String productname)
{
	
   
}

}