package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "Feature", glue = {"Stepdef"}, monochrome = true, dryRun = false, plugin = {"pretty",
		"html:target/cucumber-reports.html"})
public class TestRunne extends AbstractTestNGCucumberTests {

}
		