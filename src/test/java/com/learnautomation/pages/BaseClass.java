package com.learnautomation.pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ConfigDataProvider;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.Help;

public class BaseClass {
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest logger;
	
	
	
	
	@BeforeSuite
	
	
	public void setupsuite() {
		excel = new ExcelDataProvider();
		config = new ConfigDataProvider();
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir") + "./Reports/Kotresh.html"));
		report = new ExtentReports();
		report.attachReporter(extent);
		
		
	}
	@BeforeClass

	public void setup() {
		driver = BrowserFactory.StartApplication(driver, config.getBrowser(), config.getStringUrl());
		System.out.println("title is " + driver.getTitle());
	}
	@AfterClass

	public void teardown() {
		BrowserFactory.QuitBrowser(driver);

	}
	@AfterMethod
	
	public void teardownMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			Help.capturescreenshot(driver);
		}
		report.flush();

			
		
	}

}
