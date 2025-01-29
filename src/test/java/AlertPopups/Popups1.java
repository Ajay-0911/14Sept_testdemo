package AlertPopups;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Popups1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.bigbasket.com/");
		
		driver.findElement(By.xpath("//button[contains(text(),'Login/ Sign Up')]")).click();
		//driver.findElement(By.xpath("//label[@for=\"multiform\"]")).sendKeys("akk@gmail.com");
		
	//	driver.findElement(By.xpath("//label[@for=\"multiform\"]")).sendKeys("TEst@gmail.com");
          Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class=\"absolute top-0 right-0\"]")).click();
		
	//	driver.close();
	}
}
