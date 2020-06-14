package MyRunner;


import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import gherkin.formatter.model.Scenario;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"stepDefinitions","TestUtilityHooks"},
        tags = {"@scenario1"},
        dryRun=false,
        monochrome=true,
        strict=true,
        plugin = {
                "pretty",
                "html:target/Cucumber_maven_Report/cucumber-pretty",
                "json:target/Cucumber-reports/CucumberTestReport.json",
                "rerun:target/Cucumber_maven_Report/cucumber-rerun/rerun.txt",
                "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
        })
public class RunnerCukesTest {
   
	/* @AfterClass
	 public static void writeExtentReport() {
	 Reporter.loadXMLConfig(new File("./Cucumber-Project/src/main/resources/extent-config.xml"));
	 }*/
    
}