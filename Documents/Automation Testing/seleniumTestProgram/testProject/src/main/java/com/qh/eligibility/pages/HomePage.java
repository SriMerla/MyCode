package com.qh.eligibility.pages;

import java.util.Hashtable;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qh.eligibility.util.Base;



public class HomePage extends Base {
	
	
	@FindBy(how=How.XPATH, using="//*[@id='header-FirstName']")
	public
	WebElement HeaderFirstName ; 
	
	@FindBy(how=How.XPATH, using="//*[@id='header-LastName']")
	public
	WebElement HeaderLastName ; 
	
	@FindBy(how=How.XPATH, using="//*[@id='eligibility-effective']")
	WebElement HeaderEligibilityEffectiveDate ; 
	
	@FindBy(how=How.XPATH, using="//*[@id='eligibility-term']")
	WebElement HeaderEligibilityTermDate ; 

	@FindBy(how=How.XPATH, using="//*[@id='header-Relationship']")
	WebElement HeaderRelationship ; 
	
	@FindBy(how=How.XPATH, using="//*[@id='dependents-module']/div/table/tbody/tr/td[1]")
	WebElement HeaderImageFamilyMember1 ; 
	
	@FindBy(how=How.XPATH, using="//*[@id='dependents-module']/div/table/tbody/tr/td[2]")
	WebElement HeaderFamilyMember1Name ; 
	
	@FindBy(how=How.XPATH, using="//*[@id='dependents-module']/div/table/tbody/tr/td[3]")
	WebElement HeaderFamilyMember1QHID ; 
	
	@FindBy(how=How.XPATH, using="//*[@id='dependents-module']/div/table/tbody/tr/td[4]")
	WebElement HeaderFamilyMember1DOB ; 
	
	@FindBy(how=How.XPATH, using="//*[@id='FirstName']")
	public static WebElement FirstName ;
	
	@FindBy(how=How.XPATH, using="//*[@id='MiddleInitial']")
	WebElement DemographicsMiddleInitial ;
	
	@FindBy(how=How.XPATH, using="//*[@id='LastName']")
	public static WebElement LastName ;
	
	@FindBy(how=How.XPATH, using="//*[@id='Male-Gender']")
	WebElement DemographicsGenderMaleRadioButton ;
	
	@FindBy(how=How.XPATH, using="//*[@id='Female-Gender']")
	WebElement DemographicsGenderFemaleRadioButton ;
	
	@FindBy(how=How.XPATH, using="//*[@id='AddressLine1']")
	WebElement DemographicsAddressLine1 ;
	
	@FindBy(how=How.XPATH, using="//*[@id='AddressLine2']")
	WebElement DemographicsAddressLine2 ;
	
	@FindBy(how=How.XPATH, using="//*[@id='City']")
	WebElement DemographicsCity ;
	
	@FindBy(how=How.XPATH, using="//*[@id='Country']")
	WebElement DemographicsCountry ;
	
	@FindBy(how=How.XPATH, using="//*[@id='State']")
	WebElement DemographicsState ;
	
	@FindBy(how=How.XPATH, using="//*[@id='ZipCode']")
	WebElement DemographicsZipCode ;
	
	@FindBy(how=How.XPATH, using="//*[@id='County']")
	WebElement DemographicsCounty ;
	
	@FindBy(how=How.XPATH, using="//*[@id='UseAddress']")
	WebElement DemographicsUseAddress ;
	
	@FindBy(how=How.ID, using="HomePhone")
	public static WebElement HomePhone ;
	
	@FindBy(how=How.XPATH, using="//*[@id='CellPhone']")
	public static WebElement CellPhone ;
	
	@FindBy(how=How.XPATH, using="//*[@id='WorkPhone']")
	public static WebElement WorkPhone ;
	
	@FindBy(how=How.XPATH, using="//*[@id='Relationship']")
	WebElement DemographicsRelationship ;
	
	@FindBy(how=How.XPATH, using="//*[@id='BestTimeToCall']")
	WebElement DemographicsBestTimeToCall ;
	
	@FindBy(how=How.XPATH, using="//*[@id='Email']")
	WebElement DemographicsEmail ;
	
	@FindBy(how=How.XPATH, using="//*[@id='EESocialSecurityNumber']")
	WebElement DemographicsEmployeeSSN ;
	
	@FindBy(how=How.XPATH, using="//*[@id='SocialSecurityNumber']")
	WebElement DemographicsMemberSSN ;
	
	@FindBy(how=How.XPATH, using="//*[@id='DOB']")
	WebElement DemographicsDateOfBirth ;
	
	@FindBy(how=How.XPATH, using="//*[@id='PreferredName']")
	WebElement DemographicsPreferredName ;
		
	@FindBy(how=How.XPATH, using="//*[@id='IsDemoAccount']")
	WebElement DemographicsDemoAccountRadioButton ;
	
	@FindBy(how=How.XPATH, using="//*[@id='ProviderFullName']")
	WebElement DemographicsPCPFullName ;
	
	@FindBy(how=How.XPATH, using="//*[@id='MemberAddDate']")
	WebElement DemographicsMemberAddDate ;
	
	@FindBy(how=How.ID, using="edit-member")
	public static WebElement Edit ;
	
	@FindBy(how=How.XPATH, using="//*[@id='delete-member']/span[2]")
	WebElement DemographicsDeleteLink ;
	
	@FindBy(how=How.XPATH, using="//*[@id='allow-address-cascade']")
	WebElement DemographicsAddressCascadeCheckbox ;
	
	@FindBy(how=How.XPATH, using="//*[@id='save-person-form']/span[2]")
	public static 
	WebElement Save ;
	
	@FindBy(how=How.XPATH, using="//*[@id='cancel-person-form']/span[2]")
	WebElement DemographicsCancelButton ;
	
	@FindBy(how=How.XPATH, using="//*[@id='add-dependent']/span[2]")
	public
	WebElement DemographicsAddDependentLink ;
	
	
	
	
	
	
	public void changeAddress(WebDriver driver, Hashtable<String, String> data){
		DemographicsAddressLine1.clear();
		DemographicsAddressLine1.sendKeys(data.get("AddressLine1"));
		DemographicsAddressLine2.clear();
		DemographicsAddressLine2.sendKeys(data.get("AddressLine2"));
		DemographicsCity.clear();
		DemographicsCity.sendKeys(data.get("City"));
		Select ListValue=new Select(DemographicsCountry);
		ListValue.selectByVisibleText(data.get("Country"));
		ListValue=new Select(DemographicsState);
		ListValue.selectByVisibleText(data.get("State"));
		DemographicsZipCode.clear();
		DemographicsZipCode.sendKeys(data.get("ZipCode"));
		Save.click();
	}
	
	
	public void editName(WebDriver driver, Hashtable<String, String> data){
		FirstName.clear();
		FirstName.sendKeys(data.get("FirstName"));
		DemographicsMiddleInitial.clear();
		DemographicsMiddleInitial.sendKeys(data.get("MiddleInitial"));
		LastName.clear();
		LastName.sendKeys(data.get("LastName"));
		Save.click();
	}
	
	public void editPhoneNumber(WebDriver driver, Hashtable<String, String> data){
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(HomePhone));
		//DemographicsHomePhone.clear();
		
		for (int i = 0; i < 10; i++) {
			HomePhone.sendKeys(Keys.BACK_SPACE);
		}
		
		HomePhone.sendKeys(data.get("HomePhoneNumber"));
		
		for (int i = 0; i < 10; i++) {
			CellPhone.sendKeys(Keys.BACK_SPACE);
		}
		
		CellPhone.sendKeys(data.get("CellPhoneNumber"));
		
		for (int i = 0; i < 10; i++) {
			WorkPhone.sendKeys(Keys.BACK_SPACE);
		}
		
		WorkPhone.sendKeys(data.get("WorkPhoneNumber"));
		Save.click();
	}
	
}
