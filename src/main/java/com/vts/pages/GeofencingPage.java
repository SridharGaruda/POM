package com.vts.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vts.base.TestBase;

public class GeofencingPage extends TestBase {

	@FindBy(xpath = "//button[normalize-space()='Create New +']")
	WebElement CreateNewButton;

	@FindBy(xpath = "//button[@title='refresh']")
	WebElement refresh_button;

	@FindBy(xpath = "//div[@class = \"col-lg-6 col-6 heading_fence\"]")
	WebElement GeoFence;

	public GeofencingPage() {
		PageFactory.initElements(driver, this);
	}
    
    public boolean refresh_geo_fence_screen()
    {
    	boolean refreshFlag = refresh_button.isDisplayed();
    	return refreshFlag;
    }

	public CreateNewScreen CreateNew()
	{
		CreateNewButton.click();
		return new CreateNewScreen();
	}
	
	

}
