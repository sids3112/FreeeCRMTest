package com.qa.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.qa.Base.BaseTest;

public class TestUtil extends BaseTest{

	public TestUtil() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static String TESTDATA_SHEET_PATH="C:\\Eclipse-workspace\\FreeeCRMTest\\src\\test\\resources\\TestData\\testdataNew.xlsx";
	
	static Workbook book;
	static org.apache.poi.ss.usermodel.Sheet sheet;
	
	public static Object[][] getTestData(String sheetname){
		FileInputStream file = null;
		try {
			file=new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			book=WorkbookFactory.create(file);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetname);
		Object[][]data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0;i<sheet.getLastRowNum();i++) {
			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++) {
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
			}
		}
		
		return data;

}
}
