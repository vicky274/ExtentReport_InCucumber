package stepDefinitions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import ExtentManager.Driverhandle;
import ExtentManager.Propertyfile;
import PageObject.LoginPageObject;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition_Chrome {

	 Driverhandle Driverhandle = new Driverhandle();
	 LoginPageObject LoginPageObject;
	 WebDriver driver;

	 @Given("^Chrome user is on Login Page$")
	 public void chrome_user_is_on_Login_Page() throws Throwable {
		 driver = Driverhandle.setup("demo-url");
		 LoginPageObject =new LoginPageObject(driver);
		 Propertyfile Propertyfile= new Propertyfile();
	     Properties prop = Propertyfile.loadPropertiesFile("db.properties");
	     prop.forEach((k, v) -> System.out.println(k + ":" + v));
	        
		
	 }

	 @When("^user quit the Chrome browser$")
	 public void user_quit_the_Chrome_browser() throws Throwable {
	    Thread.sleep(5000);
	    driver.close();
	 }
	

}
