package stepDefinitions;

import ExtentManager.BrowserFactory;
import PageObject.ApplicationLoginPage;
import PageObject.LoginPageObject;
import TestData.RetreiveData;
import TestUtilityHooks.BaseDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.time.Duration;


public class ApplicationTest  extends RetreiveData{
    private static SoftAssert s;
    private WebDriver driver;
    private BrowserFactory BrowserFac;
    private ApplicationLoginPage ApplicationLoginPage ;

    @Given("user the access to the application")
    public void user_the_access_to_the_application() throws IOException {
       /* BrowserFac = BrowserFactory.getinstance();
        BrowserFac.setup();
        this.driver = BrowserFac.getDriver();

        ApplicationLoginPage = new ApplicationLoginPage(driver);

        System.out.println(BrowserFac.getDataFromConfigFile("url"));
        driver.get(BrowserFac.getDataFromConfigFile("url"));*/
        //new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ApplicationLoginPage.Accept_All)).click();
    }

    @When("vicky enters the username")
    public void vicky_enters_the_username() throws InterruptedException {
      
        Thread.sleep(5000);
        ApplicationLoginPage.Name.sendKeys("FirstName");

    }
    @When("vicky enters the password")
    public void vicky_enters_the_password() {
        ApplicationLoginPage.Last_Name.sendKeys("LastName");
      
        
    }
    @When("vicky click on login button")
    public void vicky_click_on_login_button() {

        ApplicationLoginPage.Email.sendKeys("test@gmail.com");
      
        
    }
    @Then("vicky logged into application")
    public void vicky_logged_into_application() {
      
        
    }
    @Then("vicky quit the Chrome browser")
    public void vicky_quit_the_chrome_browser() {
      
        driver.quit();
    }
    
    @When("test enters the username <username>")
    public void test_enters_the_username_username() throws InterruptedException{
      
        driver.navigate().refresh();
        Thread.sleep(5000);
        ApplicationLoginPage.Name.sendKeys("test");
    }
    @When("test enters the password")
    public void test_enters_the_password() {

        ApplicationLoginPage.Last_Name.sendKeys("test");
        ApplicationLoginPage.Email.sendKeys("vimessi@gmail.com");
    }
    @When("test on login button")
    public void test_on_login_button() {
      
        
    }
    @Then("test logged into application")
    public void test_logged_into_application() {
      
        
    }
    @Then("test quit the Chrome browser")
    public void test_quit_the_chrome_browser() {
      driver.quit();
    }

    //third scenario
    @When("user get data from Excel sheet {string}")
    public void user_get_data_from_excel_sheet(String ExcelfileName) {
        try{
            RetreiveData.SetExcelFile(ExcelfileName,"Sheet1");
            RetreiveData.getCellData_Rate();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}