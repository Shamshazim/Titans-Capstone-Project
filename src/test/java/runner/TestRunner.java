package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;


@RunWith (Cucumber.class)
@CucumberOptions (
		features = ".\\src\\test\\resources\\feature",
		glue = "step.definition",
	 	tags = "@Complete",
		dryRun = false,
		monochrome = true,
		strict = true, 
		plugin = {"pretty","html:target/site/cucumber-pretty","json:target/cucumber.json"},
		publish = true
		)



public class TestRunner {
	@AfterClass
    public static void  generateReport() {
    CucumberReportingConfig.reportConfig();
	
	}
}
