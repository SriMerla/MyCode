package com.qh.eligibility.pages;

import java.util.Hashtable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qh.eligibility.util.Base;
import com.relevantcodes.extentreports.LogStatus;

public class CoverageHistoryPage extends Base{
	
	@FindBy(how=How.XPATH, using="//*[@id='TPAMemberID']")
	public
	WebElement  MemberID;
	
	@FindBy(how=How.XPATH, using="//*[@id='EffectiveDT']")
	public
	WebElement  EffectiveDate;
	
	@FindBy(how=How.XPATH, using="//*[@id='TermDT']")
	public
	WebElement  TermDate;
	
	@FindBy(how=How.XPATH, using="//*[@id='EligibilityStatus']")
	public
	WebElement  EligibilityStatus;
	
	@FindBy(how=How.XPATH, using="//*[@id='TPAInsuredID']")
	public
	WebElement EmployeeID ;
	
	@FindBy(how=How.XPATH, using="//*[@id='TPAGroupNumber']")
	public
	WebElement  TPAGroupNumber;
	
	@FindBy(how=How.XPATH, using="//*[@id='PBMGroupNumber']")
	public
	WebElement  PBMGroupNumber;
	
	@FindBy(how=How.XPATH, using="//*[@id='PlanCodeId']")
	public
	WebElement PlanCodeID ;
	
	@FindBy(how=How.XPATH, using="//*[@id='SubGroupID']")
	public
	WebElement  SubGroupID;
	
	@FindBy(how=How.XPATH, using="//*[@id='PlanOptionID']")
	public
	WebElement  PlanOption;
	
	@FindBy(how=How.XPATH, using="//*[@id='NetworkPackageID']")
	public
	WebElement  Network;
	
	@FindBy(how=How.XPATH, using="//*[@id='QHMedCovID']")
	public
	WebElement  MedicalCoverage;
	
	@FindBy(how=How.XPATH, using="//*[@id='WrapNetworkID']")
	public
	WebElement  WrapNetwork;
	
	@FindBy(how=How.XPATH, using="//*[@id='Pbm_Int_ID']")
	public
	WebElement  PBM;
	
	@FindBy(how=How.XPATH, using="//*[@id='save-coverage-form']/span[2]")
	public
	WebElement  SaveButton;
	
	@FindBy(how=How.XPATH, using="//*[@id='cancel-coverage-form']/span[2]")
	public
	WebElement  CancelButton;
	
	@FindBy(how=How.XPATH, using="//*[@id='CascadeCoverageChange']")
	public
	WebElement CascadeToDependents ;
	
	@FindBy(how=How.XPATH, using="//*[@id='add-coverage']/span[2]")
	public
	WebElement  AddCoverageButton;
	
	@FindBy(how=How.XPATH, using="//*[@id='edit-coverage']/span[2]")
	public
	WebElement  EditCoverageButton;
	
	@FindBy(how=How.XPATH, using="//*[@id='delete-coverage']/span[2]")
	public
	WebElement  DeleteCoverageButton;
	
	@FindBy(how=How.XPATH, using="//*[@id='PlanCodeId']")
	public
	WebElement  PlanCode;
	
	
	@FindBy(how=How.XPATH, using="//*[@id='coverages-module']/div[1]/table/tbody/tr/td")
	List<WebElement>  CoverageHistoryTable;
	

	
	public void AddCoverageFunction(Hashtable<String, String> data)throws Exception {
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(AddCoverageButton));
		AddCoverageButton.click();
		
		EffectiveDate.clear();
		EffectiveDate.sendKeys(data.get("EffectiveDate"));
		//logger.log(LogStatus.INFO, "Effective date has been entered.");
		TermDate.clear();
		TermDate.sendKeys(data.get("TermDate"));
		CoverageInfoPage ci=new CoverageInfoPage();
		ci.Coverage.click();
		//logger.log(LogStatus.INFO, "Term date has been entered.");
		Select so=new Select(EligibilityStatus);
		so.selectByVisibleText(data.get("Status"));
		//logger.log(LogStatus.INFO, "Eligibility Status has been selected from the drop down.");
		//EmployeeID.clear();
		//EmployeeID.sendKeys(data.get("EmployeeID"));
		TPAGroupNumber.clear();
		TPAGroupNumber.sendKeys(data.get("TPAGroupNumber"));
		//logger.log(LogStatus.INFO, "TPA Group Number has been entered.");
		PBMGroupNumber.clear();
		PBMGroupNumber.sendKeys(data.get("PBMGroupNumber"));
		//logger.log(LogStatus.INFO, "PBM Group Number has been entered.");
		so=new Select(PlanCodeID);
		so.selectByVisibleText(data.get("PlanCode"));
		//logger.log(LogStatus.INFO, "Plan Code has been selected from the drop down.");
		
		so=new Select(SubGroupID);
		so.selectByVisibleText(data.get("SubGroup"));
		//logger.log(LogStatus.INFO, "Subgroup has been selected from the drop down.");
		
		so=new Select(PlanOption);
		so.selectByVisibleText(data.get("PlanOption"));
		//logger.log(LogStatus.INFO, "Plan Option has been selected from the drop down.");
		
		so=new Select (Network);
		so.selectByVisibleText(data.get("Network"));
		//logger.log(LogStatus.INFO, "Network has been selected from the drop down.");
		
		so=new Select(MedicalCoverage);
		so.selectByVisibleText(data.get("Medical"));
		//logger.log(LogStatus.INFO, "Medical has been selected from the drop down.");
		
		so=new Select(PBM);
		so.selectByVisibleText(data.get("PBM"));
		//logger.log(LogStatus.INFO, "PBM has been selected from the drop down.");
		
		SaveButton.click();
		/*if(isAlertPresent(driver)){		
		HandleAlert("Dismiss", driver);
		}*/
		
		
	}
	
public void EditCoverageFunction(Hashtable<String, String> data)throws Exception {
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(AddCoverageButton));
		EditCoverageButton.click();
		
		EffectiveDate.clear();
		EffectiveDate.sendKeys(data.get("EffectiveDate"));
		//logger.log(LogStatus.PASS, "Effective date was edited");

		TPAGroupNumber.clear();
		TPAGroupNumber.sendKeys(data.get("TPAGroupNumber"));
		//logger.log(LogStatus.PASS, "TPA Group Number was edited");

		
		Select so=new Select(SubGroupID);
		so.selectByVisibleText(data.get("SubGroup"));
		//logger.log(LogStatus.PASS, "Subgroup was edited");

		SaveButton.click();
		/*if(isAlertPresent(driver)){		
		HandleAlert("Dismiss", driver);
		}*/
		//logger.log(LogStatus.PASS, "Edit Coverage test case passed successfully");
		
		
	}
	
	
	
	
	
	public void DeleteCoverageFunction(int NumberOfTimes)throws Exception{
		
		
		for (int i = 0; i < NumberOfTimes; i++) {
			DeleteCoverageButton.click();
			/*if (isAlertPresent(driver)) {
				HandleAlert("Accept", driver);
			} */
		}
		
	}
	
	public void DeleteAllCoverageFunction()throws Exception{
		
	
			List<WebElement> CoverageHistoryTableAllRows = driver.findElements(By.xpath("//*[@id='coverages-module']/div[1]/table/tbody/tr"));
			System.out.println("Number of Rows are: "+ CoverageHistoryTableAllRows.size());
			for (int i = 0; i < CoverageHistoryTableAllRows.size(); i++) {
				DeleteCoverageButton.click();
				if (isAlertPresent(driver)) {
					HandleAlert("Accept", driver);
				} 
				//logger.log(LogStatus.PASS, "Coverage Deleted.");
			}
		
	}
	public void DeleteCoverageFunction(String EffectiveDate)throws Exception{
			int row_count=driver.findElements(By.xpath("//*[@id='coverages-module']/div[1]/table/tbody/tr")).size();
			int col_count=driver.findElements(By.xpath("//*[@id='coverages-module']/div[1]/table/tbody/tr[1]/td")).size();
			List<WebElement> CoverageHistoryTableAllColumns = driver.findElements(By.xpath("//*[@id='coverages-module']/div[1]/table/tbody/tr/td"));
			List<WebElement> CoverageHistoryTableAllFields = driver.findElements(By.xpath("//*[@id='coverages-module']/div[1]/table/tbody/tr/td"));
			System.out.println("Number of Rows are: "+ row_count);
			System.out.println("Number of Columns are: "+ col_count);
			
			String first_part="//*[@id='coverages-module']/div[1]/table/tbody/tr[";
			String second_part="]/td[";
			String third_part="]";
			int j=3;			
			for (int i = 1; i <= row_count; i++) {	
				String final_path=first_part+i+second_part+j+third_part;
				//System.out.println(i+" Field value is "+ CoverageHistoryTableAllFields.get(i).getText());
				if(driver.findElement(By.xpath(final_path)).getText().equalsIgnoreCase(EffectiveDate)){
					driver.findElement(By.xpath(final_path)).click();	
					DeleteCoverageButton.click();
					if (isAlertPresent(driver)) {
						HandleAlert("Accept", driver);

						break;
					} 
					
				}				
			}
				
			
				
	}
	public void SelectCoverageFunction(String EffectiveDate)throws Exception{
		int row_count=driver.findElements(By.xpath("//*[@id='coverages-module']/div[1]/table/tbody/tr")).size();
		int col_count=driver.findElements(By.xpath("//*[@id='coverages-module']/div[1]/table/tbody/tr[1]/td")).size();
		List<WebElement> CoverageHistoryTableAllColumns = driver.findElements(By.xpath("//*[@id='coverages-module']/div[1]/table/tbody/tr/td"));
		List<WebElement> CoverageHistoryTableAllFields = driver.findElements(By.xpath("//*[@id='coverages-module']/div[1]/table/tbody/tr/td"));
		System.out.println("Number of Rows are: "+ row_count);
		System.out.println("Number of Columns are: "+ col_count);
		
		String first_part="//*[@id='coverages-module']/div[1]/table/tbody/tr[";
		String second_part="]/td[";
		String third_part="]";
		int j=3;			
		for (int i = 1; i <= row_count; i++) {	
			String final_path=first_part+i+second_part+j+third_part;
			//System.out.println(i+" Field value is "+ CoverageHistoryTableAllFields.get(i).getText());
			if(driver.findElement(By.xpath(final_path)).getText().equalsIgnoreCase(EffectiveDate)){
				driver.findElement(By.xpath(final_path)).click();
				
					break;
				
			}				
		}
			
		
			
}
	
}
