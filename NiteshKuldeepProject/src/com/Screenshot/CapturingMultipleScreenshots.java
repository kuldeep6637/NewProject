package com.Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingMultipleScreenshots {

	private static OutputType File;

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://amazon.in");
		
		WebElement HeaderBlock=driver.findElementById("nav-xshop");
		
		List<WebElement>HeaderLinks=HeaderBlock.findElements(By.tagName("a"));
		
		System.out.println(HeaderLinks.size());
		for(int i=0;i<HeaderLinks.size();i++)
			
		{
			String linkName=HeaderLinks.get(i).getText();
			System.out.println(linkName);
			
			/*links.get(i).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println(); */
			
			
		}
		
		driver.close();
	}

}
