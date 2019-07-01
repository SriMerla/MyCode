package com.myproject.facebook;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.Dashboard;
import pages.LoginPage;

public class LoginPageTest {

	
	public static void main(String[] args) {
		
		
		
		WebDriver driver = driverUtilities.DriverFactory.open("chrome");
		
		
		
		//Create prefs map to store all preferences 
		Map<String, Object> prefs = new HashMap<String, Object>();

		//Put this into prefs map to switch off browser notification
		prefs.put("profile.default_content_setting_values.notifications", 2);

		//Create chrome options to set this prefs
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		driver = new ChromeDriver(options);
         driver.get("https://www.facebook.com");
		
		LoginPage login = new LoginPage(driver);
		login.SetUsername("srimerla414@gmail.com");
		login.SetPassdword("sweetysree09");
		login.ClickSubmit();

		
		
		//driver.get("https://www.facebook.com/srimani.sri");
		//driver.switchTo().alert().accept();
		
		Dashboard sri = new Dashboard(driver);
		sri.Profile();
		sri.Logout();
		sri.Confirmation();

		
		driver.close();
	}

}
