package org.testleaf.zoomcar.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel1 {
		public static Object [][] readData (String filename) throws IOException {
		XSSFWorkbook wbook = new XSSFWorkbook("./data/"+filename+".xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		//System.out.println(rowCount);
		//System.out.println(columnCount);
		String [][] getData = new String [rowCount] [columnCount];
		for (int i=1; i<= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j=0; j<columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				getData[i-1][j] = cell.getStringCellValue();
			}
		}
		wbook.close();
		return getData;
				
	}
	

}
