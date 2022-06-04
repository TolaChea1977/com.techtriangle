package amazonProjectPages;

import org.openqa.selenium.support.PageFactory;

import amazonUtilities.BaseClass;



public class AmazonLogin {
	
	public AmazonLogin() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

}
