package Locator;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ByClassname {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.className("inputtext")).sendKeys("Test");
		driver.findElement(By.id("pass")).sendKeys("Ab12");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
	}
}
