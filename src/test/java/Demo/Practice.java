package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/?next=%2Fdashboard%3Flogin%3Dtrue");
		driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys("abcde");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		
	}
}
