package com.phptravels.LoginPage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.DriverFactory;

public class LogIntoPage extends DriverFactory {
	
	@FindBy(how=How.XPATH, using ="/html/body/div[5]/div[1]/div[1]/form/div[1]/div[5]/div/div[1]/input") 
	public WebElement username;
	
	@FindBy(how=How.NAME, using="password")
	public WebElement password;
	
	@FindBy(how=How.XPATH, using="/html/body/div[5]/div[1]/div[1]/form/button")
	public WebElement login;
	

	 public LogIntoPage() {
		 PageFactory.initElements(driver, this);
			
	}
	 
	 public void setup() {
		 getDriver();
		 driver.get("https://www.phptravels.net/login");
	 }
	 
	 public void signIn() {
		 
	 }

}
