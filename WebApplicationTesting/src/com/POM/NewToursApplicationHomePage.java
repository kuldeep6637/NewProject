package com.POM;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class NewToursApplicationHomePage
{

	@Test
	public void NewToursHomePage()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		WelComeMercuryTours WMT = PageFactory.initElements(driver, WelComeMercuryTours.class);
		
		WMT.Register();
		driver.navigate().back();
		
		WMT.SignOn();
		driver.navigate().back();
		
		WMT.FindAFilght("tutorial", "tutorial");
		
		driver.close();
		
	}

	
	
}
