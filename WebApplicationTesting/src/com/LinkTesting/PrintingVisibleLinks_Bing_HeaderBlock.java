package com.LinkTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintingVisibleLinks_Bing_HeaderBlock {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://bing.com");
		
		WebElement HeaderBlock=driver.findElement(By.id("sc_hdu"));
		
		List<WebElement>HeaderLinks=HeaderBlock.findElements(By.tagName("a"));
		
		System.out.println(HeaderLinks.size());
		for(int i=0;i<HeaderLinks.size();i++)
		
			
			{
				System.out.println(HeaderLinks.get(i).getText());
			}
		
		
		driver.close();

	}

}
