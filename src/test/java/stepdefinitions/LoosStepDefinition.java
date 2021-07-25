package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoosStepDefinition {
	
	@Given("^User Login to app$")
	public void user_login_to_app() {
	    System.out.println("loos");	}

	@Then("^User Enters home page$")
	public void user_enters_home_page() {
	    System.out.println("Homepage");	}


	@Then("^User enters \"([^\"]+)\" and (\\d+)$")
	public void user_enters_and(String string, Integer int1) {
	  	}

	@Then("User performs {string}")
	public void user_performs(String string) {
	  	}

	@Then("User adds {string}")
	public void user_adds(String string) {
	  	}

}
