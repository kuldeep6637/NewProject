package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcelSheet {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Nitesh\\Desktop\\TestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		// creating a Row
		Row r=sheet.createRow(5);
		// creating a cell the above Row
		Cell c=r.createCell(3);
		// Writing the data in the Row of a cell
		c.setCellValue("Nitish");
		
		// saving the file with the data
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\Nitesh\\Desktop\\TestData.xlsx");
		workBook.write(file1);
	}

}
