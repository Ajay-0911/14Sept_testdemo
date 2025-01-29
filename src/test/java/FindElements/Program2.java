package FindElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Program2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/n");
		WebElement Moblie = driver.findElement(By.id("twotabsearchtextbox"));
		Moblie.sendKeys("Iphone");
		
		List<WebElement> L1 = driver.findElements(By.xpath("//div[@class=\"s-suggestion-container\"]"));
			System.out.println(L1.size());
			List<WebElement> Lt1 = driver.findElements(By.xpath("//div[@class=\"s-suggestion-container\"]"));
			System.out.println(Lt1.size());
		
	}
}
