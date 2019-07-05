package com.phptravels.testcases;

import org.testng.annotations.Test;

import com.phptravels.base.Base;
import com.phptravels.pages.HomePage;
import com.phptravels.pages.HotelPage;
import com.phptravels.pages.LoginPage;

public class HotelPageTest extends Base {
	LoginPage Login;
	HomePage Home;
	HotelPage Hotel;
	
	
	public HotelPageTest() {
		super();
	}
	
	@Test(priority=1)
	public void setUp() throws InterruptedException {
		intialize();
		Login = new LoginPage();
		Home = Login.login(prop.getProperty("username"), prop.getProperty("password"));
	    Thread.sleep(4000);
		Home.clickOnHotels();
	}
	
//	@Test
//	public void enterDetails() throws InterruptedException {
//		Hotel = new HotelPage();
//		Hotel.enterHotelName(prop.getProperty("hotelName"));
//		 Thread.sleep(2000);
//		Hotel.enterCheckInDate("15");
//		 Thread.sleep(2000);
//		Hotel.enterCheckOutDate(20);
//		 Thread.sleep(2000);
//		Hotel.enterSearchButton();
//		 Thread.sleep(2000);
//	}
//	@Test(priority=2)
//	public void hotelName() throws InterruptedException {
//	
//		Hotel = new HotelPage();
//	    Hotel.enterHotelName("Swissotel");
//	    Thread.sleep(2000);
//	}
//	@Test(priority=3)
//	public void checkinDate() throws InterruptedException {
//		
//		Hotel.enterCheckInDate("15");
//		Thread.sleep(2000);
//		
//	}
//	@Test(priority=4)
//	public void checkoutDate() throws InterruptedException {
//		 Hotel.enterCheckOutDate(20);
//		 Thread.sleep(2000);
//	 }
	@Test(priority=5)
	public void clickSearch()  {
	System.out.println("This is a search button");
	Hotel = new HotelPage();
	Hotel.enterSearchButton();
	
	}
	
	@Test(priority=6)
	public void tearDown() {
		driver.quit();
	}

}
