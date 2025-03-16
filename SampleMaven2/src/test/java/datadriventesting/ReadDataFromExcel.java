package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// step 1: create FileInputStream object
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		
		// step 2: create respective file type object
		Workbook workbook = WorkbookFactory.create(fis);
		
		// step 3: call read methods
		String url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);
		
		double price = workbook.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();
		System.out.println(price);
		
		boolean status = workbook.getSheet("Sheet1").getRow(1).getCell(4).getBooleanCellValue();
		System.out.println(status);
		
		LocalDateTime date = workbook.getSheet("Sheet1").getRow(1).getCell(5).getLocalDateTimeCellValue();
		System.out.println(date);
	}
}
