package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathByattriute {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]")).click();

		driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("test@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"ap_password\"]")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();

		Thread.sleep(2000);
		driver.close();
	}
}
