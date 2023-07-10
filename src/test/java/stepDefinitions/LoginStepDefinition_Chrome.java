package stepDefinitions;

import java.io.IOException;
import java.util.Properties;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import ExtentManager.BrowserFactory;
import ExtentManager.Propertyfile;
import PageObject.LoginPageObject;


public class LoginStepDefinition_Chrome {


	LoginPageObject LoginPageObject;
	private static SoftAssert s;
	private WebDriver driver;
	private BrowserFactory BrowserFac;

	 @Given("^Chrome user is on Login Page$")
	 public void chrome_user_is_on_Login_Page() throws Throwable {
		 try {
				BrowserFac = BrowserFactory.getinstance();
				System.out.println(BrowserFac.getDataFromConfigFile("demo-url"));
				BrowserFac.setup();
				this.driver = BrowserFac.getDriver();
				driver.get(BrowserFac.getDataFromConfigFile("demo-url"));
				LoginPageObject =new LoginPageObject(driver);
			} catch (IOException e) {
				e.printStackTrace();
			}
		 
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
