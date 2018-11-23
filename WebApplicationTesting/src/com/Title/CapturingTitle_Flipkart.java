package com.Title;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingTitle_Flipkart {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://flipkart.com");
		
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}
