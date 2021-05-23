package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(features="FeatureFile",glue={"StepsDefinations"},
monochrome=true,
plugin = {"pretty","html:target/cucumber",
		"json:target/cucumber.json"})

public class testRunner {

}
