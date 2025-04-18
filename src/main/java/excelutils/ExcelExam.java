package excelutils;

import java.io.IOException;

import org.testng.annotations.Test;

public class ExcelExam {
	
	@Test
	public void name() throws IOException {
	
		String file="./excelfiles/file.xlsx";
		/*
		 * System.out.println(ExcelUtil.getCellCount(file, "Sheet1", 0));
		 * System.out.println(ExcelUtil.getCellCount(file, "Sheet1", 0));
		 * System.out.println(ExcelUtil.getCellData(file, "Sheet1", 0, 0));
		 */
	System.out.println(ExcelUtil.getRowCount(file, "Sheet1"));
	
	}

}
