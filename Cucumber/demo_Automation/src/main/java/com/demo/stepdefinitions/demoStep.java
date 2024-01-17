package com.demo.stepdefinitions;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demoStep extends StepDefinitionInit {

	@Given("^The Home page is visible$")
	public void the_Home_page_is_visible() throws Throwable {

		Assert.assertTrue(demopage.isHomePageVisible());

	}

	@Then("^Verify the url is as expected$")
	public void verify_the_url_is_as_expected() throws Throwable {
		Assert.assertTrue(demopage.isUrlCorrect());

	}

	@When("^Select any category from the header$")
	public void select_any_category_from_the_header() throws Throwable {
		demopage.selectCategory();

	}

	@When("^Select any brand from brand filter$")
	public void select_any_brand_from_brand_filter() throws Throwable {
		demopage.selectBrand();
	}

	@Then("^Verify the options are displayed according the the filter$")
	public void verify_the_options_are_displayed_according_the_the_filter() throws Throwable {

		Assert.assertTrue(demopage.areOptionsAccordingToFilterSet());
	}

}