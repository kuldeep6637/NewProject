package com.MouseHover;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Flipkart_Men_jackets {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://flipkart.com");
		
		Sleeper.sleepTightInSeconds(5);
		
		WebElement Mens=driver.findElementByXPath("html/body/div[1]/div/header/div[2]/div/ul/li[3]/a/span");
		
		Actions act=new Actions(driver);
		act.moveToElement(Mens).perform();
		
		Sleeper.sleepTightInSeconds(5);
		
		driver.findElementByXPath("html/body/div[1]/div/header/div[2]/div/ul/li[3]/ul/li/ul/li[2]/ul/li[7]/a/span").click();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}
