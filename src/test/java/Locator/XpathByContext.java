package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathByContext {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
	String Text =	driver.findElement(By.xpath("//h2[contains (text(),'Facebook helps you connect and share with the people in your life.')]")).getText();
	
	if(Text.equals("Facebook helps you connect and share with the people in your life.")) {
		System.out.println("Correct Statement");
	}
	else {
		System.out.println("Incorrect Statement"
				+ "");
	}
 }
}
