package com.phptravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.phptravels.base.Base;

public class HomePage extends Base {
  @FindBy(xpath="//*[@id=\"body-section\"]/div[1]/div/div/div[1]/h3")
  WebElement UserNameLabel;
  
  @FindBy(xpath="/html/body/nav/div/div[2]/ul[1]/li[1]/a/span")
  WebElement Hotels;
  
  @FindBy(xpath="/html/body/nav/div/div[2]/ul[1]/li[2]/a/span")
  WebElement Flights;
  
  @FindBy(xpath="/html/body/nav/div/div[2]/ul[1]/li[3]/a/span")
  WebElement Tours;
  
  @FindBy(xpath="//html/body/nav/div/div[2]/ul[1]/li[6]/a")
  WebElement Offers;
  
  public HomePage() {
	  PageFactory.initElements(driver, this);
  }
  
  public String verifyHomePageTitle() {
	  String HomePageTitle = driver.getTitle();
	  System.out.println(HomePageTitle);
	  Assert.assertEquals(HomePageTitle,"My Account" );
	  return HomePageTitle;
	  
  }
  
  public String userProfile() {
	  String str = UserNameLabel.getText();
	  System.out.println(str);
	  return str;
  }
  
  public void clickOnHotels() {
	  Hotels.click();
	 
  }
  
  public void clickOnFlights() {
	  Flights.click();
  }
  
  public void clickOnTours() {
	  Tours.click();
  }
  
  public void clickOnOffers() {
	  Offers.click();
  }
  
  
}
