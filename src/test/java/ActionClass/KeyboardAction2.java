package ActionClass;

import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class KeyboardAction2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// Step 2
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/key_presses?");
		Actions act = new Actions(driver);
		act.keyDown(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		act.keyDown(Keys.SPACE).perform();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).perform();
		Thread.sleep(2000);
		act.keyDown(Keys.DELETE).perform();
		Thread.sleep(2000);
		}
}
