package IFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrame3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		 //  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/recaptcha/api2/demo");
		
		WebElement iFrame = driver.findElement(By.xpath("//div[@id=\"recaptcha-demo\"]//iframe"));
		
		driver.switchTo().frame(iFrame);
		
		driver.findElement(By.xpath("//span[@id=\"recaptcha-anchor\"]")).click();
		Thread.sleep(5000);
		 driver.switchTo().alert();
//		popup.accept();
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	}
}
