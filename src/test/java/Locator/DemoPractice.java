package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoPractice {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("test");
		
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Test1");
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("Test12345");
		driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]")).sendKeys("Test@email.com");
		driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]")).sendKeys("1235587");
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Cricket\"]")).click();
		
	}
}
