package com.qh.cucumber.stepDef;

import java.util.Map;

import com.qh.eligibility.pages.SearchPage;
import com.qh.eligibility.util.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;

public class SearchPageStepDefs extends Base{
	
	@And("^I click the \"(.*)\" record from the search results$")
	public void click_the_record_from_search_results(String record) throws Throwable {
	new SearchPage().select_search_result(record);
	}
	
	@And("^I enter search criteria using the following$")
	public void i_enter_search_criteria(DataTable nameDetails){
	for (Map<String, String> data : nameDetails.asMaps(String.class, String.class)) {
		SearchPage.FirstName.clear();
		SearchPage.FirstName.sendKeys(data.get("FirstName"));
		SearchPage.LastName.clear();
		SearchPage.LastName.sendKeys(data.get("LastName"));
		    
			}
		
	}

}
