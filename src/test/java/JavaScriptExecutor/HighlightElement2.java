package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HighlightElement2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement Ele =driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));

		WebElement In1 =driver.findElement(By.id("email"));
		WebElement In2 =driver.findElement(By.id("pass"));
		HighlightElement2.drawborder(driver, Ele);
		HighlightElement2.drawborder(driver, In1);
		HighlightElement2.drawborder(driver, In2);
		}
		public static void drawborder(WebDriver driver,WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='5px solid red'", ele);
		js.executeScript("arguments[0].style.background='yellow'", ele);
	}
}
