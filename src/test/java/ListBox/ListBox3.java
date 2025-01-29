package ListBox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
public class ListBox3 {

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
		//selectByValue(String value)
		Select S1 = new Select(Day);
		S1.selectByValue("6");
		Select S2 = new Select(Month);
		S2.selectByValue("4");
		Select S3 = new Select(Year);
		S3.selectByValue("2017");
	}
}
