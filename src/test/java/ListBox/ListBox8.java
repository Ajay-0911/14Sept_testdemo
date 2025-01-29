package ListBox;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ListBox8 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("Pune");
		Thread.sleep(2000);
		 List<WebElement> List1 = driver.findElements(By.xpath("//text[@class=\"placeHolderMainText\"]"));
		 System.out.println(List1.size());
		 
		 for(int i=0 ;i<List1.size();i++) {
			 String S1 =List1.get(i).getText();
			 System.out.println(S1);
			 if(S1.equals("Vashi"))
			 {
			 List1.get(i).click();
			 break;
			 }
			 }
		 driver.findElement(By.id("dest")).sendKeys("Pune");
		 Thread.sleep(2000);
		 List<WebElement> List2= driver.findElements(By.xpath("//text[@class=\"placeHolderMainText\"]"));
		 for(int i=0 ;i<List2.size();i++) {
		 String S2 =List2.get(i).getText();
		 System.out.println(S2);
		 if(S2.equals("Wakad"))
		 {
		 List2.get(i).click();
		 break;
		 
		
	}
}
		 driver.findElement(By.xpath("//div[@class='labelCalendarContainer']")).click();
		 driver.findElement(By.xpath("//span[text()='14']")).click();
		 driver.findElement(By.id("search_button")).click();
}
}