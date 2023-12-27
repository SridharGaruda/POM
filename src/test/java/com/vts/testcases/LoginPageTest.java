package com.vts.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vts.base.TestBase;

public class LoginPageTest extends TestBase {

	LoginPageTest LoginPage; 
	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
        LoginPage = new LoginPageTest();
	}
	
	@Test
	public void LoginPageTitleTest() {
	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
