package tola.automationTesting.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class shopPage {
	homePage hP = new homePage();
	MyAccountLoginPage my = new MyAccountLoginPage();
	MyAccountRegistrationPage mar = new MyAccountRegistrationPage();

	public shopPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//*[@id=\"content\"]/nav/a")
	public WebElement homeButton;

}
