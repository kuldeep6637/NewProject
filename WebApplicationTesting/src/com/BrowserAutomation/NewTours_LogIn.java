package com.BrowserAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_LogIn {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		driver.findElement(By.name("login")).click();
		
		driver.close();

	}

}
