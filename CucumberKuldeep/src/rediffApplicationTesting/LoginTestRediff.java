package rediffApplicationTesting;

import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTestRediff 

{


	FirefoxDriver driver;


@Given("^Open Firefox Browser and nevigate to Rediff Application$")
public void Open_Firefox_Browser_and_nevigate_to_Rediff_Application() throws Throwable 
{
	driver = new FirefoxDriver();
	driver.get("http://www.rediff.com/");
    
}

@When("^User enters Valid User Id and Password and click on SingIn$")
public void User_enters_Valid_User_Id_and_Password_and_click_on_SingIn() throws Throwable 
{
	driver.findElementByTagName("Sign in").click();
	driver.findElementById("login1").sendKeys("nitish");
	driver.findElementById("password").sendKeys("nitish");
	driver.findElementByName("proceed").click();   
}

@Then("^User should be able to login and should close the application$")
public void User_should_be_able_to_login_and_should_close_the_application() throws Throwable 
{
	driver.close();
    
}



}
