package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.switchTo().frame("iframeResult");
		String text = driver.findElement(By.id("field1")).getText();
		WebElement Ele = driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
		Actions Act = new Actions(driver);
		Act.doubleClick().build().perform();
		String text2 = driver.findElement(By.id("field2")).getText();
		if(text.equals(text2)) {
			System.out.println("correct text");
		}
		else {
			System.out.println("incorrect text");
		}
		
	}
}
