package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	

	@RunWith(Cucumber.class)
	@CucumberOptions(features={"src/test/resources/AppFeatures/Orders.feature"},
	glue= {"stepdefinitions/OrderSteps"},
	//tags="@Smoke or @Regression",
	//tags=" not @Regression", 
		dryRun=false,
	plugin= {"pretty"})
	
	public class OrderTest{

}
