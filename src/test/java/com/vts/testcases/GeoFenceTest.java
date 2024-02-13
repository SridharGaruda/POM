package com.vts.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vts.base.TestBase;
import com.vts.pages.DashboardPage;
import com.vts.pages.GeofencingPage;
import com.vts.pages.LoginPage;

public class GeoFenceTest extends TestBase {

	LoginPage loginPage;
	DashboardPage DashboardPage;
	GeofencingPage geoFence;

	public GeoFenceTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		DashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		geoFence = DashboardPage.ClickOnGeo_fencing_link();

	}

	@Test(priority = 1)
	public void refreshbuttonTest() {
		boolean refreshButton = geoFence.refresh_geo_fence_screen();
		Assert.assertTrue(refreshButton);
	}

		@Test(priority = 2)
	public void CreateNewTest() {
		geoFence.CreateNew();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
