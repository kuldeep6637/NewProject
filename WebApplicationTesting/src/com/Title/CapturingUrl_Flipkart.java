package com.Title;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingUrl_Flipkart {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://flipkart.com");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();

	}

}
