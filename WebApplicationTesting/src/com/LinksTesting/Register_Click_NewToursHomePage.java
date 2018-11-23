package com.LinksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Register_Click_NewToursHomePage {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String ExpectedTitle="Register: Mercury Tours";
		String ActualTitle=driver.getTitle();
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Title Matched - PASS");
		}
		else
		{
			System.out.println("Title Not Matche Fail");
		}
		
		System.out.println();
		
		String ExpectedURL="mercuryregister";
		String ActualUrl=driver.getCurrentUrl();
		
		if(ActualUrl.contains(ExpectedURL))
		{
			System.out.println("Contains the Text -- PASS");
		}
		else
		{
			System.out.println("Text not found - FAIL");
		}
		driver.close();
	}

}
