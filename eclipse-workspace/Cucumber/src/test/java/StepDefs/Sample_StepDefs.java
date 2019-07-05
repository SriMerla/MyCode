package StepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sample_StepDefs {
	@Given("^user is on login page$")
	public void user_is_on_login_page()  {
	    System.out.println("user is on login page");
	}

	@When("^user enteres valid username and password$")
	public void user_enteres_valid_username_and_password() {
	   System.out.println("user entered valid username and password");
	}

	@Then("^user verify confirmation message$")
	public void user_verify_confirmation_message()  {
	    System.out.println("This the confirmation message");
	}


}
