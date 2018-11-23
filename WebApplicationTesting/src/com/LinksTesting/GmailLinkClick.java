package com.LinksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLinkClick {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver(); 
				
		driver.get("http://google.com");
		
		driver.findElement(By.linkText("Images")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
	}

}
