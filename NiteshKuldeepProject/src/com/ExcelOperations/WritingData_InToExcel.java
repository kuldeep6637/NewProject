package com.ExcelOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingData_InToExcel {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Nitesh\\Desktop\\TestData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet2");
		
		Row r=sheet.createRow(5);
		Cell c=r.createCell(3);
		
		c.setCellValue("Hello");
		
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\Nitesh\\Desktop\\TestData.xlsx");
		workbook.write(file1);
	   
		
		
	
		
	   
	  
	  
		

	}

}
