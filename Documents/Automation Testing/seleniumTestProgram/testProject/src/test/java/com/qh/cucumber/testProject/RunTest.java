package com.qh.cucumber.testProject;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
	 				features = {"src/test/resources/Features/EditFunctionality.feature"}, 
	 				glue={"com.qh.cucumber.stepDef"}, 
	 				plugin={"pretty","html:report.html", "json:target/cucumber.json"} ,
	 				monochrome = true
                  )

public class RunTest extends AbstractTestNGCucumberTests{
	
}


