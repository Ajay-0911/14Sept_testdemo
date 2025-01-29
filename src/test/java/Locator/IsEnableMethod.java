package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IsEnableMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		boolean test = driver.findElement(By.xpath("//div[@class=\"col-md-8 col-xs-8 col-sm-8\"]")).isEnabled();
		WebElement Ele =driver.findElement(By.xpath("//div[@class=\"col-md-8 col-xs-8 col-sm-8\"]"));
		driver.findElement(By.xpath("//div[@class=\"col-md-8 col-xs-8 col-sm-8\"]")).click();
		boolean B1 = Ele.isEnabled();
	    System.out.println(B1);
		System.out.println(test);
	}
}
