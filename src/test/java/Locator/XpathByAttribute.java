package Locator;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class XpathByAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("test@gmail.com");
		
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("abcd123");
		
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		Thread.sleep(5000);
		driver.close();
	}
	
}
