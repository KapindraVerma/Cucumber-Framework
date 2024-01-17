package com.demo.stepdefinitions;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import com.demo.pages.gitPage;
import com.demo.pages.googleUserCreationPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleUserSteps extends StepDefinitionInit{

	@Given("^I click on Sign In button$")
	public void i_click_on_Sign_In_button() throws Throwable {
	    googleUserCreation.iClickOnSignInButton();
	}

	@When("^I click on create account$")
	public void i_click_on_create_account() throws Throwable {
		googleUserCreation.iClickOnCreateAccount();
	}

	@When("^I click on my personal use$")
	public void i_click_on_my_personal_use() throws Throwable {
	    googleUserCreation.iClickOnMyPersonalUse();
	}
	
	@When("^I pass data in first name \"([^\"]*)\"$")
	public void i_pass_data_in_first_name(String arg1) throws Throwable {
	   googleUserCreation.iPassDataInFirstName(arg1);
	}

	@When("^I pass data in last name \"([^\"]*)\"$")
	public void i_pass_data_in_last_name(String arg1) throws Throwable {
		googleUserCreation.iPassDataInLastName(arg1);
	}
	
	@When("^I click on next button$")
	public void i_click_on_next_button() throws Throwable {
	    googleUserCreation.iClickOnNextButton();
	}
	
	@When("^I select any month of your choice$")
	public void i_select_any_month_of_your_choice() throws Throwable {
	    googleUserCreation.iSelectAnyMonthOfYourChoice();
	}
	
	@When("^I pass data in day field \"([^\"]*)\"$")
	public void i_pass_data_in_day_field(String arg1) throws Throwable {
		googleUserCreation.iPassDataInDayField(arg1);
	}
	
	@When("^I pass data in year field \"([^\"]*)\"$")
	public void i_pass_data_in_year_field(String arg1) throws Throwable {
		googleUserCreation.iPassDataInYearField(arg1);
	}
	
	@When("^I select any gender of your choice$")
	public void i_select_any_gender_of_your_choice() throws Throwable {
		googleUserCreation.iSelectAnyGenderOfYourChoice();
	}
	
	@When("^I click on next button on gender page$")
	public void i_click_on_next_button_on_gender_page() throws Throwable {
		googleUserCreation.iClickOnNextButtonOnGenderPage();
	}

	@Then("^I verify the text How you’ll sign in$")
	public void i_verify_the_text_How_you_ll_sign_in() throws Throwable {
		Assert.assertTrue(googleUserCreation.iVerifyTheTextHowYoullSignIn());
	}
}
