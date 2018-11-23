package com.BrowserAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SignIn_Click_Google {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		driver.findElement(By.id("gb_70")).click();
		
		driver.close();

	}

}
