package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelComeMercuryTours
{
	//WebElement Register=driver.findElement(by.linkText("REGISTER"));
	
	@FindBy(linkText="REGISTER")
	WebElement register;
	
	public void Register()
	{
		register.click();
	}
	
	@FindBy(linkText="SIGN-ON")
	WebElement signOn;
	
	public void SignOn()
	{
		signOn.click();
	}
	
	
	@FindBy(name="userName")
	WebElement UserName;

	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="login")
	WebElement SignIn;
	
	public void FindAFilght(String u,String p)
	{
		UserName.sendKeys(u);
		Password.sendKeys(p);
		SignIn.click();
	}
	
}
