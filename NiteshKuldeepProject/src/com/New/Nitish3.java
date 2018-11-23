package com.New;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nitish3 {

	public static void main(String[] args) 
	
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://myntra.com");
		
		driver.findElement(By.linkText("Men")).click();
		
		System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
	
	}

}
