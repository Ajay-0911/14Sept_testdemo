package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo {
public static void main(String[] args) throws InterruptedException {
	
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/?next=%2Fdashboard%3Flogin%3Dtrue");
	
	//driver.findElement(By.partialLinkText("Don't have an account? Signup now!")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Don't have an account? Signup now!')]")).click();
	Thread.sleep(2000);
	driver.close();
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver1 = new ChromeDriver();
	
	driver1.manage().window().maximize();
	
	
}
}
