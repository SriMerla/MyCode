package com.qh.eligibility.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.qh.eligibility.util.Base;



public class CoverageInfoPage extends Base {
	


	@FindBy(how=How.XPATH, using="//*[@id='employer-module']/div/ul[1]/li[1]/span/a")
	WebElement Employer ;
	
	@FindBy(how=How.XPATH, using="//*[@id='employer-module']/div/ul[1]/li[2]/span")
	WebElement  Subgroup;
	
	@FindBy(how=How.XPATH, using="//*[@id='employer-module']/div/ul[1]/li[3]/span")
	WebElement GroupNumber ;
	
	@FindBy(how=How.XPATH, using=".//*[@id='employer-module']/div/ul[1]/li[4]/span")
	WebElement  Coverage;
	
	@FindBy(how=How.XPATH, using="//*[@id='employer-module']/div/ul[1]/li[5]/span")
	WebElement  Option;
	
	@FindBy(how=How.XPATH, using="//*[@id='employer-module']/div/ul[1]/li[6]/span")
	WebElement  PBM;
	
	@FindBy(how=How.XPATH, using="//*[@id='employer-module']/div/ul[1]/li[7]/span/a")
	WebElement  TPA;
	
	@FindBy(how=How.XPATH, using="//*[@id='employer-module']/div/ul[2]/li[1]/ul/li/a")
	WebElement Networks ;
	


}
