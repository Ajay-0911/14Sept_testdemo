package ListBox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBox6 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();

		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Akash");
		driver.findElement(By.name("lastname")).sendKeys("Patil");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("556789");

		driver.findElement(By.id("password_step_input")).sendKeys("ert234");
		String Str = "20/Jun/2005";
		String[] date = Str.split("/");
		WebElement Day = driver.findElement(By.id("day"));
		WebElement Month = driver.findElement(By.id("month"));
		WebElement Year = driver.findElement(By.id("year"));

		Select s1 = new Select(Day);

		List<WebElement> D1 = s1.getOptions();
		System.out.println(D1.size());

		for (int i = 0; i < D1.size(); i++) {
			String D2 = D1.get(i).getText();
			System.out.println(D2);
			if (D2.equals(date[0])) {
				D1.get(i).click();
				break;
			}

		}
		Select S2 = new Select(Month);
		List<WebElement> M2 = S2.getOptions();
		System.out.println(M2.size());
		for (int i = 0; i < M2.size(); i++) {
			String D3 = M2.get(i).getText();
			if (D3.equals(date[1])) {
				M2.get(i).click();
				break;

			}
		}
		Select S3 = new Select(Year);
		List<WebElement> D4 = S3.getOptions();
		System.out.println(D4.size());
		for (int i = 0; i < D4.size(); i++) {
			String Year2 = D4.get(i).getText();
			if (Year2.equals(date[2])) {
				D4.get(i).click();
				break;

			}

		}
	}
}