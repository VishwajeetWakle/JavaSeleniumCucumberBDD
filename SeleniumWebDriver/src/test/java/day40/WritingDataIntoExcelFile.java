package day40;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcelFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// creating workbook
		XSSFWorkbook workbook = new XSSFWorkbook();

		// creating sheet
		XSSFSheet sheet = workbook.createSheet("Sheet1");
/*
		// create row
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Welcome");
		row1.createCell(1).setCellValue("TO");
		row1.createCell(2).setCellValue("Java");
	*/

		String data [][] = getData("\\testdata\\TestData.xlsx");
		for (int r = 0; r < data.length; r++) {
			XSSFRow row = sheet.createRow(r);
			for(int c = 0; c < data[0].length ; c++) {
				//		sheet.createRow(r).createCell(c).setCellValue(data[r][c]);
				row.createCell(c).setCellValue(data[r][c]);
			}
		}
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\TestDataWrite.xlsx");
		workbook.write(file);
		
		workbook.close();
		file.close();
	}

	public static String[][] getData(String filename) throws Exception {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + filename);

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Sheet1"); // workbook.getSheetAt(0);

		// get number of rows from sheet
		int totalRows = sheet.getLastRowNum();

		// get number of columns in sheet
		int totalColumn = sheet.getRow(totalRows).getLastCellNum();

		String data [] [] = new String [totalRows][totalColumn];
		// printing data
		for (int r = 0; r < totalRows; r++) {
			for (int j = 0; j < totalColumn; j++) {
				data[r][j]=sheet.getRow(r).getCell(j).toString();
			}
		}

		workbook.close();
		file.close();
		
		return data;
	}

}
