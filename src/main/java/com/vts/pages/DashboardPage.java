package com.vts.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vts.base.TestBase;

public class DashboardPage extends TestBase {

	@FindBy(xpath = "//button[text() = 'Chart']")
	WebElement chart_button;

	@FindBy(xpath = "//a[text()='Dashboard']")
	WebElement Dashboard_link;

	@FindBy(xpath = "//a[normalize-space()='Geo Fencing']")
	WebElement Geo_fencing_link;

	@FindBy(xpath = "//a[normalize-space()='Vehicle Alerts']")
	WebElement Vehicle_alerts_link;

	// Initializing the page objects

	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}

	public String ValidateDashboardTitle() {
		return driver.getTitle();
	}

	public boolean ClickOnChartButton() {
		boolean flag = chart_button.isDisplayed();
		return flag;
	}

	public GeofencingPage ClickOnGeo_fencing_link() { //ClickOnGeoFencelink
		Geo_fencing_link.click();
		return new GeofencingPage();
	}

//	public RulePage Vehicle_alerts_link() {
//		Vehicle_alerts_link.click();
//		return new RulePage();
//	}

}
