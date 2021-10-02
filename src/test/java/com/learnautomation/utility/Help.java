package com.learnautomation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Help {

	public static void capturescreenshot(WebDriver driver) {

		// Convert web driver object to TakeScreenshot

		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		// Call getScreenshotAs method to create image file

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		// Move image file to new destination

		// File DestFile=new File("./Screenshots/login.png");

		// Copy file at destination

		// FileUtils.copyFile(SrcFile, DestFile);
		try {
			FileHandler.copy(SrcFile, new File("./Screenshots/Kotresh" + CurrentDateTime() + ".png"));
			System.out.println("Screenshot successful");
		} catch (IOException e) {
			
			System.out.println("unable to take screenshot" + e.getMessage());
		}

	}
	public static String CurrentDateTime() {
		DateFormat Format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date currentdate = new Date();		
		return Format.format(currentdate);
		
		
		
		
		
	}

}
