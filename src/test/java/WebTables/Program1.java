package WebTables;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Program1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//How many rows in a table
		//List<WebElement> Rows = driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//tr"));
		//System.out.println(Rows.size());
		
		 int row =driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//tr")).size();
		 System.out.println(row);
		 // how many columns in a table
		 int Col = driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//th")).size();
		 System.out.println(Col);
		 // retrieve the specific row and column data
		 
		 String text = driver.findElement(By.xpath("//table[@id=\"customers\"]//tbody//tr[3]/td[3]")).getText();
		// String text2 = driver.findElement(By.xpath("//table[@id=\"customers\"]//tbody//tr[5]/td[1]")).getText();
		 System.out.println(text);
	//	 System.out.println(text2);
		 
		 // retrieve all data from table
		 for(int i=2; i<=row; i++) {
			 for(int j=1; j<=Col; j++) {
				 String text3 = driver.findElement(By.xpath("//table[@id=\"customers\"]//tbody/tr["+i+"]/td["+j+"]")).getText();
//				 if(text3.equals("Canada")) {
//					 System.out.println(i+" "+j);
//				 }
				 System.out.println(text3 + " ");
			 }
			 System.out.println();
		 }
		 //driver.close();
	}
}
