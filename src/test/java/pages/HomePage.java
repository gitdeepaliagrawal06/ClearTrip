package pages;

import static org.junit.Assert.fail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import elements.HomePageElements;
import steps.AbstractBase;

public class HomePage {
	WebDriver driver;
	AbstractBase base; //why??
	String homepageurl;
	HomePageElements hpe;
	
public HomePage(AbstractBase base1)
	{
		this.base =base1;
		this.driver =base.getDriver();
		hpe =new HomePageElements(this.driver);
	}
public void navigateToOption(String optionName)
{
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	this.base.navigateTo("https://www.imdb.com/user/ur176926092/watchlist?ref_=nv_usr_wl_all_0");
	
}

public void verifyProductInWatchList(String productname)
{
	boolean flag = false; //initialising flag to false to understand if test case is passed or failed
	
	for(int i=0;i<hpe.items_in_watchlist.size();i++)
	{
		if(hpe.items_in_watchlist.get(i).getText().equalsIgnoreCase(productname))
		{
			flag = true; //match found - expected movie name present in the watchlist
			break;
		}		
	}
	if(flag==false)
		fail(productname+" not available in watchlist!");
}

public void searchOnSearchBox(String option)
{
	hpe.field_searchbox.sendKeys("Road House");
	hpe.button_search.click();
}

public void clickFromTheSearchResult(String searchresult)
{
	hpe.text_option.click();
}
	
public void addOutputInWatchList(String outputname)
{	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	int cnt = 0;
	while(cnt < 1000)
	{		
		if(hpe.button_watchlist.isEnabled())
		{
			hpe.button_watchlist.click();
			break;
		}				
		cnt++;
     }     
}
}