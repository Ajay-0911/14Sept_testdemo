package IFrame;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class Iframe5 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");

		driver.manage().window().maximize();
		driver.switchTo().frame(1); //iframeResult
		String Text=driver.findElement(By.xpath("//h2[contains(text(),'HTML Iframes')]")).getText();
		System.out.println(Text);
		driver.switchTo().frame(0);
		String T2=driver.findElement(By.xpath("//h1[contains(text(),'This page is displayed in an iframe')]")).getText();
		System.out.println(T2);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("runbtn")).click();
		driver.switchTo().alert();
		
	}
}
