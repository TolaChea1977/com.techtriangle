package tola.automationTesting.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
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
	
	@FindBy (xpath = "//*[@id='page-36']/div/div[1]/div/p[1]")
	public WebElement registerResult;
	
	@FindBy (xpath = "//*[@class='woocommerce-error']/li")
	public WebElement errorMessage;
	
	public void checkRegistration() throws InterruptedException {	
		registerEmail.sendKeys(BaseClass.getProperty("RegEmail"));
		registerPass.sendKeys(BaseClass.getProperty("RegPassword"));
		Thread.sleep(1000);
		registerButton.click();
	}
	
	public void checkRegistrationInvalidEmailId() throws InterruptedException {
		
		registerEmail.sendKeys(BaseClass.getProperty("InvalidEmail"));
		registerPass.sendKeys(BaseClass.getProperty("Invalidpassword"));
		Thread.sleep(3000);
		registerPass.sendKeys(" ");
		registerButton.click();
	}
	
	public void checkRegistrationEmptyEmailId() throws InterruptedException {
		registerEmail.sendKeys(BaseClass.getProperty("EmptyEmail"));
		registerPass.sendKeys(BaseClass.getProperty("Invalidpassword"));
		Thread.sleep(3000);
		registerPass.sendKeys(" ");
		registerButton.click();
	}
	
	public void checkRegistrationEmptyPassword() throws InterruptedException {
		registerEmail.sendKeys(BaseClass.getProperty("NewEmailaddress"));
		registerPass.sendKeys(BaseClass.getProperty("EmptyPassword"));
		Thread.sleep(3000);
		registerButton.click();
	}
	
	public void checkRegistrationWithEmptyEmailAndPassword() throws InterruptedException {
		registerEmail.sendKeys(BaseClass.getProperty("EmptyEmail"));
		registerPass.sendKeys(BaseClass.getProperty("EmptyPassword"));
		Thread.sleep(3000);
		registerButton.click();
	}
}






