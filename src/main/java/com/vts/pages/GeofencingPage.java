package com.vts.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vts.base.TestBase;

public class GeofencingPage extends TestBase {

	@FindBy(xpath = "//button[normalize-space()='Create New +']")
	WebElement CreateNewButton;
	
	@FindBy(xpath = "//button[@title='refresh']")
	WebElement refresh_button;
	
	@FindBy(xpath = "//div[@class = \"col-lg-6 col-6 heading_fence\"]")
	WebElement GeoFence;
	
	
	
}
