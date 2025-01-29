package WindowHandle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Prgram2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Thread.sleep(3000);
		String WinID = driver.getWindowHandle();
		System.out.println(WinID);
		//2 geWindowHandles
		//1 first way
		Set<String> WinIds = driver.getWindowHandles();
		Iterator<String> Test = WinIds.iterator();
		String ParentWindow = Test.next();
		String childWindow = Test.next();
		System.out.println(ParentWindow);
		System.out.println(childWindow);
		driver.switchTo().window(childWindow);
		
		
		driver.findElement(By.id("Form_submitForm_EmailHomePage")).sendKeys("Test@gmail.com");
				
	   driver.findElement(By.id("Form_submitForm_action_request")).click();
//		//2 second way
//		List<String> WinList = new ArrayList<String>(WinIds);
//		String ParentWindow = WinList.get(0);
//		String ChildWindow = WinList.get(1);
//		driver.switchTo().window(ParentWindow);
//		
//		String title1 = driver.getTitle();
//		System.out.println(title1);
//		driver.quit();
	}
}
