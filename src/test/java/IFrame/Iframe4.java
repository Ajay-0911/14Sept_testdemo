package IFrame;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Iframe4 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		WebElement OuterFrame = driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
		driver.switchTo().frame(OuterFrame);
		WebElement text = driver.findElement(By.xpath("//h5[contains(text(),'Nested iFrames')]"));
		
		String t1 = text.getText();
		if(t1.equals("Nested iFrames")) {
			System.out.println("Correct text");
		}
		else {
			System.out.println("Incorrect text");
		}
		
		WebElement InnerFrame = driver.findElement(By.xpath("//div[@class=\"iframe-container\"]//iframe"));
		driver.switchTo().frame(InnerFrame);
		WebElement Text2 = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		
		Text2.sendKeys("Automation Testing");
		
		driver.switchTo().parentFrame();
		String t2 = text.getText();
		
		System.out.println(t2);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
	}
}
