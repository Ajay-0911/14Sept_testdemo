package Sycnchronization;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplicitWait1 {

	public static void main(String[] args) {
		// Explicit wait
		// Thread.sleet - static wait
		// Imp wait - dynamic wait
		// Explcit wait - dynamic wait
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");
		
		WebDriverWait Mywait = new WebDriverWait(driver, Duration.ofSeconds(360));
		
		      WebElement Ele =Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("src"))); //20- 340

				Ele.sendKeys("Pune"); // 5 - 5 ignore
				WebElement Ele1 =Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dest1"))); //360

				Ele1.sendKeys("Mumbai");
				driver.quit();
	}
}
