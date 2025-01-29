package Screenshots;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Screenshots5 {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement FacebookLogo =driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilhimg\"]"));
		String Random = RandomString.make(10);
		String Facebook = "Test";
		File Src=((TakesScreenshot)FacebookLogo).getScreenshotAs(OutputType.FILE);
		File Dest = new File("/Users/ranjeetkendre/eclipse-workspace/14_Sep_Automation/Screenshots/"+Facebook+"_"+Random+".jpg");
		FileUtils.copyFile(Src, Dest);
		driver.close();
	}
}
