package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	// Excel -> workbook -> sheet -> row -> cell

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\TestData.xlsx");
		getFromCell(file, "Sheet1", 1, 1);
	}

	public static void getAll(FileInputStream file, String sh) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet(sh); // workbook.getSheetAt(0);

		// get number of rows from sheet
		int totalRows = sheet.getLastRowNum();

		// get number of columns in sheet
		int totalColumn = sheet.getRow(totalRows).getLastCellNum();

		// printing data
		for (int r = 0; r < totalRows; r++) {
			for (int j = 0; j < totalColumn; j++) {
				System.out.print(sheet.getRow(r).getCell(j).toString() + "\t||\t");
			}
			System.out.println();
		}

		workbook.close();
		file.close();
	}

	public static void getFromCell(FileInputStream file, String sh, int rowNum, int columnNum) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet(sh); // workbook.getSheetAt(0);

		System.out.print(sheet.getRow(rowNum).getCell(columnNum).toString());

		workbook.close();
		file.close();
	}
}
