package FindElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//1.
		WebElement SearchBox=driver.findElement(By.id("twotabsearchtextbox"));

		SearchBox.sendKeys("Iphone");

		 WebElement Ele = driver.findElement(By.xpath("//div[@class=\"s-suggestion s-suggestion-ellipsis-direction\"]"));

		//WebElement Ele1= driver.findElement(By.xpath("//div[@class=\"s-suggestion s-suggestion-ellipsis-directiortyt\"]"));
		System.out.println(Ele.getText());
	}
}
