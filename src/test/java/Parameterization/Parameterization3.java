package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Parameterization3 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream File = new FileInputStream("C:/Users/akkul/OneDrive/Desktop/Country.xlsx/");
		
		XSSFWorkbook work = new XSSFWorkbook(File);
		
		XSSFSheet Sheet = work.getSheet("Sheet1");
		
		int Rows = Sheet.getLastRowNum();
		
		int Col = Sheet.getRow(1).getLastCellNum();
		
		System.out.println(Rows);
		System.out.println(Col);
		
		for(int R=0; R<=Rows; R++) {
			XSSFRow row = Sheet.getRow(R);
			
			for(int C=0; C<=0; C++) {
				XSSFCell cell = row.getCell(C);
				
				
				switch(cell.getCellType()) {
				case STRING:
					System.out.println(cell.getStringCellValue());
					break;
					
				case NUMERIC:
					double D1 = cell.getNumericCellValue();
					int test = (int)D1;
					System.out.println(test);
					break;
					
				case BOOLEAN:
					System.out.println(cell.getBooleanCellValue());
					break;
				default:
					System.out.println("No data found");
					break;
				}
				System.out.println("  ||  ");
			}
			
				System.out.println();
		}
	}
}
