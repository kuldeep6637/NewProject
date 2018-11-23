package com.New;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://flipkart.com");
		
		//driver.findElement(By.className("_25Wjx4 _1mOSIR")).click();
		
		driver.findElement(By.xpath("html/body/div[1]/div/header/div[2]/div/ul/li[8]/a/span")).click();
		
		driver.close();
		
	    
		
		
		
	
				
		
		
		
		

	}

}
