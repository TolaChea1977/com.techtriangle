package tola.automationTesting.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;
import Utilities.CommonMethods;

public class MyAccountLoginPage extends CommonMethods {
	public  MyAccountLoginPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	
	@FindBy (xpath = "//a[normalize-space()='My Account']")
	public WebElement myAccountMenu;
	@FindBy(id = "")
	public WebElement shopButton;

}
