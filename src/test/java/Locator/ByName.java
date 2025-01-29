package Locator;

import org.openqa.selenium.By;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ByName {
public static void main(String[] args) throws InterruptedException {
	

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://practicetestautomation.com/practice-test-login/");

	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("test");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("Test123");
	Thread.sleep(2000);
	driver.findElement(By.id("submit")).click();
}
}