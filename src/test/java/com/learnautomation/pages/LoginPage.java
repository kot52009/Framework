package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	 WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
		
		
	}
	@FindBy(xpath ="//input[@id='txtUsername']")
	WebElement username;
	@FindBy(xpath ="//input[@id='txtPassword']")
	WebElement password;
	@FindBy(xpath ="//input[@id='btnLogin']")
	WebElement submit;
	
	public void LogintoCRM(String usernameapplication,String passwordapplication) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		username.sendKeys(usernameapplication);
		password.sendKeys(passwordapplication);
		submit.click();
		
		
	}
	
	
	

	
	

}
