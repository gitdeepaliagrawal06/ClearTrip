package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LandingPage;

public class HomeSteps{
	HomePage hps;
	public HomeSteps(HomePage hps1)
	{
		this.hps=hps1;	
	}
   
@When("I click on the {string} option")
public void i_click_on_the_option(String optionName)
{
   // hps.clickOption(optionName);
}

@When("I navigate to {string} option")
public void navigate_to(String optionName)
{
    hps.navigateToOption(optionName);
}

@When("I search {string} in the search box")
public void i_search_in_the_search_box(String output)
{
  hps.searchOnSearchBox(output);
}

@When("I click {string} from the search result")
public void i_click_from_the_search_result(String output) 
{
	hps.clickFromTheSearchResult(output);	
}
@When("I add {string} to watchlist")
public void i_add_to_watchlist(String Output) 
{
  hps.addOutputInWatchList(Output);
}

@Then("I should be able to view {string} in my watchlist")
public void verify_item(String productname)
{
    hps.verifyProductInWatchList(productname);
}

@When("I select {string} in the watchlist")
public void i_select_in_the_watchlist(String string)
{
	
}

@When("I delete {string} from my watchlist")
public void i_delete_from_my_watchlist(String string)
{

}
}