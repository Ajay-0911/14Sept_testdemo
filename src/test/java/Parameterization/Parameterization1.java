package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:/Users/akkul/OneDrive/Desktop/Book1.xlsx/");
		
//		String Data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
//		System.out.println(Data);
		
//		double test = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
//		System.out.println(test);
		boolean Test3=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getBooleanCellValue();

		System.out.println(Test3);
//		FileInputStream file1 = new FileInputStream("C:/Users/akkul/OneDrive/Desktop/E-Commerce test cases Book1 (Recovered).xlsx");
//		
//		String Data1 = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
//		System.out.println(Data1);
		
		
	}
}
