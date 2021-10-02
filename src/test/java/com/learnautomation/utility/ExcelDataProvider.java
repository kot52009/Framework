package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	
	//This is constructor - method name same as class name "ExcelDataProvider"
	public ExcelDataProvider() {
		
		File Src = new File("./TestData/Data.xlsx");
		
		try {
			FileInputStream fis = new FileInputStream(Src);
			wb = new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			System.out.println("Unable to Read excel" + e.getMessage());
		}
//		XSSFSheet Sheet1 = wb.getSheetAt(0);
//		String Data = Sheet1.getRow(0).getCell(0).getStringCellValue();
//		System.out.println("data is " + Data);


	}
	//This is method overloading - Same Method Name but different parameter
	public String getStringData(int SheetIndex, int row, int Column) {
		 return wb.getSheetAt(SheetIndex).getRow(0).getCell(0).getStringCellValue();
		 
	 }
	
	 public String getStringData(String SheetName, int row, int Column) {
		 return wb.getSheet(SheetName).getRow(0).getCell(0).getStringCellValue();
		 
	 }
	 public double getNumericData(String SheetName, int row, int Column) {
		 return wb.getSheet(SheetName).getRow(0).getCell(0).getNumericCellValue();
		 
		 
	 }

}
