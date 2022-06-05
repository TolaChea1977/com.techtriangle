package testingClass_51Cases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Config;

import Utilities.BaseClass;
import tola.automationTesting.pages.MyAccountLoginPage;
import tola.automationTesting.pages.MyAccountRegistrationPage;

public class myAccountRegistrationTests {

MyAccountRegistrationPage mar = new MyAccountRegistrationPage();
	
	@BeforeMethod
	public void setUp() {
		BaseClass.getDriver();
		BaseClass.getDriver().navigate().back();
		BaseClass.getDriver().navigate().forward();
		mar.myAccountMenu.click();
	}
	
	@Test (enabled = false)
	public void registrationSignIn() throws InterruptedException {
		mar.CheckRegistration();
		String actualresult = mar.registerResult.getText();
		System.out.println(actualresult);
		String expectedResult = "Hello chansereyvatana169 (not chansereyvatana169? Sign out)";
		Assert.assertTrue(actualresult.equals(expectedResult));//test successfully registered
	}
	
	@Test (enabled = true)
	public void RegistrationWithInvalidEmailId() throws InterruptedException {
		
		mar.invalidEmailId();
		
	}
	/*
4) Enter invalid Email Address in Email-Address textbox
5) Enter your own password in password textbox
6) Click on Register button
7) Registration must fail with a warning message(ie You must enter a valid email address)
	 * */
	
	
	
	
	
	
	
	
	
	
	@AfterClass
	public void tearDown() {
//		BaseClass.tearDown();
	}
	

	
}
