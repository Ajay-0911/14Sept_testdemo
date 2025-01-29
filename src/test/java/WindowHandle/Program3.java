package WindowHandle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program3 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Set<String> Winid = driver.getWindowHandles();
		Iterator<String> ID = Winid.iterator();
		String Pa = ID.next();
		String Ch = ID.next();
		for (String WindIDs : Winid) {
			String Title = driver.switchTo().window(WindIDs).getTitle();
			System.out.println(Title);
			if (Title.equalsIgnoreCase("OranageHRM") || Title.equals("Test")) {
				//
				// driver.close();

			}
		}
		driver.switchTo().window(Ch);

		driver.findElement(By.id("Form_submitForm_EmailHomePage")).sendKeys("Test@gmail.com");

		driver.findElement(By.id("Form_submitForm_action_request")).click();
	}
}