package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBox1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();

				Thread.sleep(5000);
				driver.findElement(By.name("firstname")).sendKeys("Akash");
				driver.findElement(By.name("lastname")).sendKeys("Patil");
				driver.findElement(By.id("day")).click();
				driver.findElement(By.xpath("//option[contains(text(),'15')]")).click();

				driver.findElement(By.id("month")).click();
				driver.findElement(By.xpath("//option[contains(text(),'May')]")).click();

				driver.findElement(By.id("year")).click();
				driver.findElement(By.xpath("//option[contains(text(),'2012')]")).click();

				driver.findElement(By.id("day")).click();
				driver.findElement(By.xpath("//option[contains(text(),'25')]")).click();

				driver.findElement(By.id("month")).click();
				driver.findElement(By.xpath("//option[contains(text(),'Jun')]")).click();

				driver.findElement(By.id("year")).click();
				driver.findElement(By.xpath("//option[contains(text(),'2015')]")).click();

				Thread.sleep(5000);
				driver.close();
	}
}
