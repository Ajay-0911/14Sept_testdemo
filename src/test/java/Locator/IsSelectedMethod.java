package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		WebElement Ele = driver.findElement(By.id("sex"));
		boolean b1 = Ele.isSelected();
		Thread.sleep(3000);
		System.out.println(b1);// false
		Ele.click();
		boolean b2 = Ele.isSelected();
		Thread.sleep(3000);
		System.out.println(b2);// true

//		boolean b3 = driver.findElement(By.xpath("//input[@name=\"sex\"]")).isSelected();
//		Thread.sleep(3000);
//		System.out.println(b3);//false

		boolean B3 = driver.findElement(By.xpath("//input[@name=\"sex\"]")).isSelected();
		System.out.println(B3); // False
		driver.findElement(By.xpath("//input[@name=\"sex\"]")).click();
		boolean B4 = driver.findElement(By.xpath("//input[@name=\"sex\"]")).isSelected();
		Thread.sleep(3000);
		System.out.println(B4);// true
	}
}
