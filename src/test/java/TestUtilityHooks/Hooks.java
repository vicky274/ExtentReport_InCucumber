package TestUtilityHooks;


import ExtentManager.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import stepDefinitions.ApplicationTest;

import java.io.IOException;
import java.time.Duration;

public class Hooks {

	public BrowserFactory BrowserFactory;

	@Before(order=1)
	public void beforeScenario(Scenario scenario) {

		System.out.println("SCENARIO : " + scenario.getName());

	}

	@Before(order=2)
	public void before_scenario() throws IOException {

		System.out.println("*****************Executed before Scenario starts**************");
		/*BrowserFactory = BrowserFactory.getinstance();
		BrowserFactory.setup();*/

		/*// Write code here that turns the phrase above into concrete actions
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver  = WebDriverManager.chromedriver().capabilities(option).create();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();*/
	}
	
	@After
	public void After_scenario()
	{

		System.out.println("*****************Executed after Scenario ends*****************");
	}

	@AfterAll
	public static void after_all(){
		System.out.println("*****************All Scenarios Completed**************");

	}
	
}
