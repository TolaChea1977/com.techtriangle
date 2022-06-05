package testingClass_51Cases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.github.dockerjava.api.model.Config;
import Utilities.BaseClass;
import Utilities.CommonMethods;
import tola.automationTesting.pages.MyAccountLoginPage;
import tola.automationTesting.pages.MyAccountRegistrationPage;

public class myAccountRegistrationTests extends CommonMethods{

MyAccountRegistrationPage mar = new MyAccountRegistrationPage();
	
	@BeforeMethod
	public void setUp() {
		BaseClass.getDriver();
		BaseClass.getDriver().navigate().back();
		BaseClass.getDriver().navigate().forward();
		mar.myAccountMenu.click();
	}
	
	@Test (priority = 1)
	public void registrationSignIn() throws InterruptedException {
		mar.checkRegistration();
		String actualresult = mar.registerResult.getText();
		System.out.println(actualresult);
		String expectedResult = "Hello chansereyvatana169 (not chansereyvatana169? Sign out)";
		Assert.assertTrue(actualresult.equals(expectedResult));//test successfully registered
	}
	
	@Test (priority = 2)
	public void RegistrationWithInvalidEmailId() throws InterruptedException {
		mar.checkRegistrationInvalidEmailId();
		waitForVisibility(mar.errorMessage);
		String actualMessage = mar.errorMessage.getText();
		String expectedMessage = "Error: An account is already registered with your email address. Please login.";
		Assert.assertEquals(actualMessage,expectedMessage);
		System.out.println("Resgister is fail "+actualMessage);	
	}
	
	@Test (priority = 3)
	public void RegistrationWithEmptyEmailId() throws InterruptedException{
		mar.checkRegistrationEmptyEmailId();
		waitForVisibility(mar.errorMessage);
		String actualMessage = mar.errorMessage.getText();
		String expectedMessage = "Error: Please provide a valid email address.";
		Assert.assertEquals(actualMessage,expectedMessage);
		System.out.println("Resgister is fail "+actualMessage);	
	}
	
	@Test (priority = 4)
	public void RegistrationWithEmptyPassword() throws InterruptedException {
		mar.checkRegistrationEmptyPassword();
		String actualMessage = mar.errorMessage.getText();
		String expectedMessage = "Error: Please enter an account password.";
		Assert.assertEquals(actualMessage,expectedMessage);
		System.out.println("Resgister is fail "+actualMessage);
	}
	
	@Test (priority = 5)
		public void RegistrationWithEmptyEmailIdAndPassword() throws InterruptedException {
		mar.checkRegistrationWithEmptyEmailAndPassword();
		String actualMessage = mar.errorMessage.getText();
		String expectedMessage = "Error: Please provide a valid email address.";
		Assert.assertEquals(actualMessage,expectedMessage);
		System.out.println("Resgister is fail "+actualMessage);
		}

	@AfterClass
	public void tearDown() {
		BaseClass.tearDown();
	}
}
