package com.LinkTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class TSRTC_HeaderBlock_LinksTesting {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
		WebElement HeaderBlock=driver.findElement(By.xpath("html/body/div[3]"));
		
		List<WebElement>Headerlinks=HeaderBlock.findElements(By.tagName("a"));
		
		System.out.println(Headerlinks.size());
		
		for(int i=0;i<Headerlinks.size();i++)
		{
			String HeaderLinkName=Headerlinks.get(i).getText();
			System.out.println(HeaderLinkName);
			
			Headerlinks.get(i).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			driver.navigate().back();
			
			Sleeper.sleepTightInSeconds(5);
			HeaderBlock=driver.findElement(By.xpath("html/body/div[3]"));
			Headerlinks=HeaderBlock.findElements(By.tagName("a"));
		}
		
		
		driver.close();

	}

}
