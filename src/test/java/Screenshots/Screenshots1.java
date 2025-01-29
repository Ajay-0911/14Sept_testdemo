package Screenshots;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots1 {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		File  S1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String ImgName = "KiteZeroda";
		System.out.println(S1);
		File S2 =new File("C:/Backup Data/Programs/Java Project/14_sept/target" + ImgName + ".jpg");
		FileHandler.copy(S1, S2);
		FileUtils.copyFile(S1, S2);
		driver.close();
		
	 
	   
		
	}
}
