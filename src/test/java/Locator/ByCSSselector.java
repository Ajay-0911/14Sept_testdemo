package Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ByCSSselector {

	public static void main(String[] args) throws InterruptedException {
		//1. #ID
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.cssSelector("#email")).sendKeys("TEst@gamil.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("ERTY");
		driver.findElement(By.name("login")).click();
		//2. Tagname#ID
		driver.findElement(By.cssSelector("input#email")).sendKeys("RTYU");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("ERTY");

		

		driver.findElement(By.name("login")).click();
		//3. [attributename=attributevalue]
		driver.findElement(By.cssSelector("[class=\"inputtext _55r1_6luy\"]")).sendKeys("RTY");
		driver.findElement(By.cssSelector("[name=\"pass\"]")).sendKeys("ertyj");

		Thread.sleep(5000);
		//4. tagname[attributename=attributevalue]

		driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("ERTYU");
		driver.findElement(By.cssSelector("input[name=\"pass\"]")).sendKeys("#$$");

		//5. tagname.classvalue

		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy")).sendKeys("234567");
		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("E%^");
		driver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy")).click();

		driver.close();
	}
}
