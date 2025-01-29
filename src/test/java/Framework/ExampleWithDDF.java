package Framework;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ExampleWithDDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// Step 1
		WebDriverManager.chromedriver().setup();
		// Step 2
		WebDriver driver = new ChromeDriver();
		// Step 3
		driver.manage().window().maximize();
		//
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String path="C:/Backup Data/Programs/Java Project/14_sept/src/test/Book1.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		String Username =WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(Username);
		FileInputStream File2 = new FileInputStream(path);
		String Password =WorkbookFactory.create(File2).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(Password);
		String Text = driver.findElement(By.xpath("//h6[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]")).getText();
				if (Text.equals(Password)) {
				System.out.println("Login succesfilly");
				} else {
				System.out.println("Incorrect home page name");
				}
				driver.quit();
	}
}
