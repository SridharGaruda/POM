package com.vts.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vts.base.TestBase;

public class LoginPage extends TestBase {

	//Page factory - OR
	@FindBy(name = "uname")
	WebElement Username;

	@FindBy(name = "pass")
	WebElement Password;

	@FindBy(id = "submitForm")
	WebElement LoginButton;
	
	@FindBy(xpath = "//img[@alt='Infosys']" )
	WebElement AumLogo;
	

    //Initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String ValidateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	 	
	public boolean AumImage()
	{
		return AumLogo.isDisplayed();
	}
	
	public DashboardPage login(String un, String pwd)
{
	Username.sendKeys(un);
	Password.sendKeys(pwd);
	LoginButton.click();
	
	return new DashboardPage();
}
}
