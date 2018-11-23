package com.TestNG_KulDeep;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLogInGmail 
{
	
	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		 driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	}
	
	@Test 
	public void LogInTest()
	{   
	   
		driver.findElementById("usernameId").sendKeys("Delhi");
		driver.findElementByClassName("loginPassword").sendKeys("Nagpur");
		driver.findElementById("loginbutton").click();
	}
	@AfterTest 
	public void tearDown()
	{driver.close();
	
	}

}
