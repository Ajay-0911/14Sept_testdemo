package ListBox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListBox7 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();

		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Akash");
		driver.findElement(By.name("lastname")).sendKeys("Patil");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("556789");
		driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("ert123");
		String Str = "20/Jun/2005";
		String[] date = Str.split("/");

		WebElement Day = driver.findElement(By.id("day"));
		WebElement Month = driver.findElement(By.id("month"));
		WebElement Year = driver.findElement(By.id("year"));

		Select s1 = new Select(Day);
		List<WebElement> S2 = s1.getOptions();
		System.out.println(S2.size());

		List<WebElement> D1 = driver.findElements(By.xpath("//select[@id=\"day\"]/option"));
		int D2 = D1.size();
		System.out.println(D2);
		for (int i = 0; i < D1.size(); i++) {
			String Dayvalue = D1.get(i).getText();
			System.out.println(Dayvalue);

			if (Dayvalue.equals("15")) {
				D1.get(i).click();

			}
		}
		List<WebElement> D3 = driver.findElements(By.xpath("//select[@id=\"month\"]/option"));
		int D4 = D3.size();
		System.out.println(D4);
		for (int i = 0; i < D3.size(); i++) {
			String Monthvalue = D3.get(i).getText();
			System.out.println(Monthvalue);

			if (Monthvalue.equals("Jun")) {
				D3.get(i).click();
				break;
			}
		}
		List<WebElement> D5 = driver.findElements(By.xpath("//select[@id=\"year\"]/option"));
		int D6 = D5.size();
		System.out.println(D4);
		for (int i = 0; i < D5.size(); i++) {
			String Yearvalue = D5.get(i).getText();
			System.out.println(Yearvalue);

			if (Yearvalue.equals("2005")) {
				D5.get(i).click();
				break;

			}
		}

	}
}