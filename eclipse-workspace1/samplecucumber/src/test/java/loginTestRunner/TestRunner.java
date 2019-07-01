package loginTestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="resources/features/login.feature", 
                 glue= "stepimplementation"
                 )
public class TestRunner {
	

}
