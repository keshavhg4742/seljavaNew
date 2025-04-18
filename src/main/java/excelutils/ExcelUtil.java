package excelutils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	public static FileInputStream fis;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static FileOutputStream fos;

	public static int getRowCount(String xlFile, String xlSheet) throws IOException {

		fis = new FileInputStream(xlFile);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(xlSheet);
		int RowCount = sheet.getLastRowNum();
		workbook.close();
		fis.close();
		return RowCount;
	}
	public static int getCellCount(String xlFile, String xlSheet, int rowNum) throws IOException {
		fis = new FileInputStream(xlFile);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(xlSheet);
		row = sheet.getRow(rowNum);
		int cellCount = row.getLastCellNum();
		workbook.close();
		fis.close();
		return cellCount;

	}
	public static String getCellData(String xlFile, String xlSheet, int rowNum, int colNum) throws IOException {

		fis = new FileInputStream(xlFile);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(xlSheet);
		row = sheet.getRow(rowNum);
		cell = row.getCell(colNum);
		String data;

		try {

			// data= cell.toString();
			DataFormatter dataFormatter = new DataFormatter();
			data = dataFormatter.formatCellValue(cell);
		} catch (Exception e) {
			data = "";
		}
		workbook.close();
		fis.close();
		return data;
	}

	public static void setCellData(String xlFile, String xlSheet, int rowNum, int colNum, String data)
			throws IOException {

		fis = new FileInputStream(xlFile);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(xlSheet);
		row = sheet.getRow(rowNum);
		cell = row.createCell(colNum);
		cell.setCellValue(data);
		fos = new FileOutputStream(xlFile);
		workbook.write(fos);
		workbook.close();
		fis.close();
		fos.close();
	}
}
