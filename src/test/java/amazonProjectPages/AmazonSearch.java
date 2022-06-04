package amazonProjectPages;

import org.openqa.selenium.support.PageFactory;

import amazonUtilities.BaseClass;

public class AmazonSearch {
	public AmazonSearch() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

}
