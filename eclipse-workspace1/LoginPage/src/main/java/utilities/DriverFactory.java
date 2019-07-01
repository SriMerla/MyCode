package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.google.common.io.Resources;

public class DriverFactory {
	
	public static WebDriver driver;
	public static String browserType="chrome"; 


	
	public static WebDriver getDriver() {
		if(driver!=null) {
			return driver;
		}
		else {
			if(browserType.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "/Users/sri/Documents/BrowserDrivers/Firefox/geckodriver");
				driver = new FirefoxDriver();
				return driver;
			}
			if(browserType.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "/Users/sri/Documents/BrowserDrivers/Crome/chromedriver");
				driver = new ChromeDriver();
				return driver;
			}
			else {
				
				System.setProperty("webdriver.safari.driver", "/Users/sri/Documents/BrowserDrivers/Safari/SafariDriver.safariextz");
				driver = new SafariDriver();
				return driver;
			}
		}
	}
	
   
}
