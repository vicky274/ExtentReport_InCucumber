package MyRunner;


import java.io.File;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import gherkin.formatter.model.Scenario;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions","TestUtilityHooks"},
        tags = "~@ignored",
        dryRun=false,
        monochrome=true,
        strict=true,
        plugin = {
                "html:target/Cucumber_maven_Report/cucumber-pretty",
                "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
        })
public class FirstTestRunner{
	
}

/*
 Running feature files in parallel in cucumber:

1)Create runner classes
2)use feature level tags in feature file
3)mention runner class in surefire plugin under includes tag/or else provide class in testng file 
and provide testng root path in surefire plugin under SuitexmlFiles tag
4)set fork count and reusefork options in surefire to execute.


Cucumber test as TestNG
add testng and cucumber-testng dependency

1)Extend AbstractTestNGCucumberTests class
2)remove @RunWith used for Junit
3)Run as TestNG Test(use the runner class in run config)/run as maven test it will generate surefire report under target folder

Run as Maven test

1)Include runner class file under include tag in surefire plugin/ or set in testng file and enable junit attribute to true
 and then set the filepath in surefire plugin under suitexmlfiles
*/
//Run cucumber test by testng
//@RunWith(Cucumber.class)

/*@CucumberOptions(
      features = "src/test/resources/features",
      glue = {"stepDefinitions","TestUtilityHooks"},
      tags = {"@firefox5100,@chrome_5101"},
      dryRun=false,
      monochrome=true,
      strict=true,
      plugin = {
              "html:target/Cucumber_maven_Report/cucumber-pretty",
              "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
      })
public class TestRunner {
 
	 private TestNGCucumberRunner testNGCucumberRunner;

	    @BeforeClass(alwaysRun = true)
	    public void setUpClass() throws Exception {
	        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	    }

	    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	    public void feature(CucumberFeatureWrapper cucumberFeature) {
	        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	    }

	    *//**
	     * @return returns two dimensional array of {@link CucumberFeatureWrapper} objects.
	     *//*
	    @DataProvider(parallel=true)
	    public Object[][] features() {
	        return testNGCucumberRunner.provideFeatures();
	    }

	    @AfterClass(alwaysRun = true)
	    public void tearDownClass() throws Exception {
	        testNGCucumberRunner.finish();
	    }
}*/



//For parallel Execution

/*@RunWith(Cucumber.class)
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
                "com.cucumber.listener.ExtentCucumberFormatter:target/1/cucumber-reports/report.html"
        })
public class TestRunner {
   
}*/