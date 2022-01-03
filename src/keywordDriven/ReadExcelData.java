package keywordDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	
	public static void setExcelFile(String Path,String SheetName) throws IOException
	{
		FileInputStream ExcelFile=new FileInputStream(Path);
		ExcelWBook= new XSSFWorkbook(ExcelFile);
		ExcelWSheet= ExcelWBook.getSheet(SheetName);
		
	}
	public static String getCellData(int RowNum,int ColNum)
	{
		Cell =ExcelWSheet.getRow(RowNum).getCell(ColNum);
		String CellData = Cell.getStringCellValue();
		return CellData;
	}

}
