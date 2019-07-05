package com.qh.eligibility.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qh.eligibility.util.Base;

	    public class SearchPage extends Base{

		public String MemberQHID;
		
		@FindBy(how=How.XPATH, using="//*[@id='search']/div[2]/div[1]/span/input")
		public static WebElement GroupName ;  
		
		@FindBy(how=How.XPATH, using="//*[@id='QHID']")
		public static WebElement QHID ;   
		
		@FindBy(how=How.XPATH, using="//*[@id='TPAInsuredID']")
		public static WebElement EmployeeeID ;  	
		
		@FindBy(how=How.XPATH, using="//*[@id='SSN']")
		public static WebElement MemberSSN ; 	
		
		@FindBy(how=How.ID, using="LastName")
		public static WebElement LastName ; 
		
		@FindBy(how=How.ID, using="FirstName")
		public static WebElement FirstName ; 
		
		@FindBy(how=How.XPATH, using="//*[@id='search']/div[4]/input[1]")
		public static WebElement Search ; 	
		
		@FindBy(how=How.XPATH, using="//*[@id='search']/div[4]/input[2]")
		public static WebElement ClearButton ; 
		
		@FindBy(how=How.XPATH, using="//*[@id='search']/a")
		public static WebElement NewMemberButton ; 
		
		@FindBy(how=How.XPATH, using="//*[@id='search-results-module']/ul[1]/li/table/tbody/tr/td[1]/span")
		public static WebElement SearchResultsFirstMember ; 
		
		@FindBy(how=How.XPATH, using="//*[@id='search-results-module']/ul[1]/li/table/tbody/tr/td[3]")
		public static WebElement SearchedQHID;
		

		public void select_search_result (String recordNumber){
		WebDriverWait wait = new WebDriverWait(driver, 30);
		String searchResult = returnWordToNumber().get(recordNumber.toLowerCase());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='search-results-module']/ul[1]/li["+searchResult+"]/table/tbody/tr/td[1]")));
		driver.findElement(By.xpath("//*[@id='search-results-module']/ul[1]/li["+searchResult+"]/table/tbody/tr/td[1]")).click();
		String QHID = driver.findElement(By.xpath("//*[@id='search-results-module']/ul[1]/li["+searchResult+"]/table/tbody/tr/td[3]")).getText();
		SwitchWindow(QHID);
		}
		
 }

