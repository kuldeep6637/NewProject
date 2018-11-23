package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation3 
{

	@BeforeMethod
	public void BrowserLaunchAndNavigateToGmail()
	{
		System.out.println("Firefox Browser launch and Open Gmail");
	}
	
	@Test(priority=1)
	public void logIn()
	{
		System.out.println("LogIn to Gmail");
	}
	
	@Test(priority=2)
	public void InBox()
	{
		System.out.println("Go to InBox");
	}
	
	@AfterMethod
	public void ApplicationClose()
	{
		System.out.println("Application Close");
	}
	
	
}
