package com.vts.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vts.base.TestBase;
import com.vts.pages.DashboardPage;
import com.vts.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage LoginPage;
	DashboardPage dashBoardPage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		LoginPage = new LoginPage();
	}

	@Test(priority=1)
	public void LoginPageTitleTest() {
		String title = LoginPage.ValidateLoginPageTitle();
		Assert.assertEquals(title, "Vehicle Tracking System");
	}
	
	@Test(priority=2)
	public void AumLogoImgTest()
	{
		boolean flag = LoginPage.AumImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void LoginTest()
	{
		dashBoardPage = LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
