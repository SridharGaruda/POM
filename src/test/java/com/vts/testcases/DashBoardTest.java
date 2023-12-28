package com.vts.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vts.base.TestBase;
import com.vts.pages.DashboardPage;
import com.vts.pages.LoginPage;

public class DashBoardTest extends TestBase{
 
    DashboardPage DashboardPage;
	LoginPage LoginPage;
	
	public DashBoardTest() {
	super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		LoginPage = new LoginPage();
//		DashboardPage = LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Test
	public void VerifyDashBoardPageTitle()
	{
		String DashBoardPageTitle = DashboardPage.ValidateDashboardTitle();
		Assert.assertEquals(DashBoardPageTitle, "Vehicle Tracking System | Multiple Vehicle Tracking", "Home page title not matched");
		
	}
	
	
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
}
