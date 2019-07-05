package com.phptravels.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.phptravels.base.Base;

public class HotelPage extends Base{
	
	@FindBy(how=How.XPATH,using="//*[@id=\"s2id_autogen3\"]/a/span[1]")
	WebElement HotelName;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"dpd1\"]/div/input")
	WebElement CheckInDate;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"dpd2\"]/div/input")
	WebElement CheckOutDate;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"travellersInput\"]")
	WebElement Travellers;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"hotels\"]/form/div[5]/button")
	WebElement SearchButton;
	
	public HotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterHotelName(String hotel) throws InterruptedException {
		HotelName.click();
		Thread.sleep(3000);
		HotelName.sendKeys(hotel);
		
		
	}
	
	public void enterCheckInDate(String dateIN ) throws InterruptedException {
		
		CheckInDate.click();
		Thread.sleep(3000);
		Select CheckinDate = new Select(CheckInDate);
		CheckinDate.selectByVisibleText(dateIN);
		
	}
	
	public void enterCheckOutDate(int dateOut) throws InterruptedException {
	
		CheckOutDate.click();
		Thread.sleep(3000);
	 Select CheckoutDate = new Select(CheckOutDate);
	 CheckoutDate.selectByIndex(dateOut);
	}
	
	public void enterSearchButton() {
		
		SearchButton.click();
		
		}
}


