package com.demo.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.demo.pages.gitPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GitHubStep extends StepDefinitionInit{
	@Given("^Verify the actual and expected url is same$")
	public void verify_the_actual_and_expected_url_is_same() throws Throwable {
	    Assert.assertTrue(gitpage.verifyActualExpectedUrlIsSame());
	}
	
	@Then("^verify the sign in element is visible$")
	public void verify_the_sign_in_element_is_visible() throws Throwable {
	    Assert.assertTrue(gitpage.verifySignInElementIsVisible());
	}
	
	@When("^Click on Sign in on Homepage$")
	public void click_on_Sign_in_on_Homepage() throws Throwable {
	    gitpage.clickOnSignInOnHomepage();
	}
	
	@Then("^verify the actual and expected urls are not same$")
	public void verify_the_actual_and_expected_urls_are_not_same() throws Throwable {
	    Assert.assertFalse(gitpage.verifyActualExpectedUrlIsNotSame());
	}
	
	@When("^pass data into email field$")
	public void pass_data_into_email_field() throws Throwable {
	    gitpage.passDataIntoEmailField();
	}
	
	@When("^pass data into password field$")
	public void pass_data_into_password_field() throws Throwable {
		gitpage.passDataIntoPasswordField();		
	}
	
	@When("^Click on sign in on SignIn Page$")
	public void click_on_sign_in_on_SignIn_Page() throws Throwable {
	    gitpage.clickOnSignInOnSignInPage();
	}
}
