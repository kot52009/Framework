package com.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.Help;

public class LoginTestCRM extends BaseClass{
	

	

	@Test
	public void loginapp() {
		logger = report.createTest("Log into CRM");
		
		//ExcelDataProvider excel = new ExcelDataProvider();
		//excel.getStringData("Sheet1", 0, 0);
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		logger.info("Starting the application");
		
		loginpage.LogintoCRM(excel.getStringData("Sheet1", 0, 0), excel.getStringData("Sheet1", 0, 1));
		logger.pass("login successful");
		
		//Help.capturescreenshot(driver);
		
		
		
		

	}

	
}
