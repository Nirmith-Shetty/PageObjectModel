package com.ntt.qa.tests;

import java.util.Properties;

import org.testng.annotations.Test;

import com.ntt.qa.pages.LoginPage;
import com.ntt.qa.utils.PropertyManager;

public class LoginTest extends BaseTest {

	@Test
	public void loginTest() {
		Properties props=new PropertyManager().getProps();
		test = extent.createTest("Login Test");
		LoginPage login = new LoginPage(driver);
		login.performLoginIntoOHRM(props.getProperty("Username"),props.getProperty("Password"));
	}

}
