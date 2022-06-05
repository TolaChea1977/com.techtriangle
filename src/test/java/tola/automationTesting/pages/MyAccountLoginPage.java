package tola.automationTesting.pages;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.BaseClass;
import Utilities.CommonMethods;

public class MyAccountLoginPage extends CommonMethods {
	
	homePage hP = new homePage();
	MyAccountRegistrationPage mar = new MyAccountRegistrationPage();
	
	public  MyAccountLoginPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy (xpath = "//a[normalize-space()='My Account']")
	public WebElement myAccountMenu;
	
	@FindBy(xpath = "//input[@id='username']")
	public WebElement userName;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@name='login']")
	public WebElement logIn;
	
	@FindBy (xpath = "//div[@id='body']//p[1]")
	public WebElement messageAfterLogIn;
	
	@FindBy (xpath = "//p[1]//a[1]")
	public WebElement signOut;
	
	@FindBy (xpath = "//div[@class='u-column1 col-1']//h2")
	public WebElement logInTitle;
	
	@FindBy (xpath = "//div[@class='u-column2 col-2']//h2")
	public WebElement RegisterTitle;
	
	
	public void checkLoginWithValidUsernameAndPassword() {
		userName.sendKeys(BaseClass.getProperty("RegEmail"));
		password.sendKeys(BaseClass.getProperty("RegPassword"));
		logIn.click();
	}
	
	public void checkLoginWithIncorrectUsernameAndPassword() {
		userName.sendKeys(BaseClass.getProperty("IncorrectUserName"));
		password.sendKeys(BaseClass.getProperty("IncorrectPassword"));
		logIn.click();
	}
	public void checkLoginWithCorrectUsernameAndEmptyPassword() {
		userName.sendKeys(BaseClass.getProperty("RegEmail"));
		password.sendKeys(BaseClass.getProperty("EmptyPassword"));
		logIn.click();
	}
	
	public void checkLoginWithEmptyUsernameAndCorrectPassword() {
		userName.sendKeys(BaseClass.getProperty("EmptyEmail"));
		password.sendKeys(BaseClass.getProperty("RegPassword"));
		logIn.click();
	}
	
	public void checkLoginWithEmptyUsernameAndPassword() {
		userName.sendKeys(BaseClass.getProperty("EmptyEmail"));
		password.sendKeys(BaseClass.getProperty("EmptyPassword"));
		logIn.click();
	}
	
	public void checkLoginPasswordShouldBeMasked() {
		userName.sendKeys(BaseClass.getProperty("RegEmail"));
		password.sendKeys(BaseClass.getProperty("RegPassword"));
	}
	
	public void checkLoginHandlesCaseSensitive() {
		userName.sendKeys(BaseClass.getProperty("CaseChangedUserName"));
		password.sendKeys(BaseClass.getProperty("CaseChangedPassword"));
		logIn.click();
	}
	public void checkLoginAuthentication() {
		userName.sendKeys(BaseClass.getProperty("RegEmail"));
		password.sendKeys(BaseClass.getProperty("RegPassword"));
		logIn.click();
	}
}

