package elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements {
	WebDriver driver;
	public HomePageElements(WebDriver driver1)
	{
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
        
    @FindBy(xpath="//span[@class=\"imdb-header__account-toggle--logged-in imdb-header__accountmenu-toggle navbar__user-name navbar__user-menu-toggle__name navbar__user-menu-toggle--desktop\"]/../../../../preceding-sibling::div[@class=\"sc-iNiRlI fDrzar imdb-header__watchlist-button\"]")
    public WebElement lbl_watchlistoption;
    		 
    @FindBy(xpath="//div[@id='page-1']//h3/a")
    public WebElement lbl_productname;
    
    @FindBy(xpath="//input[@id=\"suggestion-search\"]")
    public WebElement field_searchbox;
    
    @FindBy(xpath="//button[@id='suggestion-search-button']")
    public WebElement button_search;
    
    @FindBy(xpath="//section[@data-testid=\"find-results-section-title\"]//div[2]//ul[1]//li[1]//div[2]//div[1]//a[1]")
    public WebElement text_option;
    
    @FindBy(xpath="//button[@class='ipc-split-button__btn']")
    public WebElement button_watchlist_old;

    @FindBy(xpath="//div[text()=\"Add to Watchlist\"]")
    public WebElement button_watchlist;
    
    @FindBy(xpath="//div[@class='lister-item-content']/h3/a")
    public List<WebElement> items_in_watchlist;

    
    
    
    @FindBy(xpath="//body/div[@id='__next']/nav[@id='imdbHeader']/div[@role='presentation']/div[@class='sc-eirqia doZuKp imdb-header__watchlist-button']/a[@role='button']/span[1]")
    public WebElement lbl_watchlist;
    
    @FindBy(xpath="//span[@class='lister-widget-sprite lister-action edit']")
    public WebElement button_edit;
    }
