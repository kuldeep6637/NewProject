package com.BrowserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFacebookApplication {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		// driver.get("http://facebook.com");
		
		driver.navigate().to("http://facebook.com");
		
		driver.close();

	}

}
