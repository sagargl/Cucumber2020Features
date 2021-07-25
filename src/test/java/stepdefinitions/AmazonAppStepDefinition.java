package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonAppStepDefinition {
	@Given("User Logins to the FedApp")
	public void user_logins_to_the_fed_app() {
System.out.println("Login to fed app");
	}

	@When("User Enters Username")
	public void user_enters_username() {
System.out.println("Enters username");	}

	@Then("User Logins to the App")
	public void user_logins_to_the_app() {
System.out.println("entes to app");	}

	@When("user clicks on App Order link")
	public void user_clicks_on_app_order_link() {
	    System.out.println("Click on app order link");	}

	@Then("user checks the previous app order detials")
	public void user_checks_the_previous_app_order_detials() {
	    System.out.println("Checks previous");	}

	@When("user clicks on App Open Orders link")
	public void user_clicks_on_app_open_orders_link() {
	    System.out.println("Click on app orders link");	}

	@Then("user checks the app open order details")
	public void user_checks_the_app_open_order_details() {
	   System.out.println("Open order");	}

	@When("user clicks on App Cancelled Orders link")
	public void user_clicks_on_app_cancelled_orders_link() {
	    System.out.println("Cancelled");	}

	@Then("user checks the app cancelled order details")
	public void user_checks_the_app_cancelled_order_details() {
	    System.out.println("Cancelled order");	}

}
