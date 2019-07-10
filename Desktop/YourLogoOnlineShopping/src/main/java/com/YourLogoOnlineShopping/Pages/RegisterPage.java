package com.YourLogoOnlineShopping.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.YourLogoOnlineShopping.Base.Base;

public class RegisterPage extends Base{
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//input[@id='email_create']")
	WebElement NewEmail;
	
	@FindBy(how=How.XPATH, using=" //button[@id='SubmitCreate']//span")
	WebElement SubmitCreateButton;
	
	@FindBy(how=How.XPATH, using="/input[@id='id_gender1']")
	WebElement GenderMr;
	
	@FindBy(how=How.XPATH, using="//input[@id='id_gender2']")
	WebElement GenderMrs;
	
	@FindBy(how=How.XPATH, using="/input[@id='customer_firstname']")
	WebElement FirstName;
	
	@FindBy(how=How.XPATH, using="//input[@id='customer_lastname']")
	WebElement LastName;
	
	@FindBy(how=How.XPATH, using="//input[@id='passwd']")
	WebElement AccountPassword;
	
	@FindBy(how=How.XPATH, using="//input[@id='passwd']]")
	WebElement DropDown_Days;
	
	@FindBy(how=How.XPATH, using="//select[@id='months']")
	WebElement DropDown_Months;
	
	@FindBy(how=How.XPATH, using="//select[@id='months']")
	WebElement DropDown_years;
	
	
	@FindBy(how=How.XPATH, using="//input[@id='firstname']")
	WebElement Address_FirstName;
	
	@FindBy(how=How.XPATH, using="//input[@id='lastname']]")
	WebElement Address_LastName;
	
	@FindBy(how=How.XPATH, using="//input[@id='company']")
	WebElement Address_CompanyName;
	
	
	@FindBy(how=How.XPATH, using="/input[@id='address1']")
	WebElement Address;
	
	@FindBy(how=How.XPATH, using="//input[@id='city']")
	WebElement DropDown_city;
	
	@FindBy(how=How.XPATH, using="//select[@id='id_state']")
	WebElement DropDown_state;
	
	@FindBy(how=How.XPATH, using="//input[@id='postcode']")
	WebElement ZipCode;
	
	@FindBy(how=How.XPATH, using="//input[@id='phone']")
	WebElement Phone;
	
	@FindBy(how=How.XPATH, using="//input[@id='alias']")
	WebElement AddidtionalInfo;
	
	@FindBy(how=How.XPATH, using="//button[@id='submitAccount']//span")
	WebElement RegisterButtton;
	
	public void CreateNewAccount(String New_Email) {
		
		NewEmail.sendKeys(New_Email);
		SubmitCreateButton.click();
	}
	
	public void PersonalInformation(String firstname, String lastname, String pwd) {
		
		
		
		
	}
	

}
