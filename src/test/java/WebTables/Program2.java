package WebTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://practice.expandtesting.com/tables");
		int row = driver.findElements(By.xpath("//table[@id=\"table1\"]//tr")).size();
		System.out.println(row);
		int Col = driver.findElements(By.xpath("//table[@id=\"table1\"]//tr//th")).size();
		System.out.println(Col);

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= Col; j++) {
				String text = driver.findElement(By.xpath("//table[@id=\"table1\"]//tr[" + i + "]//td[" + j+ "]"))
						.getText();
				// System.out.println(text);
//				if (text.equals("Tim")) { // True
//					System.out.println(i + " " + j);
				
					System.out.println(text);
				}

			}
			System.out.println();
		}
	}

