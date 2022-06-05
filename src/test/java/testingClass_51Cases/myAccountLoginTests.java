package testingClass_51Cases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import tola.automationTesting.pages.MyAccountLoginPage;

public class myAccountLoginTests {
	
	MyAccountLoginPage my = new MyAccountLoginPage();
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		BaseClass.getDriver();
		Thread.sleep(2000);
		my.myAccountMenu.click();
		
	}
	
	@Test (enabled = true)
	public void loginWithUserNameAndPassword() {
		

		/*
		4) Enter registered username in username textbox
		5) Enter password in password textbox
		6) Click on login button
		7) User must successfully login to the web page
		 * */
		
	}
	
	
	/* 1. Log-in with valid username and password.
 2. Log-in with incorrect username and incorrect password.
 3. Log-in with correct username and empty password.
 4. Log-in with empty username and valid password.
 5. Log-in with empty username and empty password.
 6. Log-in -Password should be masked
 7. Login-Handles case sensitive
 8. Login-Authentication

	 * */

}
