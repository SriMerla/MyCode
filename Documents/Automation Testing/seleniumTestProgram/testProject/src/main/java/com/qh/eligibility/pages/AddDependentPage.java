package com.qh.eligibility.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qh.eligibility.util.Base;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jna.platform.win32.Netapi32Util.Group;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class AddDependentPage extends Base { 
	

	public static String Fn = null;
	public static String Ln = null;


	@FindBy(how=How.XPATH, using="//*[@id='close-model-btn']")
	WebElement CloseModelButton ;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-IsDemoAccount']")
	WebElement DemoAccountCheckbox ;
	
	@FindBy(how=How.XPATH, using="//*[@id='step-1-page']/a/span[1]/strong")
	WebElement NextButtonPerson;
	
	@FindBy(how=How.XPATH, using="//*[@id='step-1-form']/div[1]/span/input")
	public
	WebElement GroupDropDown;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-FirstName']")
	WebElement FirstName;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-MiddleInitial']")
	WebElement MiddleInitial;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-LastName']")
	WebElement LastName;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-MaleGender']")
	WebElement MaleRadioButton;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-FemaleGender']")
	WebElement FemaleRadioButton;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-DOB']")
	WebElement BirthDate;
	
	@FindBy(how=How.XPATH, using="//*[@id='new-member-modal-window']/div[2]/ul/li[1]")
	WebElement PersonTabTitle;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-SocialSecurityNumber']")
	WebElement MemberSSN;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-Relationship']")
	WebElement Relationship;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-TPAMemberID']")
	WebElement MemberID;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-TPAInsuredID']")
	WebElement EmployeeID;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-EffectiveDT']")
	WebElement EffectiveDate;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-TermDT']")
	WebElement TermDate;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-AddressLine1']")
	WebElement AddressLine1;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-AddressLine2']")
	WebElement AddressLine2;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-City']")
	WebElement City;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-Country']")
	WebElement Country;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-State']")
	WebElement State;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-ZipCode']")
	WebElement Zip;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-HomePhone']")
	WebElement HomePhone;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-CellPhone']")
	WebElement CellPhone;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-WorkPhone']")
	WebElement WorkPhone;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-Email']")
	WebElement Email;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-BestTimeToCall']")
	WebElement BestTimeToCall;
	
	@FindBy(how=How.XPATH, using="//*[@id='step-2-page']/a[1]/span[1]/strong")
	WebElement PreviousButtonContact;
	
	@FindBy(how=How.XPATH, using="//*[@id='step-2-page']/a[2]/span[1]/strong")
	WebElement NextButtonContact;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-EligibilityStatus']")
	WebElement Status;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-TPAGroupNumber']")
	WebElement TPAGroupNumber;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-PBMGroupNumber']")
	WebElement PBMGroupNumber;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-PlanCodeId']")
	WebElement PlanCode;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-SubGroupID']")
	WebElement SubGroup;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-PlanOptionID']")
	WebElement PlanOption;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-NetworkPackageID']")
	WebElement Network;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-QHMedCovID']")
	WebElement Medical;
	
	@FindBy(how=How.XPATH, using="//*[@id='wizard-Pbm_Int_ID']")
	WebElement PBM;
	
	@FindBy(how=How.XPATH, using="//*[@id='step-4-page']/a[1]/span[1]/strong")
	WebElement PreviousButtonCoverage;
	
	@FindBy(how=How.XPATH, using="//*[@id='step-4-page']/a[2]/span[1]/strong")
	WebElement NextButtonCoverage;
		
	@FindBy(how=How.XPATH, using="//*[@id='step-5-page']/a[1]/span[1]/strong")
	WebElement PreviousButtonVerify;	
	
	@FindBy(how=How.XPATH, using="//*[@id='step-5-page']/a[2]/span[1]/strong")
	WebElement SaveButtonVerify;
	

	Random rand = new Random();
	
	
	
	
	public void switchToNewlyCreatedMember(WebDriver driver){
		
	Set<String> WindowIDs = driver.getWindowHandles();
	Iterator<String> it = WindowIDs.iterator();
	
	  for (String window : WindowIDs){
		 driver.switchTo().window(window);
		 System.out.println(driver.getTitle());
         if (!driver.getTitle().contains("Search")) {
                return;
			}
					
		}	
		
	}
	
	public void switchToLastOpenWindow(String QHID){
		
		Set<String> WindowIDs = driver.getWindowHandles();
		Iterator<String> it = WindowIDs.iterator();
		
		  for (String window : WindowIDs){
			 driver.switchTo().window(window);
			 System.out.println(driver.getTitle());
	         if (driver.getTitle().contains(QHID)) {
	                return;
				}
						
			}	
			
		}
	
	
	public void AddDependentFunction(Hashtable<String, String> data, String whichRelationship) throws Exception{
		
		
		GroupDropDown.sendKeys(data.get("GroupName"));
		FirstName.clear();
		Fn=data.get("FirstName")+rand.nextInt(1000)+rand.nextInt(100);
		FirstName.sendKeys(Fn);
		MiddleInitial.clear();
		MiddleInitial.sendKeys(data.get("MiddleInitial"));
		Ln=data.get("LastName")+rand.nextInt(1000)+rand.nextInt(100);
		LastName.clear();
		LastName.sendKeys(Ln);
			

		if(whichRelationship=="Male" ){
			MaleRadioButton.click();
		}
		else{
			FemaleRadioButton.click();	
		}
				
		BirthDate.clear();
		BirthDate.sendKeys(data.get("BirthDate"));
		//logger.log(LogStatus.INFO, "Member Birth Date was entered");	
		PersonTabTitle.click();
		MemberSSN.clear();		
		String RandomMemberSSN="5554"+(RandomInteger(100,999)+99)+RandomInteger(10,99);
		MemberSSN.sendKeys(RandomMemberSSN);
		//logger.log(LogStatus.INFO, "Member SSN was entered");	
		Relationship.sendKeys(data.get("Relationship"));
		//logger.log(LogStatus.INFO, "Member Relationship was entered");	
		MemberID.clear();
		MemberID.sendKeys(RandomMemberSSN);
		EmployeeID.clear();
		EmployeeID.sendKeys(RandomMemberSSN+".1");
		//logger.log(LogStatus.INFO, "Member ID and Employee ID was entered");	
		EffectiveDate.clear();
		EffectiveDate.sendKeys(data.get("EffectiveDate"));
		TermDate.clear();
		TermDate.sendKeys(data.get("TermDate"));
		//logger.log(LogStatus.INFO, "Effective date and term date was entered");	
		NextButtonPerson.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AddressLine1));
		AddressLine1.clear();
		AddressLine1.sendKeys(data.get("AddressLine1"));
		AddressLine2.clear();
		AddressLine2.sendKeys(data.get("AddressLine2"));
		City.clear();
		City.sendKeys(data.get("City"));
		Select cn=new Select(Country);
		cn.selectByVisibleText(data.get("Country"));
		Select st=new Select(State);
		st.selectByVisibleText(data.get("State"));
		Zip.clear();
		Zip.sendKeys(data.get("Zip"));
		//logger.log(LogStatus.INFO, "Address, city, state, country and zip was entered");	

		HomePhone.clear();
		HomePhone.sendKeys(data.get("HomePhone"));
		//logger.log(LogStatus.INFO, "Member home phone number was entered ");	
		Email.clear();
		Email.sendKeys(data.get("Email"));
		BestTimeToCall.sendKeys(data.get("BestTimeToCall"));
		//logger.log(LogStatus.INFO, "Email and Best Time to Call was entered");	
		
		NextButtonContact.click();
		wait.until(ExpectedConditions.visibilityOf(Status));
		Select stat=new Select(Status);
		stat.selectByVisibleText(data.get("Status"));
		TPAGroupNumber.clear();
		TPAGroupNumber.sendKeys(data.get("TPAGroupNumber"));
		PBMGroupNumber.clear();
		PBMGroupNumber.sendKeys(data.get("PBMGroupNumber"));
		Select pc=new Select(PlanCode);
		pc.selectByVisibleText(data.get("PlanCode"));
		SubGroup.sendKeys(data.get("SubGroup"));
		PlanOption.sendKeys(data.get("PlanOption"));
		Network.sendKeys(data.get("Network"));
		Medical.sendKeys(data.get("Medical"));
		PBM.sendKeys(data.get("PBM"));
		//logger.log(LogStatus.INFO, "Coverage Details was entered");	
		NextButtonCoverage.click();
		wait.until(ExpectedConditions.visibilityOf(SaveButtonVerify));
		SaveButtonVerify.click();
	
		
		
	}
	
}
