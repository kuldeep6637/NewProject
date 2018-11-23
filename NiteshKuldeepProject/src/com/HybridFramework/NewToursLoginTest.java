package com.HybridFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursLoginTest
{
	FirefoxDriver driver;
	
	@BeforeTest
	public void register()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
	}
	
	@Test(priority=1)
	public void Register()
	{
		driver.findElementByLinkText("REGISTER").click();
	}
	
	@Test(priority=2)
	public void UserRegistration() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Nitesh\\Desktop\\SeleniumTesting\\NiteshKuldeepProject\\NewToursHomePage_Kul.properties");
		Properties pro = new Properties();
		pro.load(file);
		
		FileInputStream file1 = new FileInputStream("C:\\Users\\Nitesh\\Desktop\\SeleniumTesting\\WebApplicationTesting\\src\\com\\TestDataFiles\\UserRegistrationTestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file1);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int Rowcount=sheet.getLastRowNum();
		for(int i=1;i<Rowcount;i++)
		
		{
			Row r=sheet.getRow(i);
			
			driver.findElementByName(pro.getProperty("FirstName")).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElementByName(pro.getProperty("Lastname")).sendKeys(r.getCell(1).getStringCellValue());
			double d=r.getCell(2).getNumericCellValue();
			long x =(long)d;
			String PhoneNumber=Long.toString(x);
			
			driver.findElementByName(pro.getProperty("Phone")).sendKeys(PhoneNumber);
			
			driver.findElementByName(pro.getProperty("Email")).sendKeys(r.getCell(3).getStringCellValue());
			driver.findElementByName(pro.getProperty("Address")).sendKeys(r.getCell(4).getStringCellValue());
			driver.findElementByName(pro.getProperty("City")).sendKeys(r.getCell(5).getStringCellValue());
			driver.findElementByName(pro.getProperty("StateProvince")).sendKeys(r.getCell(6).getStringCellValue());
			
			double p=r.getCell(7).getNumericCellValue();
			long y=(long)p;
			String PostalCode=Long.toString(y);
			
			driver.findElementByName(pro.getProperty("PostalCode")).sendKeys(PostalCode);
			
			driver.findElementByName(pro.getProperty("CountryName")).sendKeys(r.getCell(8).getStringCellValue());
			driver.findElementByName(pro.getProperty("UserName")).sendKeys(r.getCell(9).getStringCellValue());
			driver.findElementByName(pro.getProperty("Password")).sendKeys(r.getCell(10).getStringCellValue());
			driver.findElementByName(pro.getProperty("ConfirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
			
			Sleeper.sleepTightInSeconds(5);
			
			driver.findElementByName(pro.getProperty("Submit")).click();
			
String ExpectedUserName=r.getCell(9).getStringCellValue();
			
			String ActualText=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
			
			if(ActualText.contains(ExpectedUserName))
			{
				System.out.println("User successfully registered -- PASS");
				r.createCell(12).setCellValue("User successfully registered -- PASS");
			}
			else
			{
				System.out.println("User registration Failed -- FAIL");
				r.createCell(12).setCellValue("User registration Failed -- FAIL");
			}
			
			FileOutputStream file2 = new FileOutputStream("C:\\Users\\Nitesh\\Desktop\\SeleniumTesting\\WebApplicationTesting\\src\\com\\TestResultsFile\\UserRegistrationResultTestData1.xlsx");
			workbook.write(file2);
			
			driver.navigate().back();
			
		}
				
		}
	
	

	
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	    
	
}
