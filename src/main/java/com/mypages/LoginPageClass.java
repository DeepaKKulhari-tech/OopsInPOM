/**
 * 
 */
package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author deepak.kumar
 *
 */
public class LoginPageClass extends BasePage {

	
	//page locators:
	
	private By emailID=By.id("username");
	private By password=By.id("password");
	private By LoginButton=By.id("loginbtn");
	private By header= By.xpath("//*[@date-key='login.signupLink.text']");
	
	public LoginPageClass(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//getters :

	public By getEmailID() {
		return emailID;
	}

	public By getPassword() {
		return password;
	}

	public By getLoginButton() {
		return LoginButton;
	}

	public By getHeader() {
		return header;
	}

	
	
	
	
}
