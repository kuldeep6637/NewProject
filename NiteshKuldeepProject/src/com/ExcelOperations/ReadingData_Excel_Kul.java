package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingData_Excel_Kul {

	public static void main(String[] args) throws IOException
	{
	FileInputStream file = new FileInputStream("C:\\Users\\Nitesh\\Desktop\\TestData.xlsx");
	
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	
	XSSFSheet sheet = workbook.getSheet("Sheet3");
	
	Row r=sheet.getRow(9);
	
	Cell c=r.getCell(3);
	
	String testData=c.getStringCellValue();
	
	System.out.println(testData);
	

	}

}
