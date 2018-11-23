package com.New;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Nitish2 {

	public static void main(String[] args) 
	
	{
	   FirefoxDriver driver = new FirefoxDriver();
	   
	   driver.get("http://myntra.com");
	   
	   System.out.println(driver.getTitle());
	   
	   System.out.println(driver.getCurrentUrl());
	   
	   driver.close();
	   
	   
	   
	   

	}

}
