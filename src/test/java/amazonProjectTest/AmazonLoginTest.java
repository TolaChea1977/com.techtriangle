package amazonProjectTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazonUtilities.BaseClass;

public class AmazonLoginTest {
	
	@BeforeMethod
	public void setUp(){
		BaseClass.getDriver();
//		Thread.sleep(2000);
		
	}
	
	@Test (enabled = true)
	public void test() {
		System.out.println("Test");
	}
	
	
	
	
	
	
	public void afterClass() {
		//BaseClass.getDriver().close();
	}
}
