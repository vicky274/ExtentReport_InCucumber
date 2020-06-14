package stepDefinitions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import ExtentManager.Driverhandle;
import ExtentManager.Propertyfile;
import PageObject.LoginPageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends Driverhandle{
	
	 Driverhandle Driverhandle = new Driverhandle();
	 LoginPageObject LoginPageObject;
	 WebDriver driver;

	 @Given("^user is already on Login Page$")
	 public void user_is_already_on_Login_Page() throws Throwable {
		 
		 driver = Driverhandle.setup("demo-url");
		 LoginPageObject =new LoginPageObject(driver);
		 Propertyfile Propertyfile= new Propertyfile();
	     Properties prop = Propertyfile.loadPropertiesFile("db.properties");
	     prop.forEach((k, v) -> System.out.println(k + ":" + v));
	        
		
	 }

	 @When("^user enters First Name text in first name field$")
	 public void user_enters_First_Name_text_in_first_name_field() throws Throwable {
	     
		 LoginPageObject.enterfirstName("Vignesh");
		 LoginPageObject.enteremail("vimessi2@gmail.com");
		 LoginPageObject.entercity("Chennai");
		 LoginPageObject.enterPhone("7259635699");
		 LoginPageObject.enterAddress("Pacifica Aurum");
		 LoginPageObject.enterzipCode("603103");
		 LoginPageObject.enterwebsite("www.google.co.in");
	 }

	 @When("^user enters Last Name text in last name field$")
	 public void user_enters_Last_Name_text_in_last_name_field() throws Throwable {
		 LoginPageObject.enterlastName("Elangovan");
	     
	 }

	 @When("^user selects State  in State field$")
	 public void user_selects_State_in_State_field() throws Throwable {
	     
		 LoginPageObject.selectDropdown("California");
	     
	 }

	 @When("^user clicked on radio button$")
	 public void user_clicked_on_radio_button() throws Throwable {
		 
		 LoginPageObject.clickRadiobutton();
	     
	 }

	 @When("^user enters all other fields$")
	 public void user_enters_all_other_fields() throws Throwable {
	     
	     
	 }

	 @Then("^Close the browser$")
	 public void close_the_browser() throws Throwable {
	     Thread.sleep(5000);
	     
		 driver.close();
	     
	 }
	 
	 
	 //scenario 2
	 
	 @When("^user gets title of page$")
	 public void user_gets_title_of_page() throws Throwable {
	     
	     Assert.assertEquals(driver.getTitle(), "Selenium Easy - Input Form Demo with Validations","Title not matched");
	 }

	 @When("^user compared with actual title$")
	 public void user_compared_with_actual_title() throws Throwable {
	    
	 }
	

}
