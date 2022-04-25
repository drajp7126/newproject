package com.abc.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellClass {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("Result/Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet shett=wb.getSheetAt(0);
		//Iterator<row> rows=shett.getrowiterator();
		XSSFRow rw=shett.getRow(0);
		XSSFCell cl=rw.getCell(0);
		
		
	}

}
