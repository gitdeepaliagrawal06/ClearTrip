package steps;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class AbstractBase {
	public WebDriver driver;
	Properties prop;
	String homePageURL;
//WebDriverWait wait;

	@SuppressWarnings("deprecation")
	@Before
	public void Setup() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "//src//test//java//config//config.properties");
			prop.load(fis);
			String browserName = prop.getProperty("browser");
			homePageURL = prop.getProperty("url");
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("http.agent", "Chrome");
				 
// line no 36 to 37 added to support driverless execution(no need to specify chrome drive path using system.setProperty)
				ChromeOptions options = new ChromeOptions();
				 options.addArguments("--remote-allow-origins=*");
				 
				 driver = new ChromeDriver(options);
			} else if (browserName.equalsIgnoreCase("Firefox")) {
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		} catch (IOException e) {
			e.getMessage();
		}
	}

	@After
	public void tearDown() {
		driver.quit();
//System.out.println("Global After Hook Executed");
	}

	public WebDriver getDriver() {
		return driver;
	}

	/*
	 * public WebDriverWait getWaitDriver() { return wait; }
	 */

	public String getLandingPageURL() {
		return homePageURL;
	}
	
	public void navigateTo(String URL)
	{
		driver.navigate().to(URL);
	}

}