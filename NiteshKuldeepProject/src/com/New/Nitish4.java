package com.New;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Nitish4 {

	public static void main(String[] args) 
	{
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://myntra.com");
	
	String Exceptedtitel= "Online Shopping for Women, Men, Kids Fashion & Lifestyle";
	
	String Actualtitel= driver.getTitle();
	
	System.out.println(Exceptedtitel);
	
	System.out.println(Actualtitel);
	
	if(Actualtitel.equals(Exceptedtitel))
	{
	System.out.println("Titel matched---pass");
	}
	else  
	{
		System.out.println("titel not matched---fali");
		
	}	
					

	}

}
