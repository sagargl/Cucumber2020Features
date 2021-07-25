package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/AppFeatures/Search.feature"},
glue= {"stepdefinitions", "Myhooks"},
tags="@Smoke or @Regression",
plugin= {"pretty", "json:target/MyReports/reports.json", "junit:target/MyReports/reports.xml"},
publish=true,
monochrome=true,
dryRun=false,
strict=true



)
public class AmazonTest {


}
