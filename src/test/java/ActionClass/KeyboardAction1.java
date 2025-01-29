package ActionClass;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class KeyboardAction1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement W1 = driver.findElement(By.id("email"));
		WebElement W2 = driver.findElement(By.id("pass"));
		W1.sendKeys("Test@gmailcom");
		//W2.sendKeys("Test@123");
		Actions act = new Actions(driver);
		///ctr+A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
	
		//ctr+c
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		
		//tab
	
		act.keyDown(Keys.TAB);
		act.build().perform();
		
		//ctr+v
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
		@Nullable
		String T1 = W1.getAttribute("Value");
		@Nullable
		String T2 = W2.getAttribute("Value");
		if (T1.equals(T2)) {
		System.out.println("Correct text");
		}
		else {
		System.out.println("Incorrec text");
		
		
	}
}
}
