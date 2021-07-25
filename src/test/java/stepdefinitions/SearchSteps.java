package stepdefinitions;

import AmazonImplementation.Product;
import AmazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SearchSteps {
	Product product;
	Search search;
	
	
	@Given("^I have a Search field on Amazon Page$")
	public void i_have_a_search_field_on_amazon_page() {
		System.out.println("Step 1: I am on search page");
	    	}

	@When("I search a product with name {string} and price {int}")
	public void i_search_a_product_with_name_and_price(String productName, Integer price) {
		System.out.println("Step 2 : Search the Product with name : "
						+ productName + " Price : " +price);
		product=new Product(productName, price);
	    	}

	@Then("I search with name {string} should be displayed")
	public void i_search_with_name_should_be_displayed(String productName) {
		System.out.println("Step 3 : product " + productName + " is displayed ");
		search=new Search();
		String name=search.displayProduct(product);
		System.out.println("searched product is : " +name);
		//Assert.assertEquals(product.getProductname(), name);
	    	}



}
