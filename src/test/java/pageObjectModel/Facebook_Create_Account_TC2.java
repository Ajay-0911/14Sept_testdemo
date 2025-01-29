package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_Create_Account_TC2 {

	WebDriver driver;
	// Step 1
	@FindBy(name = "firstname")
	WebElement FirstName;
	@FindBy(name = "lastname")
	WebElement LastName;
	@FindBy(xpath = "//input[@value=\"2\"]")
	private WebElement Gender;
	@FindBy(name = "reg_email__")
	WebElement Reg_email;
	@FindBy(name = "reg_passwd__")
	WebElement Reg_Password;
	@FindBy(name = "websubmit")
	WebElement SignUp;
	// Step 2
	public Facebook_Create_Account_TC2(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	// Step 3
	public void FirstName(String Name) {
	FirstName.sendKeys(Name);
	}
	public void LatName(String Name) {
	LastName.sendKeys(Name);
	}
	public void GN() {
	Gender.click();
	}
	public void RegEmail(String EM) {
	Reg_email.sendKeys(EM);
	}
	public void RegPass(String Pass) {
	Reg_Password.sendKeys(Pass);
	}
	public void Signup() {
	SignUp.click();
	}
	}

