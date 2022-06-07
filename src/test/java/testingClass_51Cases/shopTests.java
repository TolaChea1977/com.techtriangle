package testingClass_51Cases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import tola.automationTesting.pages.MyAccountLoginPage;
import tola.automationTesting.pages.MyAccountRegistrationPage;
import tola.automationTesting.pages.homePage;
import tola.automationTesting.pages.shopPage;

public class shopTests {
	
	homePage hP = new homePage();
	MyAccountLoginPage my = new MyAccountLoginPage();
	MyAccountRegistrationPage mar = new MyAccountRegistrationPage();
	shopPage sP = new shopPage();
	
	@BeforeMethod
	public void setUp() {
		BaseClass.getDriver();
		hP.shopButton.click();
		
	}
	@Test
	public void ShopFilterByPriceFunctionality() {
		
	}
	

	
	
	
	/*1. Shop-Filter By Price Functionality
2. Shop-Product Categories Functionality
3. Shop-Default Sorting Functionality
4. Shop-Default Sorting Functionality
5. Shop-Default Sorting Functionality
6. Shop-Default Sorting Functionality
7. Shop-Default Sorting Functionality
8. Shop-Read More Functionality
9. Shop-Sale Functionality
10. Shop-Add to Basket-View Basket Functionality
11.Shop-Add to Basket-View Basket through Item link
12. Shop-Add to Basket-View Basket-Tax Functionality
	 * */
}
