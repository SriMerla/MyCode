package com.phptravels.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		        features = "src/test/resources/Features/Login.feature",
		        glue = "com.phptravels.stepDef",
		        plugin={"pretty","html:report.html", "json:target/cucumber.json"} ,
 				monochrome = true
		        )
public class RunTest {

}
