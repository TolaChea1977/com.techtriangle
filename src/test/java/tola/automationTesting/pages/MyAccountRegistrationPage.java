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
	
	public void CheckRegistration() throws InterruptedException {	
		registerEmail.sendKeys(BaseClass.getProperty("RegEmail"));
		Thread.sleep(2000);
		registerPass.sendKeys(BaseClass.getProperty("RegPassword"));
		Thread.sleep(2000);
		registerButton.click();
	}
	
	@FindBy (xpath = "//*[@id='page-36']/div/div[1]/ul/li")
	public WebElement errorMessage;
	
	
	
	public void invalidEmailId() throws InterruptedException {
		
		registerEmail.sendKeys(BaseClass.getProperty("InvalidEmail"));
		registerPass.sendKeys(BaseClass.getProperty("Invalidpassword"));
		Thread.sleep(3000);
		waitForClickability(registerButton);
		registerButton.submit();
		String actualMessage = errorMessage.getText();
		String expectedMessage = "Error: An account is already registered with your email address. Please login.";
		Assert.assertEquals(actualMessage,expectedMessage);
		System.out.println("Resgister is fail "+actualMessage);
	}
	
	

}

/* 
2. Registration with invalid Email-id
3. Registration with empty Email-id
4. Registration with empty password
5. Registration with empty Email-id & password

 * */





