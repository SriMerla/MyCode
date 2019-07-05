package com.mercuryTours.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercuryTours.utils.BaseTest;

public class LoginPage extends BaseTest {
	
	@FindBy(name="userName")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="login")
	WebElement LoginButton;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);		
		
	}
	
	public void verifyTitle() {
		
	String Title = driver.getTitle();
	System.out.println(Title);
		
	}
	
	public void login(String user, String pass) {
		UserName.sendKeys(user);
		Password.sendKeys(pass);
		LoginButton.click();
	}
	

}
