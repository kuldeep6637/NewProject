package com.webtableKuldeep;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintingAllTableData {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/weather/");
		
		//html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[1]/td[1]
		//html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[47]/td[12]
		
		String part1="html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[";
		String part2="]/td[";
		String part3="]";
		
		for(int i=1;i<=47;i++)
		{
			for(int j=1;j<12;j++)
			
			{
				String tableData=driver.findElementByXPath(part1+i+part2+j+part3).getText();
				System.out.println(tableData+"  ");
			}
		
		System.out.println();
		
		}
		
	
				
		driver.close();
		

	}

}
