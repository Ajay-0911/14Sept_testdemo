package Screenshots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class Screenshots6 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		String ImgName = "KiteZeroda";
		String TimeStamp = new

		SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		File S1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

				//File Dest = new File("/Users/ranjeetkendre/eclipse-workspace/

				//14_Sep_Automation/Screenshots/"+ImgName+"_"+TimeStamp+".jpg");

		           String path = ".//Screenshots//";
		           File Dest = new File(path+"_"+ImgName+"_"+TimeStamp+".jpg");
		           FileUtils.copyFile(S1, Dest);
		           System.out.println(TimeStamp);
		           driver.close();
	}
}
