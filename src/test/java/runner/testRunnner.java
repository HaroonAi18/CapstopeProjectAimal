package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//-------------------------------------------------------------------
	@RunWith(Cucumber.class)
	@CucumberOptions(
			
			features = "C:\\Users\\Mharo\\eclipse-workspaceVersion2\\CapstoneProject\\src\\test\\resources\\features",
			glue = "C:/Users/Mharo/eclipse-workspaceVersion2/HaroonCapstone/src/test/java/stepDefinitions",
			tags = "@verifyItems",
			
			strict = true,
			dryRun = false,
			monochrome = true,
			
			
	plugin = {
			"pretty",
			"html:target/site/cucumber-pretty",
			"json:target/cucumber.json"
	},
	publish = true
	)

public class testRunnner{
	
}
//-------------------------------------------------------------------