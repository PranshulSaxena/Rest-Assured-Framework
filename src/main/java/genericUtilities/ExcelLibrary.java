package genericUtilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary {
	
	/**
	 * This method is used to fetch data from Excel Sheet
	 * @param SheetName
	 * @param RowNo
	 * @param ColumnNo
	 * @return
	 * @throws Throwable
	 * @author PranshulSaxena
	 */
	public String readDataFromExcel(String SheetName, int RowNo, int CellNo) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IPathConstants.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		Row row = sh.getRow(RowNo);
		Cell cel = row.getCell(CellNo);
		String value = cel.getStringCellValue();
		return value;	
	}
	
	/**
	 * This method is used to write data into Excel Sheet
	 * @param SheetName
	 * @param RowNo
	 * @param ColumnNo
	 * @param data
	 * @throws Throwable
	 * @author PranshulSaxena
	 */
	public void writeDataIntoExcel(String SheetName, int RowNo, int ColumnNo, String data) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IPathConstants.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		Row row = sh.createRow(RowNo);
		Cell cell = row.createCell(ColumnNo);
		cell.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(IPathConstants.excelPath);
		wb.write(fos);
	}
	
	/**
	 * This method is used to get last row count
	 * @param SheetName
	 * @return
	 * @throws Throwable
	 * @author PranshulSaxena
	 */
	public int getLastRowNum(String SheetName) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IPathConstants.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		int rowCount = sh.getLastRowNum();
		return rowCount;
	}
	
	/**
	 * This method is used to get last cell count
	 * @param SheetName
	 * @return
	 * @throws Throwable
	 * @author PranshulSaxena
	 */
	public int getLastCellNum(String sheetName) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IPathConstants.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(0);
		int cellCount = row.getLastCellNum();
		return cellCount;
	}

}
