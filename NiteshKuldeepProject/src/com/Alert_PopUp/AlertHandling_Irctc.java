package com.Alert_PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AlertHandling_Irctc {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.findElementById("loginbutton").click();
		
		Alert alt=driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		Sleeper.sleepTightInSeconds(3);
		
		alt.accept();
		
		driver.findElementById("usernameId").sendKeys("kuldeep");
		
		driver.close();
		
		
			
	

	}

}
