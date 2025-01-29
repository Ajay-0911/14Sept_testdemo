package Screenshots;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Screenshots4 {

	public static void main(String[] args) throws IOException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		String ImgName = "KiteZeroda";
		//to take the screesnhots
		String Random = RandomString.make(7); //ertyy
		String Imgname = "Face";
		File S1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = "./";
		Path Dir=Paths.get("src","test","resources");
		String Apath =Dir.toFile().getAbsolutePath();
		System.out.println(Apath);
		File S2 = new File(Apath+"/Screenshots/"+Imgname+"_"+Random);
		FileUtils.copyFile(S1, S2);
		driver.close();	
	}

}
