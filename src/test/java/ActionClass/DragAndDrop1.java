package ActionClass;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragAndDrop1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement src = driver.findElement(By.id("box3"));
		WebElement dest = driver.findElement(By.id("box103"));
		WebElement src1 = driver.findElement(By.id("box6"));
		WebElement dest1 = driver.findElement(By.id("box106"));
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).perform();
		act.dragAndDrop(src1, dest1).perform();
	}
}
