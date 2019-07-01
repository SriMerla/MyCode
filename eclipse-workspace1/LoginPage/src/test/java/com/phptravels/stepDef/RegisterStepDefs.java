package com.phptravels.stepDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStepDefs {
	
	@Given ("^I navigate to register page$")
	public void navigate_to_registerpage() {
		
		System.out.println("user navigated to Registerpage");
	}
    @When ("^I enter <FirstName> in the first name text field$")
    public void enter_firstname() {
		
		System.out.println("user entered first name");
	}
    @And ("^I enter <LastName> in the last name text field$")
    public void enter_lastname() {
		
		System.out.println("user entered last name");
	}
    @And ("^I entter <email> in the email field$") 
    public void enter_email() {
		
		System.out.println("user entered email id");
	}
    @And ("^I enter <password> in the password textt field$")
    public void enter_password() {
		
		System.out.println("user entered password");
	}
    
    @And ("^I enter <confirmpass> in the password text field$") 
    public void enter_confirmpass() {
		
		System.out.println("user entered cofirmer password");
	}
    @And ("^I click submit button$")
    public void Click_submit() {
		
		System.out.println("user clickes submit button");
	}
    
    @Then ("^I verify dashboard confirmation message$")
    public void verify_dashboard() {
		
		System.out.println("user verifies dashboard confirmation message");
	}
    

}
