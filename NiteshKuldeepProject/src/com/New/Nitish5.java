package com.New;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Nitish5 {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		
	driver.get("http://paytm.in"); 
		
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());

String Expectedtitle="Paytm.com – Digital & Utility Payment, Entertainment, Travel, Payment Gateway & more Online !";
String Actualtitle= driver.getTitle();
 

	
	
	
	
	}

}
