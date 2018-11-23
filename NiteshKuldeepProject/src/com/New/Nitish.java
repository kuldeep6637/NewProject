package com.New;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nitish {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
       driver.get("http://rediffmail.com");
       
       driver.findElement(By.className("shcatlinkn")).click();
       
       driver.close();
       
       
	}

}
