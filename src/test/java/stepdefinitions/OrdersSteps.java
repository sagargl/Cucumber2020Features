package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrdersSteps {
	
	@Given("a registered user exists")
	public void a_registered_user_exists() {
	    System.out.println("Registered user");
	}

	@Given("user is on Amazon login page")
	public void user_is_on_amazon_login_page() {
		System.out.println("Amazon login page");	}

	@When("user enters username")
	public void user_enters_username() {
		System.out.println("Enters username");
		}

	@When("user enters password")
	public void user_enters_password() {
		System.out.println("Enters password");
		}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println("Enters login button");
		}

	@Then("user navigates to order page")
	public void user_navigates_to_order_page() {
		System.out.println("Navigates to order page");
		}

	@When("user clicks on Order link")
	public void user_clicks_on_order_link() {
		System.out.println("Clicks on order link");
		}

	@Then("user checks the previous order detials")
	public void user_checks_the_previous_order_detials() {
		System.out.println("Checks on previous order details");
		}

	@When("user clicks on Open Orders link")
	public void user_clicks_on_open_orders_link() {
		System.out.println("Clicks on order link");
		}

	@Then("user checks the open order details")
	public void user_checks_the_open_order_details() {
		System.out.println("Checks on open order details");
		}

	@When("user clicks on Cancelled Orders link")
	public void user_clicks_on_cancelled_orders_link() {
		System.out.println("Clicks on cancelled orders link");
		}

	@Then("user checks the cancelled order details")
	public void user_checks_the_cancelled_order_details() {
		System.out.println("Checks on cancelled order details");	}


}
