package TestUtilityHooks;

import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks {

	

	@Before(order=1)
	public void beforeScenario(Scenario scenario) {
	 Reporter.assignAuthor("Author - Vignesh");
	
	}
	
	
	@Before(order=2)
	public void setup(){
		System.out.println("*****************Executed before Scenario starts**************");
	}
	
	@After
	public void Aftersetup(){
		System.out.println("*****************Executed after Scenario ends*****************");
	}
	
	
}
