package stepdefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistration {
	
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
	    	}

	@When("User enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {
		//asLists will returns list of list of strings
		List<List<String>>userlist=dataTable.asLists(String.class);
		for(List<String>e : userlist)
		{
			System.out.println(e);
		}
	   	 	}
	
	@When("User enters following user details with columns")
	public void user_enters_following_user_details_with_columns(DataTable dataTable) {
		//asMaps will returns list of maps
		List<Map<String, String>> userList=dataTable.asMaps(String.class, String.class);
		System.out.println(userList);
		//System.out.println(userList.get(0).get("firstname"));
		//System.out.println(userList.get(0).get("lastname"));
		
		for(Map<String, String> e: userList)
		{
			System.out.println(e.get("firstname"));
			System.out.println(e.get("lastname"));
		//	System.out.println(e.get("email"));
//			System.out.println(e.get("phone"));
//			System.out.println(e.get("City"));
					}
	     	}


	@Then("user registration should be successful")
	public void user_registration_should_be_successful() {
	    	}



}
