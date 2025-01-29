package pageObjectModel;

import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestBaseClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	//

	Facbook_Login_Tc1  F1 = new Facbook_Login_Tc1 (driver);

	//

	F1.OpenApplication();
	// F1.UserName("Test@123");
	// F1.PassWord("TEst12");
	// F1.FacebookLoginButton();

	Facebook_Create_Account_TC2  FC = new Facebook_Create_Account_TC2 (driver);
	F1.Create_Account();
	FC.FirstName("Rohit");
	FC.LatName("Patil");
	FC.GN();
	FC.RegEmail("Test@1234");
	FC.RegPass("TTTt@122");
	FC.Signup();
	}
}
