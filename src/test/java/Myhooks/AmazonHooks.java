package Myhooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {
	
	@Before
	public void global_before()
	{
		System.out.println("Global before");
	}
	
	@Before("@Smoke")
	public void setup_browser(Scenario sc)
	{
		System.out.println("Launch chrome browser");
		System.out.println(sc.getName());//Get the scenario name
		System.out.println(sc.getStatus());//Get the status of the scenario. o/p will be passed or failed
		
	}

/*	@Before(order=2)
	public void setup_url()
	{
		System.out.println("Launch amazon application");
	}
	
	@After(order=2)
	public void tearDown_close()
	{
		System.out.println("Close the browser");
	}
*/	
	@After("@Regression")
	public void tearDown_logout()
	{
		System.out.println("Logout the application");
	}
/*	
	@BeforeStep
	public void takeScreenshot() {
		System.out.println("Take the screenshot");
	}
	
	@AfterStep
	public void refresh()
	{
		System.out.println("Refreshing the page");
	}
*/
	
	@After
	public void global_After()
	{
		System.out.println("Global After");
	}	
}
