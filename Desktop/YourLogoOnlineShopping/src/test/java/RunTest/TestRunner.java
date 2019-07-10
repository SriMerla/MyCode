package RunTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/EndToEndTest.feature", 
                 glue= {"stepDefinitions"}   
                
                 )
public class TestRunner {

}
