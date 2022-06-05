package tola.automationTesting.pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utilities.BaseClass;
import Utilities.CommonMethods;
import Utilities.Constants;

public class homePage extends CommonMethods {

	public homePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy (xpath = "//*[@id='dismiss-button']/div")
	public WebElement alertBox;

	@FindBy(id = "menu-item-40")
	public WebElement shopButton;

	@FindBy(xpath = "//*[@id='n2-ss-6']/div[1]/div/div/div")
	public List<WebElement> sliders;

	@FindBy(xpath = "//*[@id='themify_builder_content-22']/div[2]/div/div/div/div/div[2]/div")
	public List<WebElement> arrivals;
	
	@FindBy (xpath = "//*[@id='text-22-sub_row_1-0-2-1-0']/div/ul/li/a[1]/img")
	public WebElement thinkingInHTML;
	
	@FindBy (xpath = "//img[@title='Mastering HTML5 Forms']")
	public WebElement masteringHTML5Forms;
	
	@FindBy (xpath = "//button[@type='submit']")
	public WebElement addToBasket;
	
	@FindBy (xpath = "//span[@class='cartcontents']")
	public WebElement itemNum;
	
	@FindBy (xpath = "//input[@title='Qty']")
	public WebElement quantity;
	
	@FindBy(xpath = "//a[normalize-space()='Description']")
	public WebElement descriptionTab;
	
	@FindBy (xpath = "//span[@class='amount']")
	public WebElement price;
	
	@FindBy(xpath = "//*[@id='tab-description']")
	public WebElement descriptionText;
	
	@FindBy (xpath = "//a[normalize-space()='Reviews (0)']")
	public WebElement reviewTab;
	
	@FindBy (xpath = "//div[@id='reviews']")
	public WebElement reviewBox;
	
	@FindBy (xpath = "(//div[@id='comments']")
	public WebElement reviewComments;
	
	@FindBy (xpath = "//form/div/input")
	public WebElement message;
	
	@FindBy (xpath = "//p[@class='stock in-stock']")
	public WebElement quantityInStock;
	
	@FindBy (xpath = "//*[@class=\"quantity\"]/input ")
	public WebElement quanityInput;
	
	@FindBy (xpath = "//a[@class='button wc-forward']")
	public WebElement viewBasket;
	
	@FindBy (xpath = "//td[@class='product-thumbnail']//a")
	public WebElement imageHTMLForm5;
	
	@FindBy (xpath = "//td[@class='product-name']")
	public WebElement productName;
	
	@FindBy (xpath = "//td[@class='product-price']//span[@class='woocommerce-Price-amount amount']")
	public WebElement priceHTMLForm5;
	
	@FindBy (xpath = "//input[@type='number']")
	public WebElement quantityHTMLForm5;
	
	@FindBy (xpath = "(//span[@class='woocommerce-Price-amount amount'])[2]")
	public WebElement totalPriceHTMLForm5;
	
	@FindBy (xpath = "//a[@class='checkout-button button alt wc-forward']")
	public WebElement proceedToCheckout;
	
	@FindBy (xpath = "//*[@id='page-35']/div/div[1]/div[2]/a")
	public WebElement enterCouponCode;
	
	@FindBy (xpath = "//input[@id = 'coupon_code']")
	public WebElement inputCouponCode;
	
	@FindBy (xpath = "//input[@name = 'apply_coupon']")
	public WebElement applyCouponButton;
	
	@FindBy (xpath = "//*[@id='page-35']/div/div[1]/ul/li")
	public WebElement applyCouponText;
	
	@FindBy (xpath = "//*[@id='page-34']/div/div[1]/form/table/tbody/tr[1]/td[1]/a")
	public WebElement removeBook;
	
	@FindBy (xpath = "//div[@class='woocommerce-message']")
	public WebElement afterRemoveMessage;

	@FindBy (xpath = "//input[@name='update_cart']")
	public WebElement updateBasket;
	
	@FindBy (xpath = "//tr[@class='order-total']//th")
	public WebElement totalRow;
	
	@FindBy (xpath = "//*[@id='page-34']/div/div[1]/div/div/table/tbody/tr[3]/td/strong/span")
	public WebElement totalPrice;
	
	@FindBy (xpath ="//td[@data-title='Subtotal']//span[@class='woocommerce-Price-amount amount']")
	public WebElement subTotalPrice;
	
	@FindBy (xpath = "//a[@class='checkout-button button alt wc-forward']") 
	public WebElement checkoutButton;
	
	//Checkout information
	
	@FindBy (xpath = "//input[@id='billing_first_name']")
	public WebElement firstName;
	
	@FindBy (xpath = "//input[@id='billing_last_name']")
	public WebElement lastName;
	
	@FindBy (xpath = "//input[@id='billing_company']")
	public WebElement companyName;
	
	@FindBy (xpath = "//input[@id='billing_email']")
	public WebElement emailAddress;
	
	@FindBy (xpath = "//input[@id='billing_phone']")
	public WebElement phone;
	
	@FindBy (xpath = "")
	public WebElement country;
	
	@FindBy (xpath = "//input[@id='billing_address_1']")
	public WebElement address;
			
	@FindBy (xpath = "//input[@id='billing_address_2']")
	public WebElement apartment;
	
	@FindBy (xpath = "//input[@id='billing_city']")
	public WebElement townCity;
	
	@FindBy (xpath = "//span[@id='select2-chosen-2']")
	public WebElement stateClick;
	
	@FindBy (xpath = "//input[@id='s2id_autogen2_search']")
	public WebElement stateSendKeys;
	
	@FindBy (xpath = "//input[@id='billing_postcode']")
	public WebElement zip;
	
	@FindBy (xpath = "//input[@id='createaccount']")
	public WebElement createAccountButton;
	
	@FindBy (xpath = "//*[@id='account_password']")
	public WebElement password;
	
	@FindBy (xpath = "//input[@id='payment_method_bacs']")
	public WebElement directBankTransferButton;
	
	@FindBy (xpath = "//input[@id='payment_method_cheque']")
	public WebElement check;
	
	@FindBy (xpath = "//input[@id='payment_method_cod']")
	public WebElement cash;
	
	@FindBy (xpath = "//input[@id='payment_method_ppec_paypal']")
	public WebElement payPal;
	
	@FindBy (xpath = "//input[@id='place_order']")
	public WebElement placeOrderButton;
	
	//Coupon Info
	@FindBy (xpath = "//a[@class='showcoupon']")
	public WebElement applyCoupon;
	
	@FindBy (xpath = "//input[@id='coupon_code']")
	public WebElement counponCode;
	
	@FindBy (xpath = "//input[@name='apply_coupon']")
	public WebElement applyButton;
	
	@FindBy (xpath = "//p[@class='woocommerce-thankyou-order-received']")
	public WebElement orderReceived;
	
	@FindBy (xpath = "//li[@class='order']")
	public WebElement orderNumber;
	
	@FindBy (xpath = "//li[@class='date']")
	public WebElement orderDate;
	
	@FindBy (xpath = "//li[@class='total']")
	public WebElement total;
	
	@FindBy (xpath = "//li[@class='method']")
	public WebElement paymentMethod;
	
	
	
	
	
	public void handlepopupwindow () {
		// store window handles in Set
	      Set<String> wnd = BaseClass.getDriver().getWindowHandles();
	      // window handles iteration
	      Iterator<String> i = wnd.iterator();
	      String prntw = i.next();
	      String popwnd = i.next();
	      // switching pop up window handle id
	      BaseClass.getDriver().switchTo().window(popwnd);
	      System.out.println("Page title of popup: "+ BaseClass.getDriver().getTitle());
	      // closes pop up window
	      BaseClass.getDriver().close();
	      // switching parent window handle id
	      BaseClass.getDriver().switchTo().window(prntw);
	}

	public void checkSlidersCount(int count) {
		Assert.assertEquals(count, sliders.size());
	}

	public void checkArrivalsCount(int count) {
		Assert.assertEquals(count, arrivals.size());
	}

	public void verifyImagesInArrivalsShouldNavigate() {
		
        String[] expectedTexts = new String[]{"Selenium Ruby", "Thinking in HTML", "Mastering JavaScript"};
        for(int i = 0; i<arrivals.size(); i++) {
            String pathText = String.format("//div[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']/div[%d]", i+1);
            // System.out.println(pathText);
            BaseClass.getDriver().findElement(By.xpath(pathText)).click();
            String text = BaseClass.getDriver().findElement(By.xpath("//*[@class='product_title entry-title']")).getText();
            //  System.out.println(text);
            Assert.assertTrue(expectedTexts[i].equals(text)) ;                    
            BaseClass.getDriver().navigate().back();            
        }
	}

	public void verifyImagesInArrivalsShouldNavigate_URL() {
		String url1 = "http://practice.automationtesting.in/product/selenium-ruby/";
		String url2 = "http://practice.automationtesting.in/product/thinking-in-html/";
		String url3 = "http://practice.automationtesting.in/product/mastering-javascript/";
		List<String> urls = new ArrayList<String>();
		urls.add(url1);
		urls.add(url2);
		urls.add(url3);

		for (int i = 0; i < arrivals.size(); i++) {
			WebElement eachItem = arrivals.get(i);
			eachItem.click();
			Assert.assertTrue(BaseClass.getDriver().getCurrentUrl().equalsIgnoreCase(urls.get(i)));
			BaseClass.getDriver().navigate().back();
		}
	}
	
	public void VerifyAddItemBox() {
		thinkingInHTML.click();
		masteringHTML5Forms.click();
		addToBasket.click();
		System.out.println(itemNum.getText());
		System.out.println(price.getText());
		Assert.assertTrue(addToBasket.isDisplayed());
		Assert.assertTrue(addToBasket.isEnabled());
		Assert.assertTrue(itemNum.isDisplayed());
		Assert.assertTrue(price.isDisplayed());
	}
	
	public void verifyProductDescriptionDisplay() {
		String url1 = "http://practice.automationtesting.in/product/selenium-ruby/";
		String url2 = "http://practice.automationtesting.in/product/thinking-in-html/";
		String url3 = "http://practice.automationtesting.in/product/mastering-javascript/";
		List<String> urls = new ArrayList<String>();
		urls.add(url1);
		urls.add(url2);
		urls.add(url3);

		for (int i = 0; i < arrivals.size(); i++) {
			WebElement eachItem = arrivals.get(i);
			eachItem.click();
			descriptionTab.click();
			System.out.println(descriptionText.getText());
			Assert.assertTrue(descriptionText.isDisplayed());
			BaseClass.getDriver().navigate().back();
		}
	}
	
	public void verifyProductReviewDisplay() {
		String url1 = "http://practice.automationtesting.in/product/selenium-ruby/";
		String url2 = "http://practice.automationtesting.in/product/thinking-in-html/";
		String url3 = "http://practice.automationtesting.in/product/mastering-javascript/";
		List<String> urls = new ArrayList<String>();
		urls.add(url1);
		urls.add(url2);
		urls.add(url3);

		for (int i = 0; i < arrivals.size(); i++) {
			WebElement eachItem = arrivals.get(i);
			eachItem.click();
			reviewTab.click();
			System.out.println(reviewComments.getText());
			Assert.assertTrue(reviewBox.isDisplayed());
			BaseClass.getDriver().navigate().back();
		}
		
	}
	
	public void VerifyAddHTML5FormBook(String quantityAdd) {
		
		thinkingInHTML.click();
		masteringHTML5Forms.click();
		quantity.clear();
		quantity.sendKeys(quantityAdd);
		addToBasket.click();
		System.out.println(itemNum.getText());
		System.out.println(price.getText());
		Assert.assertTrue(addToBasket.isEnabled());
		Assert.assertTrue(itemNum.isDisplayed());
		Assert.assertTrue(price.isDisplayed());
		
		String inStock = quanityInput.getAttribute("Max");
		JavascriptExecutor js = (JavascriptExecutor) BaseClass.getDriver();
		String validationMessage = (String)js.executeScript("return arguments[0].validationMessage;", message);
		System.out.println(validationMessage);
		String alertMessage = String.format("Value must be less than or equal to %d.", Integer.valueOf(inStock));;
		System.out.println(alertMessage);
		Assert.assertTrue(validationMessage.equals(alertMessage));
		
	}
	
public void VerifyAddHTML5FormToBasketAndProceedCheckout(String quantityAdd) throws InterruptedException {
		
		thinkingInHTML.click();
		masteringHTML5Forms.click();
		quantity.clear();
		quantity.sendKeys(quantityAdd);
		addToBasket.click();
		viewBasket.click();
	
		System.out.println(productName.getText());
		Thread.sleep(3000);
		System.out.println(priceHTMLForm5.getText());
		System.out.println(quantityHTMLForm5.getText());
		System.out.println(totalPriceHTMLForm5.getText());
		Assert.assertTrue(imageHTMLForm5.isDisplayed());
		Assert.assertTrue(productName.isDisplayed());
		Assert.assertTrue(priceHTMLForm5.isDisplayed());
		Assert.assertTrue(quantityHTMLForm5.isDisplayed());
		Assert.assertTrue(totalPriceHTMLForm5.isDisplayed());
		Thread.sleep(3000);
		proceedToCheckout.click();
		String url = BaseClass.getDriver().getCurrentUrl();
		System.out.println(url);
		String currentTitle = BaseClass.getDriver().getTitle();
		System.out.println(currentTitle);
		Assert.assertTrue(currentTitle.equalsIgnoreCase("Checkout – Automation Practice Site"));
		
}

public void checkEnteringCouponCode(String quantityAdd) throws InterruptedException {
	thinkingInHTML.click();
	masteringHTML5Forms.click();
	quantity.clear();
	quantity.sendKeys(quantityAdd);
	addToBasket.click();
	viewBasket.click();

	System.out.println(productName.getText());
	Thread.sleep(3000);
	System.out.println(priceHTMLForm5.getText());
	System.out.println(quantityHTMLForm5.getText());
	System.out.println(totalPriceHTMLForm5.getText());
	Assert.assertTrue(imageHTMLForm5.isDisplayed());
	Assert.assertTrue(productName.isDisplayed());
	Assert.assertTrue(priceHTMLForm5.isDisplayed());
	Assert.assertTrue(quantityHTMLForm5.isDisplayed());
	Assert.assertTrue(totalPriceHTMLForm5.isDisplayed());
	Thread.sleep(6000);
	proceedToCheckout.click();
	String currentTitle = BaseClass.getDriver().getTitle();
	System.out.println(currentTitle);
	Assert.assertTrue(currentTitle.equalsIgnoreCase("Checkout – Automation Practice Site"));
	enterCouponCode.click();
	inputCouponCode.sendKeys(BaseClass.getProperty("couponCode"));
	applyCouponButton.click();
}

public void removeBookTest(String quantityAdd) throws InterruptedException {
	thinkingInHTML.click();
	masteringHTML5Forms.click();
	quantity.clear();
	quantity.sendKeys(quantityAdd);
	addToBasket.click();
	viewBasket.click();
	removeBook.click();
	String removeResult = afterRemoveMessage.getText();
	System.out.println(removeResult);
}

public void addOrRemoveBookTest(String quantityAdd) throws InterruptedException {
	thinkingInHTML.click();
	masteringHTML5Forms.click();
	quantity.clear();
	quantity.sendKeys(quantityAdd);
	addToBasket.click();
	viewBasket.click();
	quantityHTMLForm5.sendKeys(Keys.ARROW_UP);
	Thread.sleep(3000);
	quantityHTMLForm5.sendKeys(Keys.ARROW_DOWN);
	updateBasket.click();
}
public void finalPriceViewAfterCheckout(String quantityAdd) throws InterruptedException {
	
	thinkingInHTML.click();
	masteringHTML5Forms.click();
	quantity.clear();
	quantity.sendKeys(quantityAdd);
	addToBasket.click();
	viewBasket.click();
//	Thread.sleep(5000);
}

public void checkoutPriceTotalSubTotal(){
	
	try {
		String totalPriceStr = totalPrice.getText().substring(2);
		String subTotalPriceStr = subTotalPrice.getText().substring(2);
		Assert.assertTrue(Double.valueOf(totalPriceStr) > Double.valueOf(subTotalPriceStr));
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
}
	
public void proceedCheckout() throws InterruptedException {
	checkoutButton.click();
	//apply coupon
	applyCoupon.click();
	counponCode.sendKeys(BaseClass.getProperty("couponCode"));
	applyButton.click();
	
	//billing info
	
	firstName.sendKeys(BaseClass.getProperty("firstName"));
	lastName.sendKeys(BaseClass.getProperty("lastName"));
	companyName.sendKeys(BaseClass.getProperty("company"));
	emailAddress.sendKeys(BaseClass.getProperty("email"));
	phone.sendKeys(BaseClass.getProperty("phone"));
	address.sendKeys(BaseClass.getProperty("address"));
	apartment.sendKeys(BaseClass.getProperty("apartment"));
	townCity.sendKeys(BaseClass.getProperty("city"));
	stateClick.click();
	stateSendKeys.sendKeys(BaseClass.getProperty("state"), Keys.ENTER);
	zip.sendKeys(BaseClass.getProperty("ZIP"));
	Thread.sleep(3000);
//	createAccountButton.click();	
//	password.sendKeys(BaseClass.getProperty("password"));
	directBankTransferButton.click();
	check.click();
	cash.click();
	payPal.click();//as using PayPal the system show errors
	directBankTransferButton.click();
	placeOrderButton.click();
}
	

}


