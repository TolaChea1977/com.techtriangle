package testingClass_51Cases;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Utilities.BaseClass;
import tola.automationTesting.pages.MyAccountLoginPage;
import tola.automationTesting.pages.MyAccountRegistrationPage;
import tola.automationTesting.pages.homePage;

public class myAccountLoginTests {
	
	MyAccountLoginPage my = new MyAccountLoginPage();
	MyAccountRegistrationPage mar = new MyAccountRegistrationPage();
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		BaseClass.getDriver();
		BaseClass.getDriver().navigate().back();
		BaseClass.getDriver().navigate().forward();
		my.myAccountMenu.click();
	}
	
	@Test (priority = 1)
	public void loginWithUserNameAndPassword() {
		my.checkLoginWithValidUsernameAndPassword();
		String actualMessage = my.messageAfterLogIn.getText();
		String expectedMessage = "Hello chansereyvatana169 (not chansereyvatana169? Sign out)";
		Assert.assertEquals(actualMessage,expectedMessage);
		System.out.println("Log In successful");
		my.signOut.click();
		
	}
	@Test (priority = 2)
	public void LoginWithIncorrectUsernameAndIncorrectPassword() {
		my.checkLoginWithIncorrectUsernameAndPassword();
		String actualMessage = mar.errorMessage.getText();
		String expectedMessage = "ERROR: Invalid username. Lost your password?";
		Assert.assertTrue(actualMessage.equals(expectedMessage));
		System.out.println("Log In fail");
	}
	@Test (priority = 3)
	public void LoginWithCorrectUsernameAndEmptyPassword() {
		my.checkLoginWithCorrectUsernameAndEmptyPassword();
		String actualMessage = mar.errorMessage.getText();
		String expectedMessage = "Error: Password is required.";
		Assert.assertTrue(actualMessage.equals(expectedMessage));
		System.out.println("Log In fail");
	}
	
	@Test (priority = 4)
	public void LoginWithEmptyUsernameAndCorrectPassword() {
		my.checkLoginWithEmptyUsernameAndCorrectPassword();
		String actualMessage = mar.errorMessage.getText();
		String expectedMessage = "Error: Username is required.";
		Assert.assertTrue(actualMessage.equals(expectedMessage));
		System.out.println("Log In fail");
	}
	
	@Test (priority = 5)
	public void LoginWithEmptyUsernameAndEmptyPassword() {
		my.checkLoginWithEmptyUsernameAndPassword();
		String actualMessage = mar.errorMessage.getText();
		String expectedMessage = "Error: Username is required.";
		Assert.assertTrue(actualMessage.equals(expectedMessage));
		System.out.println("Log In fail");
	}
	
	@Test (priority = 6)
	public void LoginPasswordshouldBeMasked() {
		my.checkLoginPasswordShouldBeMasked();
		System.out.println(my.password.getAttribute("type"));
		Assert.assertTrue(my.password.getAttribute("type").equalsIgnoreCase("password"));
		System.out.println("Test pass");
		//if the attribute of password field locator appear as "Text" means the password are not masked.
		///if the attribute of password field locator appear as "password" means the password are not masked.	
	}
	
	@Test (priority = 7)
	public void LoginHandlesCaseSensitive() {
		my.checkLoginHandlesCaseSensitive();
		String actualMessage = mar.errorMessage.getText();
		String expectedMessage = "ERROR: The password you entered for the username chansereyVatana169@yahoo.com is incorrect. Lost your password?";
		Assert.assertTrue(actualMessage.equals(expectedMessage));
		System.out.println("Username is not case sensitive. Password is case sensitive");
		System.out.println("Log In fail, Test Pass.");
	}

	@Test (priority = 8)
	public void LoginAuthentication() throws InterruptedException {
		my.checkLoginAuthentication();
		String actualMessage = my.messageAfterLogIn.getText();
		String expectedMessage = "Hello chansereyvatana169 (not chansereyvatana169? Sign out)";
		Assert.assertEquals(actualMessage,expectedMessage);
		System.out.println("Log In successful");
		
		my.signOut.click();
		
		Assert.assertTrue( my.logInTitle.isDisplayed());
		Assert.assertTrue( my.logInTitle.isDisplayed());
		System.out.println("Log out successful");
	
		Thread.sleep(2000);
		BaseClass.getDriver().navigate().back();
		Assert.assertTrue( my.logInTitle.isDisplayed());
		Assert.assertTrue( my.logInTitle.isDisplayed());
		System.out.println("User cannot be still log in by just navigate back after sign out");
	}
	
	@AfterClass
	public void tearDown() {
		BaseClass.tearDown();
	}
	
}
