package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
		
		driver.close();
		
	}
}
