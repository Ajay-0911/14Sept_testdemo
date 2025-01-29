package Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Screenshotts2 {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();

		String ImgName = "KiteZeroda";
		//to take the screesnhots
		String Random = RandomString.make(7); //ertyy
		File S1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File S2 = new File("C:/Backup Data/Programs/Java Project/14_sept/target/"+ImgName+"_"+Random+".jpg");
		FileHandler.copy(S1, S2);
		FileUtils.copyFile(S1, S2);
		driver.close();
	}
}
