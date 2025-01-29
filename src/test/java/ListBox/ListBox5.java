package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBox5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();

		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Akash");
		driver.findElement(By.name("lastname")).sendKeys("Patil");
		driver.findElements(null);
		WebElement Day =driver.findElement(By.id("day"));
		WebElement Month =driver.findElement(By.id("month"));
		WebElement Year =driver.findElement(By.id("year"));
		ListBox(Day, "15");
		ListBox(Month, "May");
		ListBox(Year,"2009");
		String Str = "20,Jun,2005";
		String [] Date = Str.split(",");
		//0 -20 ,1 -Jun ,2 -2005
		ListBox(Day, Date[0]);
		ListBox(Month, Date[1]);
		ListBox(Year, Date[2]);
		}
		public static void ListBox(WebElement element, String Text) {
		Select S1 = new Select(element);
		S1.selectByVisibleText(Text);
	}
}
