package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Parameterization2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream File1 = new FileInputStream("C:/Users/akkul/OneDrive/Desktop/Book1.xlsx/");
		
		String Username = WorkbookFactory.create(File1).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		FileInputStream File2 = new FileInputStream("C:/Users/akkul/OneDrive/Desktop/Book1.xlsx/");
		
		String Password = WorkbookFactory.create(File2).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(Username);
		System.out.println(Password);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(Username);
		driver.findElement(By.id("pass")).sendKeys(Password);
	}
}


