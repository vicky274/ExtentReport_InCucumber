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

/*"json:target/Cucumber-reports/CucumberTestReport.json",
"rerun:target/Cucumber_maven_Report/cucumber-rerun/rerun.txt",*/
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions","TestUtilityHooks"},
        tags = {"~@ignored"},
        dryRun=false,
        monochrome=true,
        strict=true,
        plugin = {
                "pretty",
                "html:target/Cucumber_maven_Report/cucumber-pretty",
                "com.cucumber.listener.ExtentCucumberFormatter:target/2/cucumber-reports/report.html"
        })
public class SecondTestRunner {
   
}