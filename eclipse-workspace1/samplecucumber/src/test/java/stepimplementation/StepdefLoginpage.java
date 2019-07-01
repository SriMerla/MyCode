package stepimplementation;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefLoginpage {
	
	WebDriver driver;
	@Given ("^user is on login page$")
	public void user_on_loginpage() {
	  
		System.out.println("user is on login page");
		
	}
	
	@When ("^user enters correct username and password$")
	public void user_enters_username_password() {
		
		System.out.println("user entered correct username and password");
	}
	
	@Then ("^user gets confirmation$")
	public void confirmation() {
		
		System.out.println("Confirmation message -- Successfull login");
	}

	@Given("^Sample Test$")
	public void sampleTest() throws Throwable {
		System.out.print("Test Executed 222");
		Thread.sleep(5000);
	}


}
