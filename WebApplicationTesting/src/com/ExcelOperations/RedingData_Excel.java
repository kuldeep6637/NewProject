package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RedingData_Excel {

	public static void main(String[] args) throws IOException
	{
		// Identifying file on the System
		FileInputStream file = new FileInputStream("C:\\Users\\Nitesh\\Desktop\\TestData.xlsx");
		// Identifying WorkBook in the above file
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		// Idenfiying sheet in the above WorkBook
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		// Identifying a particular
		Row r=sheet.getRow(0);
		// Idetifying a cell in the above Row
		Cell c=r.getCell(0);
		// Getting the cellvalue from the above Row of a Cell
		String testData=c.getStringCellValue();
		// Printing the Data as output
		System.out.println(testData);
	}

}
