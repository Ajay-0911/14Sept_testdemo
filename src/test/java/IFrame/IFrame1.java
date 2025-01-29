package IFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrame1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		boolean B1 = driver.findElement(By.id("demo")).isDisplayed();
		if(B1==true) {
				System.out.println("Test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("runbtn")).click();
	//	driver.close();
	}
}
