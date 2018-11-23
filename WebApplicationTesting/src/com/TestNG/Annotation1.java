package com.TestNG;

import org.testng.annotations.Test;

public class Annotation1
{
	@Test(priority=1)
	public void BrowserLaunch()
	{
		System.out.println("Launching Firefox Browser");
	}
	
	@Test(priority=2)
	public void LogIn()
	{
		System.out.println("LogIn to Gmail");
	}
	
	@Test(enabled=false)
	public void SentMail()
	{
		System.out.println("GO to sent Mail");
	}
	
	@Test(priority=3)
	public void ComposeMail()
	{
		System.out.println("Compose Mail");
	}
}
