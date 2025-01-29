package AlertPopups;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Popups2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		
		String str = "You successfully clicked an alert";
		
		Alert Popup = driver.switchTo().alert();
		Popup.accept();
		String Text = driver.findElement(By.id("result")).getText();
		if(str.equals(Text)) {
			System.out.println("Correct Text");
		}
		else {
			System.out.println("Incorrect text");
		}
	}
}
