package steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features"}, 
						glue = {"pages","steps"},
						tags= {"@smoke or @sanity"},
						monochrome= true) 
public class RunJunit {


}
