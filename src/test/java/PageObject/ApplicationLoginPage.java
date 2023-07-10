package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ApplicationLoginPage {


    WebDriver driver;
    @FindBy(xpath="//input[@name='first-name']")
    public WebElement Name;
    @FindBy(xpath="//input[@name='last-name']")
    public WebElement Last_Name;
    @FindBy(xpath="//input[@name='email']")
    public WebElement Email;

    @FindBy(xpath="//button[text()='ACCEPT ALL']")
    public WebElement Accept_All;

    public ApplicationLoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }


}
