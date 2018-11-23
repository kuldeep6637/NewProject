package com.kuldeep_identifyLinks;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdentifyingTotalLinks_amazon {

	public static void main(String[] args) 
	{
		FirefoxDriver Driver = new FirefoxDriver();
				
		Driver.get("http://amazon.in");
					
		System.out.println(Driver.getCurrentUrl());
		System.out.println(Driver.getTitle());
	
   String ExpectedTitle ="Online Shopping: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

	String ActualTitle 	=Driver.getTitle();
	
	if (ActualTitle.equals(ExpectedTitle))
	{
		System.out.println("Title Matched -- Pass");
	}
	else
	{
		
	System.out.println("Title Not Matched -- Fail");
	
	}
	String ActualURL = Driver.getCurrentUrl();
	
	String ExpectedURL = "amazon.in";
	
	if(ActualURL.contains(ExpectedURL))
	{
		
		System.out.println("URL Matched -- Pass");
	}
	else
	{
		System.out.println("Text Not Found -- Fail");
	
	}
		List<WebElement>links=Driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int a=0;a<links.size();a++)
		
		{
			
		System.out.println(links.get(a).getText());
		}
		
		
		
			
		Driver.close();
				
		}
     	}
	
	



