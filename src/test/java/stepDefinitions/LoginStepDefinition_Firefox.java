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

public class LoginStepDefinition_Firefox {

	 Driverhandle Driverhandle = new Driverhandle();
	 LoginPageObject LoginPageObject;
	 WebDriver driver;

	 @Given("^Firefox user is already on Login Page$")
	 public void firefox_user_is_already_on_Login_Page() throws Throwable {
	    
		 driver = Driverhandle.setup("demo-url");
		 LoginPageObject =new LoginPageObject(driver);
		 Propertyfile Propertyfile= new Propertyfile();
	     Properties prop = Propertyfile.loadPropertiesFile("db.properties");
	     prop.forEach((k, v) -> System.out.println(k + ":" + v));
	 }

	 @When("^Firefox user enters first name data in first name field in firefox$")
	 public void firefox_user_enters_first_name_data_in_first_name_field_in_firefox() throws Throwable {
		 LoginPageObject.enterfirstName("Vignesh");
		 LoginPageObject.enterlastName("Elangovan");
		 LoginPageObject.enterPhone("23244432");
	     
	 }

	 @When("^Firefox user enters Lastname data in last name field in firefox$")
	 public void firefox_user_enters_Lastname_data_in_last_name_field_in_firefox() throws Throwable {
	     
		 LoginPageObject.selectDropdown("California");
	 }

	 @When("^Firefox user selects State  in State field in firefox$")
	 public void firefox_user_selects_State_in_State_field_in_firefox() throws Throwable {
		 LoginPageObject.clickRadiobutton();
	     
	 }

	 @When("^Firefox user clicked on radio button in firefox$")
	 public void firefox_user_clicked_on_radio_button_in_firefox() throws Throwable {
	     
	     
	 }

	 @Then("^Close the Firefox browser$")
	 public void close_the_Firefox_browser() throws Throwable {
		  Thread.sleep(5000);
			 driver.close();
	     
	 }

}
