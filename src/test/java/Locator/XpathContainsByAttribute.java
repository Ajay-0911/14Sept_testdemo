package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathContainsByAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[contains(@id,\"email\")]")).sendKeys("Abcde");
		driver.findElement(By.xpath("//input[contains(@id,\"pass\")]")).sendKeys("ghhf");
		
		driver.findElement(By.xpath("//button[contains(@name,\"login\")]")).click();
		
	}
}
