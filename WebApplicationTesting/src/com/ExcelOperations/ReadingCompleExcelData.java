package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingCompleExcelData {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Nitesh\\Desktop\\TestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int RowCount=sheet.getLastRowNum(); //finding RowCount
		
		for(int i=0;i<=RowCount;i++) // Running Loop for the total no.of Row's
		{
			Row r=sheet.getRow(i); // get into i'th Row
			int CellCount=r.getLastCellNum(); // in the i'th row finding the total no.of cells with data
			
			for(int j=0;j<CellCount;j++) // Running Loop for the i'th row of Cell
			{
				Cell c=r.getCell(j); // going to i'th row of a cell
				
				String testData=c.getStringCellValue(); // getting the i'th Row of the j'th cell 
				System.out.print(testData+"  "); // printing the data
			}
			System.out.println();
		}

	}

}
