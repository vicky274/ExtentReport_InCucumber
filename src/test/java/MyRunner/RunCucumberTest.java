package MyRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
//"html:target/Cucumber_maven_Report/cucumber-pretty.html"
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions","TestUtilityHooks"},
        tags = "@RegressionTest",
        //tags = "@RegressionTest or @SmokeTest",
        dryRun=false,
        monochrome=true,
        plugin = {"pretty", "html:target/cucumberHtmlReport.html",     //  for html result
                "json:target/cucumber-report.json"   // for json result
         })
public class RunCucumberTest {
}
