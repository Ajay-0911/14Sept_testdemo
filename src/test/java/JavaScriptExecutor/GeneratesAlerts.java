package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GeneratesAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		GeneratesAlerts.GeneratesAlert1(driver, "Hello good evening");
		Thread.sleep(5000);
		//GeneratesAlerts.GeneratesAlert1(driver, "Automation testing");
		}
		public static void GeneratesAlert1(WebDriver driver, String Message) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('"+Message+"')");
	}
}
