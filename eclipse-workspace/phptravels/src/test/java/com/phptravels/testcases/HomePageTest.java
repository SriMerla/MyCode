package com.phptravels.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.base.Base;
import com.phptravels.pages.HomePage;
import com.phptravels.pages.LoginPage;

public class HomePageTest extends Base {
	LoginPage logInPage;
	HomePage homePage;
	public HomePageTest() {
		super();
	}
	@Test(priority=1)
	public void setup() {
		intialize();
		logInPage = new LoginPage();
		homePage = logInPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=3)
	public void checkHomePageTitle() throws InterruptedException {
		homePage.verifyHomePageTitle();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void userProfilename() {
		homePage.userProfile();
	}
	@Test(priority=4)
	public void HotelPage() {
	homePage.clickOnHotels();
	}
	@Test(priority=5)
	public void FlightPage() {
		driver.navigate().back();
		homePage.clickOnFlights();
		
	}
	@Test(priority=6)
	public void ToursPage() {
		driver.navigate().back();
		homePage.clickOnTours();
	}
	
	
	@Test(priority=7)
	public void teardown() {
		driver.quit();
	}

}
