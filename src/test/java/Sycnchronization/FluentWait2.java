package Sycnchronization;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
public class FluentWait2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String URL = "https://www.facebook.com/";
		driver.get(URL);
		By input1 = By.id("email");
		By input2 = By.id("pass1");
		WaitforFluent(driver, input1).sendKeys("Test1223");
		WaitforFluent(driver, input2).sendKeys("Test@1223");
	}
		public static WebElement WaitforFluent(final WebDriver driver, final By
				src) {

				Wait<WebDriver> wait = new

				FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30L))

				.pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);

				WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver input) {
				return driver.findElement(src);
				}
				});
				return foo;
	}
	
}
