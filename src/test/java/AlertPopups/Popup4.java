package AlertPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup4 {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		String str = "You clicked: Ok";
		Alert popup = driver.switchTo().alert();
		
		popup.accept();
		String text = driver.findElement(By.id("result")).getText();
		if(str.equals(text)) {
			System.out.println("Correct text");
		}
		else {
			System.out.println("incorrect Text");
		}
	}
}
