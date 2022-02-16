package stepDefinitions;

import core.baseC;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class initializer extends baseC {

	
	@Before
	public void beforeHooks(Scenario scenario) {
		logger.info("Scenario "+ scenario.getName() + " Started");
		browser(); //this line will launch our browser
		openBrowser(); //this line will launch the URL for us
	}
	
	
	@After
	public void afterHooks(Scenario scenario) {
		tearDown();
		logger.info("Scenario " + scenario.getName() + " " + scenario.getStatus());
	}
}
