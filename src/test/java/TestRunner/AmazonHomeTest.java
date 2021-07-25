package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/AppFeatures/AmazonHome.feature"},
glue= {"stepdefinitions","MYHooks"},
plugin= {"pretty"},
publish=true,
monochrome=true,
dryRun=false
)

public class AmazonHomeTest {

}
