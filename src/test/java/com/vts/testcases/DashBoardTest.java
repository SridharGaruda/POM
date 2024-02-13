package com.vts.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vts.base.TestBase;
import com.vts.pages.DashboardPage;
import com.vts.pages.GeofencingPage;
import com.vts.pages.LoginPage;

public class DashBoardTest extends TestBase {

	DashboardPage DashboardPage;
	LoginPage loginPage;
	GeofencingPage geoFence;

	public DashBoardTest() {
		super();
	}

	// Test cases should be independent with each other
	// before each test case -- launch the browser and login
	// @test --execute test cases
	// after each test case --close the browser

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		DashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(priority = 1)
	public void VerifyDashBoardPageTitle() {
		String DashBoardPageTitle = DashboardPage.ValidateDashboardTitle();
		Assert.assertEquals(DashBoardPageTitle, "Vehicle Tracking System | Multiple Vehicle Tracking",
				"Home page title not matched");

	}

	@Test(priority = 2)
	public void VerifyChartButton() {
		Assert.assertTrue(DashboardPage.ClickOnChartButton());
	}

	@Test(priority = 3)
	public void VerifyGeoFenceLink() throws Exception {
		TestBase.takeSnapShot();
		geoFence = DashboardPage.ClickOnGeo_fencing_link();

	}

	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
