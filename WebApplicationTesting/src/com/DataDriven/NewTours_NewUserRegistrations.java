package com.DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_NewUserRegistrations
{
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		 driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}
	
	@Test(priority=1)
	public void Register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
		
	}
	
	@Test(priority=2)
	public void UserRegistration()
	{
		
		driver.findElement(By.name("firstName")).sendKeys("Nitish");
		driver.findElement(By.name("lastName")).sendKeys("Hello");
		driver.findElement(By.name("phone")).sendKeys("77777");
		driver.findElement(By.id("userName")).sendKeys("Nitish@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Shivaji Road");
		driver.findElement(By.name("city")).sendKeys("Nagpur");
		driver.findElement(By.name("state")).sendKeys("Maharastra");
		driver.findElement(By.name("postalCode")).sendKeys("50001");
		driver.findElement(By.name("country")).sendKeys("INDIA");
		driver.findElement(By.id("email")).sendKeys("Nitishhhh");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("confirmPassword")).sendKeys("abc123");
		
		driver.findElementByName("register").click();
		
		String ExpectedUserName="Nitishhhh";
		
		String ActualText=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		
		if(ActualText.contains(ExpectedUserName))
		{
			System.out.println("User successfully registered -- PASS");
		}
		else
		{
			System.out.println("User registration Failed -- FAIL");
		}
		
		driver.close();
	}
	
}
