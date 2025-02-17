package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException {
		String Expected_Title = "Facebook – log in or sign up";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String Actual_Title =driver.getTitle();
		if(Expected_Title.equals(Actual_Title)) {
		System.out.println("Correct Title");
		}
		else {
		System.out.println("Incorrect title");
		}
		driver.close();
		
	}
}