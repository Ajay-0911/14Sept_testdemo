package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeysandClickMethods {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement ele1 =driver.findElement(By.id("email"));
		WebElement ele2 =driver.findElement(By.id("pass"));
		WebElement login =driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// js.executeScript("arguments[0].value='"+"Test@gmail.com"+"';",ele1);
		//
		// js.executeScript("arguments[0].value='"+"Test@gmail.com"+"';",ele2);
		//

		js.executeScript("document.getElementById('email').value='test';");

		js.executeScript("document.getElementById('pass').value='test1232';");

	

		js.executeScript("arguments[0].click()", login);
	}
}
