package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Screenshot3 {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String Test ="Facebook";
		Screenshot3.TakeScreenshot(Test);
		Screenshot3.TakeScreenshot(Test);
		driver.close();
		
	}
	private static void TakeScreenshot(String text) throws IOException {
		String Random =RandomString.make(10);
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("C:/Backup Data/Programs/Java Project/14_sept/target/"+ text+ "_"+Random+".jpg");
		FileHandler.copy(Source, Dest);
		
	}
}
