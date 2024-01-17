package com.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.demo.automation.framework.TestSession;
import com.demo.automation.framework.pagefactory.MobileWebViewPage;
import com.demo.stepdefinitions.GoogleUserSteps;
import com.demo.utils.InitData;
import com.demo.utils.PropFileHandler;

import cucumber.api.java.en.When;

public class googleUserCreationPage extends MobileWebViewPage{
	
	public static String platformName = InitData.platformName;
	public googleUserCreationPage(TestSession session) throws Exception {
		super(session, "Applications/googleUserCreation");
	}
	
	public void iClickOnSignInButton()throws InterruptedException {
		WebElement signIn = element("signInButton");
		signIn.click();
		Thread.sleep(1500);
	}
	
	public void iClickOnCreateAccount() {
		WebElement createAccount = element("createAccount");
		createAccount.click();
	}
	
	public void iClickOnMyPersonalUse() throws InterruptedException {
		WebElement personalUse = element("personalUse");
		personalUse.click();
		Thread.sleep(1500);
		
	}

	public void iPassDataInFirstName(String name) throws InterruptedException {
		WebElement firstName = element("firstName");
		firstName.sendKeys(name);
		Thread.sleep(1500);
	}
	
	public void iPassDataInLastName(String name) throws InterruptedException {
		WebElement lastName = element("lastName");
		lastName.sendKeys(name);
		Thread.sleep(1500);
	}

	public void iClickOnNextButton() throws InterruptedException {
		WebElement nextButton = element("nameButton");
		nextButton.click();
		Thread.sleep(1500);		
	}
	
	public void iSelectAnyMonthOfYourChoice() throws InterruptedException {
		Thread.sleep(1500);	
		Select s = new Select(element("month"));
		s.selectByValue("6");
		System.out.println("selected Month" + s);
	}
	
	public void iPassDataInDayField(String name) {
		WebElement nextButton = element("day");
		nextButton.sendKeys(name);
	}
	
	public void iPassDataInYearField(String name) {
		WebElement nextButton = element("year");
		nextButton.sendKeys(name);
	}

	public void iSelectAnyGenderOfYourChoice() throws InterruptedException {
		Thread.sleep(1500);	
		Select g = new Select(element("gender"));
		g.selectByValue("1");
		System.out.println("selected Month" + g);
	}

	public void iClickOnNextButtonOnGenderPage() throws InterruptedException {
		WebElement nextButton = element("nameButton");
		nextButton.click();
		Thread.sleep(1500);		
	}

	public boolean iVerifyTheTextHowYoullSignIn() {
		String content = element("lastText").getText();
		String expectedContent = "Choose your Gmail address";
		boolean res = content.equalsIgnoreCase(expectedContent);
		return res;
	}

}
