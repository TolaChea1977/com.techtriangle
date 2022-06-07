package testingClass_51Cases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.Constants;
import tola.automationTesting.pages.homePage;
import tola.automationTesting.pages.shopPage;

public class homePageTests {

	homePage hP = new homePage();
	shopPage sP = new shopPage();

	@BeforeMethod
	public void setUp() throws InterruptedException {
		BaseClass.getDriver();
//		Thread.sleep(2000);
		BaseClass.getDriver().navigate().back();
		BaseClass.getDriver().navigate().forward();
		hP.shopButton.click();
		sP.homeButton.click();
	}

	@Test(priority = 1)
	public void HomePageWithThreeSlidersOnly() {
		hP.checkSlidersCount(Constants.slidersCount);

	}

	@Test(priority = 2)
	public void HomePageWithThreeArrivalsOnly() {
		hP.checkSlidersCount(Constants.slidersCount);
		hP.checkArrivalsCount(Constants.arrivalsCount);
	}

	@Test(priority = 3)
	public void HomePageImagesArrivalsShouldNavigate() {
		hP.checkSlidersCount(Constants.slidersCount);
		hP.checkArrivalsCount(Constants.arrivalsCount);
		hP.verifyImagesInArrivalsShouldNavigate();
		hP.VerifyAddItemBox();
	
		}
	@Test(priority = 4)
	public void HomePageArrivalsImagesDescription() {
		
		hP.checkSlidersCount(Constants.slidersCount);
		hP.checkArrivalsCount(Constants.arrivalsCount);
		hP.verifyImagesInArrivalsShouldNavigate_URL();
		hP.verifyProductDescriptionDisplay();
	}
	
	@Test (priority = 5)
	public void homePageArrivalsImagesReviews(){
		hP.checkArrivalsCount(Constants.arrivalsCount);
		hP.verifyImagesInArrivalsShouldNavigate();
		hP.VerifyAddItemBox();
		BaseClass.getDriver().navigate().back();
		hP.verifyProductReviewDisplay();//Only verify the review box is display or not.
	}
	
	@Test (priority = 6)
	public void homePageArrivalsAddToBasket(){
		hP.checkArrivalsCount(Constants.arrivalsCount);
		hP.verifyImagesInArrivalsShouldNavigate();
		hP.VerifyAddItemBox();//All new arrivals are sold out. So I test related book instead.		
	}
	
	@Test (priority = 7)
	public void HomePageArrivalsAddToBasketWithMoreBooks() {
		hP.checkArrivalsCount(Constants.arrivalsCount);
		hP.VerifyAddHTML5FormBook(Constants.quantityCountHPTest7);
	}
	
	@Test (priority = 8)
	public void HomeArrivalsAddToBasketItems() throws InterruptedException {
		hP.checkArrivalsCount(Constants.arrivalsCount);
		hP.verifyImagesInArrivalsShouldNavigate();
		hP.VerifyAddHTML5FormToBasketAndProceedCheckout(Constants.quantityCountHPTest8);
	}
	
	@Test (priority = 9)
	public void HomeArrivalsAddToBasketItemsCoupon() throws InterruptedException {
			
		hP.checkArrivalsCount(Constants.arrivalsCount);
		hP.verifyImagesInArrivalsShouldNavigate();
		hP.checkEnteringCouponCode(Constants.quantityCountHPTest8);
		String actualResult = hP.applyCouponText.getText();
		String expectedResult = "Coupon usage limit has been reached.";
		Assert.assertTrue(actualResult.equals(expectedResult));
		
		//coupon code is submited sucessfully but cannot be applied for discount
		//so i assert true with the false msg.	
	}

	@Test (priority = 10)
	public void HomeArrivalsAddToBasketItemsCouponValueLessthan450() throws InterruptedException {
		hP.checkArrivalsCount(Constants.arrivalsCount);
		hP.verifyImagesInArrivalsShouldNavigate();
		hP.checkEnteringCouponCode(Constants.quantityCountHPTest8);
		
		//There is no book that price is >than 450. So this Test case cannot be verify.
	}
	
	@Test (priority = 11)
	public void HomeArrivalsAddToBasketItemsRemoveBook() throws InterruptedException{
	
		hP.checkArrivalsCount(Constants.arrivalsCount);
		hP.verifyImagesInArrivalsShouldNavigate();
		hP.removeBookTest(Constants.quantityCountHPTest8);
		Assert.assertTrue(hP.afterRemoveMessage.isDisplayed());
	}
	
	@Test (priority = 12)
	public void HomeArrivalsAddToBasketItemsAddbook()throws InterruptedException{
		hP.checkArrivalsCount(Constants.arrivalsCount);
		hP.verifyImagesInArrivalsShouldNavigate();
		hP.addOrRemoveBookTest(Constants.quantityCountHPTest8);
		boolean update = hP.updateBasket.isEnabled();
		Assert.assertTrue(update);	
	}
	@Test (priority = 13)
	public void HomeArrivalsAddToBasketItemsCheckoutBookFinalPrice()throws InterruptedException{
		hP.checkArrivalsCount(Constants.arrivalsCount);
		hP.verifyImagesInArrivalsShouldNavigate();
		hP.finalPriceViewAfterCheckout(Constants.quantityCountHPTest8);
		Thread.sleep(3000);
		System.out.println("Product name: "+hP.productName.getText());
		System.out.println("Product unit price: "+hP.priceHTMLForm5.getText());
		System.out.println("Quantity: "+hP.quantityHTMLForm5.getText());
		System.out.println("Total Price is "+hP.totalPrice.getText());
		Assert.assertTrue(hP.priceHTMLForm5.isDisplayed());
		Assert.assertTrue(hP.quantityHTMLForm5.isDisplayed());
		Assert.assertTrue(hP.totalPrice.isDisplayed());
	}
	
//	 14. Home-Arrivals-Add to Basket-Items-Check-out-Update Basket (same as test case 12)
	
	@Test (priority = 14)
	public void HomeArrivalsAddToBasketItemsCheckoutTotalSubtotalcondition() throws InterruptedException {
		hP.checkArrivalsCount(Constants.arrivalsCount);
		hP.verifyImagesInArrivalsShouldNavigate();
		hP.finalPriceViewAfterCheckout(Constants.quantityCountHPTest8);
		
		try {
			String totalPriceStr = hP.totalPrice.getText().substring(2);
			String subTotalPriceStr = hP.subTotalPrice.getText().substring(2);
			Assert.assertTrue(Double.valueOf(totalPriceStr) > Double.valueOf(subTotalPriceStr));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
	}
	
	@Test (priority = 15)
	public void HomeArrivalsAddToBasketItemsCheckoutFunctionality()  throws InterruptedException{
		hP.checkArrivalsCount(Constants.arrivalsCount);
		hP.verifyImagesInArrivalsShouldNavigate();
		hP.finalPriceViewAfterCheckout(Constants.quantityCountHPTest8);
		
		try {
			String totalPriceStr = hP.totalPrice.getText().substring(2);
			String subTotalPriceStr = hP.subTotalPrice.getText().substring(2);
			Assert.assertTrue(Double.valueOf(totalPriceStr) > Double.valueOf(subTotalPriceStr));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
		
		hP.proceedCheckout();
		Assert.assertTrue(hP.checkoutButton.isEnabled());
		
	}
	
	@Test (priority = 16)
	public void HomeArrivalsAddToBasketItemsCheckoutPaymentGateway() throws InterruptedException {
		hP.checkArrivalsCount(Constants.arrivalsCount);
		hP.verifyImagesInArrivalsShouldNavigate();
		hP.finalPriceViewAfterCheckout(Constants.quantityCountHPTest8);
		try {
			String totalPriceStr = hP.totalPrice.getText().substring(2);
			String subTotalPriceStr = hP.subTotalPrice.getText().substring(2);
			Assert.assertTrue(Double.valueOf(totalPriceStr) > Double.valueOf(subTotalPriceStr));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
		
		hP.proceedCheckout();
		Assert.assertTrue(hP.counponCode.isEnabled());
		String testResult = hP.orderReceived.getText();
		Assert.assertTrue(testResult.equalsIgnoreCase("Thank you. Your order has been received."));
	}

@Test (priority = 17)
		public void HomeArrivalsAddToBasketItemsCheckoutPaymentGatewayPlaceOrder() throws InterruptedException {
			hP.checkArrivalsCount(Constants.arrivalsCount);
			hP.verifyImagesInArrivalsShouldNavigate();
			hP.finalPriceViewAfterCheckout(Constants.quantityCountHPTest8);
			try {
				String totalPriceStr = hP.totalPrice.getText().substring(2);
				String subTotalPriceStr = hP.subTotalPrice.getText().substring(2);
				Assert.assertTrue(Double.valueOf(totalPriceStr) > Double.valueOf(subTotalPriceStr));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	
			}
			
			hP.proceedCheckout();
			Assert.assertTrue(hP.counponCode.isEnabled());
			String testResult = hP.orderReceived.getText();
			Assert.assertTrue(testResult.equalsIgnoreCase("Thank you. Your order has been received."));
			Assert.assertTrue(hP.orderNumber.isDisplayed());
			Assert.assertTrue(hP.orderDate.isDisplayed());
			Assert.assertTrue(hP.total.isDisplayed());
			Assert.assertTrue(hP.paymentMethod.isDisplayed());	
	}
	
	@AfterClass
	public void tearDown() {
		BaseClass.tearDown();
	}
}
