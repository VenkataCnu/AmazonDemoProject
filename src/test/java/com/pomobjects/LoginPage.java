package com.pomobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="\"//a[@id='nav-link-accountList']\"")
	@CacheLookup
	WebElement signin;

	@FindBy(xpath = "//*[@id=\"ap_email\"]")
	@CacheLookup
	WebElement Username;

	@FindBy(xpath = "//*[@id=\"continue\"]")
	@CacheLookup
	WebElement continuebutton;

	@FindBy(xpath = "//*[@id=\"ap_password\"]")
	@CacheLookup
	WebElement Password;

	@FindBy(xpath = "//*[@id=\"nav-link-accountList-nav-line-1\"]")
	@CacheLookup
	WebElement login;
	
	public void setSignin()
	{
		signin.click();
	}
	
	public void setUsername(String uname) {
		Username.sendKeys(uname);
	}

	public void setContinue() {
		continuebutton.click();
	}

	public void setPassword(String pwd) {
	Password.sendKeys(pwd);
	}
	
	public void setLogin()
	{
		login.click();
	}
}