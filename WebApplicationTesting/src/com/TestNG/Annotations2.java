package com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2
{

	@BeforeTest
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
	
	@AfterTest
	public void ApplicationClose()
	{
		System.out.println("Application Close");
	}
}
