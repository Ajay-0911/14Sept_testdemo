package WindowHandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Progam4 {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		String WinId = driver.getWindowHandle();
		System.out.println(WinId);
		String Exp_Result = "Selenium automates browsers. That's it!";

		Set<String> Ids = driver.getWindowHandles();
		for (String WinIds : Ids) {
			if (!WinId.equals(WinIds)) {
				driver.switchTo().window(WinIds);

				String text = driver.findElement(By.xpath("//h1[@class=\"d-1 fw-bold\"]")).getText();
				if (text.equals(Exp_Result)) {
					System.out.println("Child window correct text");
				} else {
					System.out.println("Incorrect text");
				}
			}

		}
		driver.switchTo().window(WinId);
		String ParentText = driver.findElement(By.xpath("//div[@align=\"center\"]")).getText();

		if (ParentText.equals("Automation Demo Site")) {
			System.out.println("Parent window correct text");
		} else {
			System.out.println("P incorrect text");
		}
	}
}