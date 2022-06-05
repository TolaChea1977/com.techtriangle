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
	public void setUp() throws InterruptedException {
		BaseClass.getDriver();
		Thread.sleep(2000);
		BaseClass.getDriver().navigate().back();
		BaseClass.getDriver().navigate().forward();
		mar.myAccountMenu.click();
	}
	@Test (enabled = true)
	public void registrationSignIn() {
		mar.CheckRegistration();
		Assert.assertTrue(mar.registerButton.isEnabled());
	}
	
	/*1) Open the browser
2) Enter the URL “http://practice.automationtesting.in/”
3) Click on My Account Menu
4) Enter registered Email Address in Email-Address textbox
5) Enter your own password in password textbox
6) Click on Register button
7) User will be registered successfully and will be navigated to the Home page
	 * */
	
	
	
	
	
	
	
	
	
	
	@AfterClass
	public void tearDown() {
//		BaseClass.tearDown();
	}
	

	
}
