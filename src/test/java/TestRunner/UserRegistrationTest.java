package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/AppFeatures/Registration.feature"},
glue= {"stepdefinitions"},
plugin= {"pretty", "json:target/MyReports/reports.json", "junit:target/MyReports/reports.xml"},
publish=true,
monochrome=true,
dryRun=false)

public class UserRegistrationTest {

}
