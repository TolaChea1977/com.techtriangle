package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommonMethods {

	/*
	 *Method that clear and sends key
	 * By: 
	 * 
	 * 
	 * */
	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}
	
	/*
	 * Method checks if radio / check box is enabled and clicked
	 * 
	 * By
	 * */
	public static void clickRadioOrCheckbox(List <WebElement> radioOrCheckbox, String value) {
		String actualValue;
		for (WebElement el:radioOrCheckbox) {
			actualValue = el.getAttribute("value").trim();
			if(el.isEnabled()&& actualValue.equals(value)) {
				el.click();
				break;
			}
		}	
	}
	
	//SELECT DROPDOWN VALUE
	public static void selectDdText(WebElement element, String textToSelect) {
		try {
			Select select = new Select(element);

			List<WebElement> options = select.getOptions();

			for (WebElement el : options) {
				if (el.getText().equals(textToSelect)) {
					select.selectByVisibleText(textToSelect);
					break;
				}
			}

		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}

	//SELECT VALUE INDEX
	public static void selectDdIndex(WebElement element, int index) {
		try {
			Select select = new Select(element);
			int size = select.getOptions().size();
			if (size > index) {
				select.selectByIndex(index);
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Methods that accept alerts and catches exception if alert is not present
	 */
	public static void acceptAlert() {
		try {
			Alert alert = BaseClass.getDriver().switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
			}
	}

	/**
	 * Methods that dismiss alerts and catches exception if alert is not present
	 */
	public static void dismissAlert() {
		try {
			Alert alert = BaseClass.getDriver().switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Methods that gets text of alert and catches exception if alert is not present
	 * 
	 * @return String alert text
	 */
	public static String getAlertText() {
		String alertText = null;
		try {
			Alert alert = BaseClass.getDriver().switchTo().alert();
			alertText = alert.getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return alertText;
	}

	/**
	 * Methods that sends text to alert and catches exception if alert is not
	 * present
	 * 
	 */
	public static void sendAlertText(String text) {
		try {
			Alert alert = BaseClass.getDriver().switchTo().alert();
			alert.sendKeys(text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}
	
	//Dealing with Iframe
		public static void switchToFrame(String nameOrId) {
			try {
				BaseClass.getDriver().switchTo().frame(nameOrId);
			} catch (NoSuchFrameException e) {
				e.printStackTrace();
			}
		}
		
		public static void switchToFrame(WebElement element) {
			try {
				BaseClass.getDriver().switchTo().frame(element);
			} catch (NoSuchFrameException e) {
				e.printStackTrace();
			}
		}
		
		public static void switchToFrame(int index) {
			try {
				BaseClass.getDriver().switchTo().frame(index);
			} catch (NoSuchFrameException e) {
				e.printStackTrace();
			}
		}
		
		/**
		 * Method switches focus to child window
		 */
		public static void switchToChildWindow() {
			String mainWindow = BaseClass.getDriver().getWindowHandle();
			Set<String> windows = BaseClass.getDriver().getWindowHandles();
			for (String window : windows) {
				if (!window.equals(mainWindow)) {
					BaseClass.getDriver().switchTo().window(window);
					break;
				}
			}
		}
		
		//WAIT METHODS
		
		public static WebDriverWait getWaitObject() {
			WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(),Constants.explicitWaitTime);
			return wait;
		}
		
		public static WebElement waitForClickability(WebElement element) {
			return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
		}
		
		public static WebElement waitForVisibility(WebElement element) {
			return getWaitObject().until(ExpectedConditions.visibilityOf(element));
		}
		
		//CLICK METHOD
		public static void click(WebElement element) {
			waitForClickability(element);
			element.click();
		}
		
		//JS EXECUTER
		public static JavascriptExecutor getJSObject() {
			JavascriptExecutor js = (JavascriptExecutor) BaseClass.getDriver();
			return js;
		}

		public static void jsClick(WebElement element) {
			getJSObject().executeScript("arguments[0].click();", element);
		}

		public static void scrollToElement(WebElement element) {
			getJSObject().executeScript("arguments[0].scrollIntoView(true);", element);
		}
		
		//SCROLL USING PIXEL
		/**
		 * Method that will scroll the page down based on the passed pixel parameters
		 * 
		 * @param pixel
		 */
		public static void scrollByPixel(int pixel) {
			//scroll down positive 
			//scroll up negative
			getJSObject().executeScript("window.scrollBy(0," + pixel + ")");
		}

		/**
		 * This Method will take a screenshot
		 * 
		 * @param filename
		 */
		public static String getTimeStemp() {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
			return sdf.format(date.getTime());
		}

		public static byte[] takeScreenshot(String filename) {
			TakesScreenshot ts = (TakesScreenshot) BaseClass.getDriver();
			byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);
			File file = ts.getScreenshotAs(OutputType.FILE);
			String destinationFile = Constants.SCREENSHOT_FILEPATH+ getTimeStemp() + ".png";
			try {
				FileUtils.copyFile(file, new File(destinationFile));
			} catch (Exception ex) {
				System.out.println("Cannot take screenshot!");
			}

			return picBytes;
		}
		

		/**
		 * this method will select a date from the calendar
		 * 
		 * @param element
		 * @param text
		 */
		public static void selectCalendarDate(List<WebElement> element, String text) {
			for (WebElement pickDate : element) {
				if (pickDate.isEnabled()) {
					if (pickDate.getText().equals(text)) {
						pickDate.click();
						break;
					}
				}
			}
		}
		
		//HOVER
		
		public static void hover(WebElement element) {
			Actions actions = new Actions(BaseClass.getDriver());
			actions.moveToElement(element).perform();
		}
		
		//DRAGANDDROP METHOD
		public static void dragAndDrop(WebElement source, WebElement target) {
			Actions actions = new Actions(BaseClass.getDriver());
			actions.dragAndDrop(source, target).perform();
		}
		
		//DOUBLE CLICK
		public static void doubleClick(WebElement source) {
			Actions actions = new Actions(BaseClass.getDriver());
			actions.doubleClick(source).perform();
		}
}