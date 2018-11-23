package com.webtableKuldeep;

import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintingFirstColumnData {

	public static void main(String[] args)
	{
	     FirefoxDriver driver = new FirefoxDriver();
	     driver.get("http://www.fifa.com/worldcup/teams/index.html");
	     
	     driver.manage().window().maximize();
	     
	     //html/body/div[1]/div[5]/div/div[5]/div/div[7]/div/ul/li[1]/a/span
	     //html/body/div[1]/div[5]/div/div[5]/div/div[7]/div/ul/li[24]/a/span
	     
	     
	     String part1="html/body/div[1]/div[5]/div/div[5]/div/div[7]/div/ul/li[";
         String part2="]/a/span" ; 
         
         for(int i=1;i<24;i++)
         {
        	 String TestData=driver.findElementByXPath(part1+i+part2).getText();
        	 System.out.println(TestData);
         }
	                  
         driver.close();

	}

}
