package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//import junit.framework.Assert;

public class Login_StepDef {
	WebDriver driver;
	@Given("^I want navigate to login page$")
	public void i_want_navigate_to_login_page()  {
		 System.setProperty("webdriver.gecko.driver","\\\\Mac\\Home\\Desktop\\BrowserDrivers\\GeckoDriver\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		  driver=new FirefoxDriver(); 
		  driver.get("https://www.phptravels.net/login");
		  String Title = driver.getTitle(); System.out.println(Title);
		  //Assert.assertEquals("Login", Title);
		System.out.println("user is on login page");
	   
	}

	@When("^I enter username \"(.*)\"$")
	public void i_enter_username(String username)  {
	  driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[1]/input")).sendKeys(username);
		System.out.println("user entered username");
	 
	    
	}

	@When("^I enter password \"(.*)\"$")
	public void i_enter_password(String password)  {
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[2]/input")).sendKeys(password);
		System.out.println("user enteres password");
		
	   
	}
	@And ("^I click login button$")
	public void i_click_login_button() {
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button")).click();
		System.out.println("user clickes login button");
	}

	@Then("^I check cofirmation message$")
	public void i_check_cofirmation_message() {
	    String dashboardTitle = driver.getTitle();
	    System.out.println(dashboardTitle);
	    //Assert.assertEquals("My Account", dashboardTitle);
	   driver.close();
		System.out.println("user confirmation message");
	    
	    
	}


}
