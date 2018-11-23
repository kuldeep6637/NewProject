package com.Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotAeroflot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://thomas.in");
		
		Thread.sleep(30000);
		
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File ("C:\\Users\\Nitesh\\Desktop\\ScreenShots\\Kuldeep\\thomas.png"));
		
		driver.close();

	}

}
