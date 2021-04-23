package com.ntt.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "txtUsername")
	private WebElement userName_TB;

	@FindBy(id = "txtPassword")
	private WebElement Password_TB;

	@FindBy(id = "btnLogin")
	private WebElement Login_BN;

	public void enterUserName(String Username) {
		userName_TB.sendKeys(Username);
	}

	public void enterPassword(String Password) {
		Password_TB.sendKeys(Password);
	}

	public void clickOnLoginButton() {
		Login_BN.click();
	}

	public HomePage performLoginIntoOHRM(String Username, String Password) {
		enterUserName(Username);
		enterPassword(Password);
		clickOnLoginButton();
		return new HomePage(driver);
	}

}
