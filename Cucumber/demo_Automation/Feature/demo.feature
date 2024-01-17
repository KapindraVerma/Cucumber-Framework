Feature: Amazon Home Page

@demo
Scenario: Verify the brand filter
	Given The Home page is visible
  	Then Verify the url is as expected
    When Select any category from the header
    When Select any brand from brand filter
    Then Verify the options are displayed according the the filter
    
