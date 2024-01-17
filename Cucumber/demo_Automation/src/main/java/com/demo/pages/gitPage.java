package com.demo.pages;

import org.openqa.selenium.WebElement;

import com.demo.automation.framework.TestSession;
import com.demo.automation.framework.pagefactory.MobileWebViewPage;
import com.demo.utils.InitData;
import com.demo.utils.PropFileHandler;

public class gitPage extends MobileWebViewPage{

	public static String platformName = InitData.platformName;

	public gitPage(TestSession session) throws Exception {

		super(session, "Applications/github");

	}

	public boolean verifyActualExpectedUrlIsSame() {
		String actualUrl = PropFileHandler.readProperty("url");
		String expectedUrl = session.driver.getCurrentUrl();
		System.out.println("actual url - > " + actualUrl);
		System.out.println("expected url - > " + expectedUrl);
		boolean res = actualUrl.equalsIgnoreCase(expectedUrl);
		System.out.println("actual and expected urls comparision - > " + res);
		return res;
	}

	public boolean verifySignInElementIsVisible() {
		boolean res = element("signInHomePage").isDisplayed();
		System.out.println("Sign In Element status -> " + res);
		return res;
	}

	public void clickOnSignInOnHomepage() throws InterruptedException {
		WebElement signIn = element("signInHomePage");
		Thread.sleep(3000);
		signIn.click();	
		System.out.println("Sign In button on Homepage has  been clicked");
		Thread.sleep(5000);
	}
	
	
	public boolean verifyActualExpectedUrlIsNotSame() throws InterruptedException {
		String actualUrl = PropFileHandler.readProperty("url");
		String expectedUrl = session.driver.getCurrentUrl();
		System.out.println("actual url - > " + actualUrl);
		System.out.println("expected url - > " + expectedUrl);
		boolean res = actualUrl.equalsIgnoreCase(expectedUrl);
		System.out.println("actual and expected urls comparision - > " + res);
		return res;
	}
	
	public void passDataIntoEmailField() throws InterruptedException {
		Thread.sleep(2000);
		WebElement emailId = element("emailField");
		emailId.sendKeys("Kapindra");;	
		System.out.println("Data entered in Email field");
	}
	
	public void passDataIntoPasswordField() throws InterruptedException {
		Thread.sleep(2000);
		WebElement emailId = element("passwordField");
		emailId.sendKeys("Kapindra");;	
		System.out.println("Data entered in Password field");
	}
	
	public void clickOnSignInOnSignInPage() throws InterruptedException {
		WebElement signIn = element("signInLoginPage");
		Thread.sleep(3000);
		signIn.click();	
		System.out.println("Sign In button on Loginpage has  been clicked");
	}
	
}
