package amazonProjectTest;

import org.testng.annotations.BeforeMethod;

import amazonUtilities.BaseClass;

public class AmazonSearchTest {
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		BaseClass.getDriver();
//		Thread.sleep(2000);
		BaseClass.getDriver().navigate().back();
		BaseClass.getDriver().navigate().forward();
	}

}
