package Demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCurrentUrl {

	public static void main(String[] args) {
		
		String Expected_Url ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		if(Expected_Url.equals(url)) {
			System.out.println("Correct url");
		}
		else {
			System.out.println("Incorrect url");
		}
		driver.close();
	}
}
