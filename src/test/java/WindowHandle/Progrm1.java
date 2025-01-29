package WindowHandle;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Progrm1 {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		//getwindowhandle
		String WindID = driver.getWindowHandle();
		System.out.println(WindID);
		//1C9F8B2802CBEE8B8DC26F5183C1A2EC
		//3DCE0A9B92D3795DD01DA9439647BF36
	}
}
