package hybridFreamework;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;

public class ReadExcel {
	private static XSSFWorkbookType ExcelFile;
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	
	public static void setExcelFile(String Path,String SheetName)
	
	{
		try
		{
		FileInputStream ExcelFile =new FileInputStream(Path);
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		ExcelWSheet = ExcelWBook.getSheet(SheetName);

		}
		 catch(Exception e)
		{
	System.out.println("error found");
		}
	}
	public static String getCellData(int RowNum,int ColNum)
	{
		Cell= ExcelWSheet.getRow(RowNum).getCell(ColNum);
		String CellData = Cell.getStringCellValue();
		return CellData;
		
		
	
	}
	
	

}
