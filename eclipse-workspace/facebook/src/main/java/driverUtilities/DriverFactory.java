package driverUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
	
	public WebDriver driver;
	
	public static WebDriver open(String browsertype) {
		
		if (browsertype.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/sri/Documents/BrowserDrivers/Firefox/geckodriver");
			//driver = new FirefoxDriver();
			//System.out.println("using Firefox Driver");
			return new FirefoxDriver();
		}
		
		else if (browsertype.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/sri/Documents/BrowserDrivers/Crome/chromedriver");
			return new ChromeDriver();
			
		}
		
		else {
			System.setProperty("webdriver.safari.driver", "/Users/sri/Documents/BrowserDrivers/Safari/SafariDriver.safariextz");
			return new SafariDriver();
			
			
		}
		
		
		
	}
	

}
