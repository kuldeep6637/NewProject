package com.DataDriver_kuldeep;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_NewRegistration 
{
	ChromeDriver driver;
   @BeforeTest
   public void setup ()
   {
	   driver = new ChromeDriver();
	   driver.get("http://newtours.demoaut.com/");
   }
   
   @Test(priority=1)
   public void register ()
   {
	   driver.findElementByLinkText("REGISTER").click();;
	   
   }
   
   @Test(priority=2)
   public void registration ()
   {
	   driver.findElementByName("firstName").sendKeys("kuldeep");
	   driver.findElementByName("lastName").sendKeys("lastName");
	   driver.findElementByName("phone").sendKeys("85858585");
	   driver.findElementByName("userName").sendKeys("kuldeep@gmail.com");
	   driver.findElementByName("address1").sendKeys("gandhibagh");
	   driver.findElementByName("city").sendKeys("nagpur");
	   driver.findElementByName("state").sendKeys("Maharastra");
	   driver.findElementByName("postalCode").sendKeys("440002");
	   driver.findElementByName("country").sendKeys("India");
	   driver.findElementByName("email").sendKeys("kuldeep123");
	   driver.findElementByName("password").sendKeys("kuldeep123");
	   driver.findElementByName("confirmPassword").sendKeys("kuldeep123");
	   
	   driver.findElementByName("register").click();
	   
	  String ExpectedUserName= "kuldee123";
	  
	  String ActualText= driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b").getText();
	  
	  if(ActualText.contains(ExpectedUserName))
	  {
		  System.out.println("User Registered---Pass");
	  }
	  else
	  
	  {   
	     System.out.println("User Not Registered---Fail");
	  }
	  driver.close();
	   
   }
   
  
   
 
}

