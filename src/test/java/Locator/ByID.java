package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByID {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("gdgdgdh");
		driver.findElement(By.id("pass")).sendKeys("hgdf");
		
		driver.findElement(By.id("u_0_5_Pw")).click();
	}
}
