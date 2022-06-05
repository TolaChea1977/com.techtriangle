package tola.automationTesting.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;
import Utilities.CommonMethods;

public class MyAccountRegistrationPage extends CommonMethods{
	public  MyAccountRegistrationPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy (xpath = "//a[normalize-space()='My Account']")
	public WebElement myAccountMenu;
	
	@FindBy (xpath = "//input[@id='reg_email']")
	public WebElement registerEmail;
	
	@FindBy (xpath = "//input[@id='reg_password']")
	public WebElement registerPass;
	
	@FindBy (xpath = "//input[@name='register']")
	public WebElement registerButton;
	
	public void CheckRegistration() {	
		registerEmail.sendKeys(BaseClass.getProperty("RegEmail"));
		registerPass.sendKeys(BaseClass.getProperty("RegPassword"));
		registerButton.click();
	}

}

/* Registration-Sign-in
2. Registration with invalid Email-id
3. Registration with empty Email-id
4. Registration with empty password
5. Registration with empty Email-id & password

 * */





