package com.phptravels.stepDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginStepDefs {
	
	@Given ("^user is on the login page$")
	public void navigate_to_registerpage() {
		
		System.out.println("user navigated to Registerpage");
	}
    @When ("^user enter username and password$")
    public void enter_firstname() {
		
		System.out.println("user entered first name");
	}
    @And ("^user checks confirmation message$")
    public void enter_lastname() {
		
		System.out.println("user entered last name");
	}
	
	
}
