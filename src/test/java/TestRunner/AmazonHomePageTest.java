package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/AppFeatures/AmazonHomePage.feature"},
glue= {"stepdefinitions"},
plugin= {"pretty"})

public class AmazonHomePageTest {

}
