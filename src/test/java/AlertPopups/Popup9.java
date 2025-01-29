package AlertPopups;

import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Popup9 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		List<WebElement>List = driver.findElements(By.xpath("//table//tr[td[text()=\"New York\"]]//td[1]"));
//		for(WebElement web :List) {
//		System.out.println(web.getText());
		

		 driver.get("https://the-internet.herokuapp.com/upload");
		 driver.findElement(By.id("file-upload")).sendKeys("C:/Users/akkul/OneDrive/Desktop/Book1.xlsx");
		 
		 Thread.sleep(4000);
		 driver.findElement(By.id("file-submit")).click();
	}
}

