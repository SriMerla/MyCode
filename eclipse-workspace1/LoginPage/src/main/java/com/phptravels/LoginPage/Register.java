package com.phptravels.LoginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Register {
	
	@FindBy(how=How.XPATH, using="/html/body/div[5]/section/div/div/div/div/div[3]/div/form/div[3]/input")
	WebElement FirstName ;
	
	@FindBy(how=How.XPATH, using="/html/body/div[5]/section/div/div/div/div/div[3]/div/form/div[4]/input")
	WebElement LastName;
	
	@FindBy(how=How.NAME, using="phone")
	WebElement Phone;
	
	@FindBy(how=How.NAME, using="email")
	WebElement Email;
	
	@FindBy(how=How.NAME, using="password")
	WebElement Password;
	
	@FindBy(how=How.NAME, using="confirmpassword")
	WebElement ConfirmPassword;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
