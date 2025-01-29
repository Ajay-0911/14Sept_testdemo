package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBox2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();

		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("Akash");
		driver.findElement(By.name("lastname")).sendKeys("Patil");
		WebElement Day =driver.findElement(By.id("day"));
		WebElement Month =driver.findElement(By.id("month"));
		WebElement Year =driver.findElement(By.id("year"));
		//selectByVisibleText
		Select S1 = new Select(Day);
		S1.selectByVisibleText("10");
		Select S2 = new Select(Month);
		S2.selectByVisibleText("May");
		Select S3 = new Select(Year);
		S3.selectByVisibleText("2010");
		Select S4 = new Select(Day);
		S4.selectByVisibleText("11");
		Select S5 = new Select(Month);
		S5.selectByVisibleText("Jun");
		Select S6 = new Select(Year);
		S6.selectByVisibleText("2012");
		driver.close();
	}
}
