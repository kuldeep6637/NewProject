package com.kuldeep_identifyLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintingVisibleLinks_amazon_headblock
    {

	public static void main(String[] args) 
	{
	FirefoxDriver driver = new FirefoxDriver();
    driver.get("http://amazon.in");
    
    WebElement HeaderBlock=driver.findElement(By.xpath("html/body/div[1]/header/div/div[3]/div[3]/div"));
    
    List<WebElement>Headerlinks=HeaderBlock.findElements(By.tagName("a"));
    
    System.out.println(Headerlinks.size());
    
    for(int i=0;i<Headerlinks.size();i++)
    
    	
    
    {
    	System.out.println(Headerlinks.get(i).getText());
    }
    	
    
    	
    	
    	
    	
    	
    	
    	
    	
    	
    
    
    driver.close();
     
	}

}
