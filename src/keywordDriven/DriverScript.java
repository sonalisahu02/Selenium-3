package keywordDriven;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DriverScript {
	public static void main(String[] args) {
		String sPath = "C:\\Work\\MethodList.xlsx";

		try {

//			File file = new File(sPath); // creating a new file instance
//			FileInputStream fis = new FileInputStream(file); // obtaining bytes from the file
//			// creating Workbook instance that refers to .xlsx file
//			XSSFWorkbook wb = new XSSFWorkbook(fis);
//			XSSFSheet sheet = wb.getSheetAt(0); // creating a Sheet object to retrieve object
//			Iterator<Row> itr = sheet.iterator(); // iterating over excel file
//			while (itr.hasNext()) {
//				Row row = itr.next();
//				Iterator<Cell> cellIterator = row.cellIterator(); // iterating over each column
//				while (cellIterator.hasNext()) {
//					Cell cell = cellIterator.next();
//					switch (cell.getCellType()) {
//					case Cell.CELL_TYPE_STRING: // field that represents string cell type
//						System.out.print(cell.getStringCellValue() + "\t\t\t");
//						break;
//					case Cell.CELL_TYPE_NUMERIC: // field that represents number cell type
//						System.out.print(cell.getNumericCellValue() + "\t\t\t");
//						break;
//					default:
//					}
//				}
//				System.out.println("");
//			}
			ReadExcelData.setExcelFile(sPath, "Sheet1");
		} catch (Exception e) {

			System.out.println("this is an exception" + e.getMessage());
		}

		for (int iRow = 1; iRow <= 7; iRow++) {
			String sActions = ReadExcelData.getCellData(iRow, 2);

			if (sActions.equals("openBrowser")) {
				Methods.openBrowser();
			} else if (sActions.equals("navigate")) {
				Methods.navigate();

			} else if (sActions.equals("input_Username")) {
				Methods.input_Username();
			}
		}

	}
}