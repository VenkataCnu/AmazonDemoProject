package com.testcases;

import org.testng.annotations.Test;

import com.pomobjects.LoginPage;

public class LoginTest extends BaseClass {
	@Test
	public void login() {
		LoginPage lp = new LoginPage(driver);
		logger.info("Initiated");
		lp.setSignin();
		logger.info("Sign in ");
		lp.setUsername(username);
		logger.info("Username Entered");
		lp.setContinue();
		logger.info("Clicked continue");
		lp.setPassword(password);
		logger.info("Entered Password");
		lp.setLogin();
		logger.info("Clicked login");
	}

}
