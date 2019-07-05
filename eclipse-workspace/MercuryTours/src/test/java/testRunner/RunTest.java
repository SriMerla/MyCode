package testRunner;

import org.junit.runner.RunWith;

import com.mercuryTours.utils.BaseTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Login.feature", 
                 glue= "StepDefinitions"
                 )

public class RunTest extends BaseTest {
	

}
