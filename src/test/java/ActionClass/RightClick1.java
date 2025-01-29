package ActionClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class RightClick1 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement Ele = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		Actions act = new Actions(driver);
		act.contextClick(Ele).build().perform();
		driver.findElement(By.xpath("(//span[contains(text(),'Copy')])[2]")).click();
		Alert Alt =driver.switchTo().alert();
		String Text =Alt.getText();
		System.out.println(Text);
		Alt.accept();
	}
}
