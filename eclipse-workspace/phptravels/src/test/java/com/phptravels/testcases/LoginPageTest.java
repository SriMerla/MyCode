package com.phptravels.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.base.Base;
import com.phptravels.pages.HomePage;
import com.phptravels.pages.LoginPage;

public class LoginPageTest extends Base {
	LoginPage loginPage;
	HomePage homePage;
	public LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		intialize();
	    loginPage = new LoginPage();	
	}
	@Test(priority=1)
	public void loginPageTitle() {
		String Title = loginPage.validateLoginPage();
		System.out.println(Title);
		Assert.assertEquals(Title, "Login");
	}
	@Test(priority=2)
	public void loggedInPage() throws InterruptedException {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(20);
	}
	
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
