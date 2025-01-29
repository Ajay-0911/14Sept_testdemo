package Demo;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getback {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.get("https://www.flipkart.com/");
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.close();
		
	}
}
