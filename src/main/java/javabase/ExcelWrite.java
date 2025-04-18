package javabase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.devtools.v128.debugger.Debugger.RestartFrameMode;

public class ExcelWrite {

	public static void main(String[] args) throws InvalidFormatException, IOException {

		FileOutputStream fos = new FileOutputStream("./excelfiles/file.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		
		//XSSFSheet sheet = workbook.getSheet("Sheet1");
	//	sheet.createRow(0).createCell(1).setCellValue("hh");
		sheet.createRow(0).createCell(0).setCellValue("hh");
		workbook.write(fos);
		workbook.close();
		fos.close();
		
		
		//Rest nahi aata postman manual chalta kya puch
		//wait kar bol 
 
	}

}
