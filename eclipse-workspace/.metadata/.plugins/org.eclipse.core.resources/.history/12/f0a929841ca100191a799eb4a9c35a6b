package com.phptravels.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	static {
		try {
			prop = new Properties();
			FileInputStream fs = new FileInputStream("\\\\MAC\\Home\\Desktop\\YourLogoOnlineShopping\\src\\test\\resources\\Configs\\config.properties");
			prop.load(fs);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Base() {

	}

	public static void intialize() {
		String browserName = prop.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "\\\\Mac\\Home/Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","\\\\Mac\\Home\\Desktop\\BrowserDrivers\\GeckoDriver\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.internerexplorer.driver", "\\\\Mac\\Home\\Desktop\\Selenium\\BrowserDrivers\\IEDriver\\IEDriverServer_x64_3.14.0");
			driver = new InternetExplorerDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
}
