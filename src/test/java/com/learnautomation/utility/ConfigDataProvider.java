package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConfigDataProvider {
	Properties pro;

	public ConfigDataProvider() {
		File Src = new File("./Config/Config.properties");

		try {
			FileInputStream fis = new FileInputStream(Src);
			pro = new Properties();
			pro.load(fis);
		} catch (IOException e) {

			System.out.println("Not able to load " + e.getMessage());
		}

	}
		public String getDatafromconfig(String Keytosearch) {
			return pro.getProperty(Keytosearch);
			
			
		}
		public String getStringUrl() {
			return pro.getProperty("QAUrl");
			
			
		}
		public String getBrowser() {
			return pro.getProperty("Browser");
			
		}
}
