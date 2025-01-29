package Sycnchronization;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Implicitlywait1{

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// implicit wait = dynamic wait -20-10 - visible - 10
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Test");
		driver.findElement(By.id("pass1")).sendKeys("TEst"); //18
		driver.quit();
	}
}
