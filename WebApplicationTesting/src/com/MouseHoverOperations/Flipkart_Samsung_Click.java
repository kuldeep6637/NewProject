package com.MouseHoverOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Flipkart_Samsung_Click {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://flipkart.com");
		
	WebElement Electronics=driver.findElement(By.xpath("html/body/div[1]/div/header/div[2]/div/ul/li[1]/a/span"));
		
	Actions act = new Actions(driver);
	act.moveToElement(Electronics).perform();
	
	Sleeper.sleepTightInSeconds(5);
	
	driver.findElement(By.xpath("html/body/div[1]/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a/span")).click();
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	driver.close();

	}

}
