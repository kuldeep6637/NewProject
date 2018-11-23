package com.Title;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingTitle_and_Url {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://flipkart.com");
		
		String ExpectedTitle= "Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More";
		
		String ActualTitle=driver.getTitle();
		
		System.out.println(ExpectedTitle);
		System.out.println(ActualTitle);
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Title Matched -- PASS");
		}
		else
		{
			System.out.println("Title Not Matched - FAIL");
		}
		
		System.out.println();
		
		String ExpectedUrl="flipkart.com";
		
		String ActualUrl=driver.getCurrentUrl();
		
		System.out.println(ExpectedUrl);
		System.out.println(ActualUrl);
		
		if(ActualUrl.contains(ExpectedUrl))
		{
			System.out.println("URL Matched -- PASS");
		}
		else
		{
			System.out.println("URL Not Matched -- FAIL");
		}
		driver.close();
		
		

	}

}
