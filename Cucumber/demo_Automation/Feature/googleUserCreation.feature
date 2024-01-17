Feature: I want to click on new user and enter all the details and just before final step need to verify he conent.

  @googleUserCreation
  Scenario Outline: Create a new user on google
    Given I click on Sign In button
    When I click on create account
    When I click on my personal use
    When I pass data in first name "<first>"
    When I pass data in last name "<last>"
    When I click on next button
    When I select any month of your choice
    When I pass data in day field "<day>"
    When I pass data in year field "<year>"
    When I select any gender of your choice
    When I click on next button on gender page
    Then I verify the text How you’ll sign in
    
    Examples:
    |first		|last |day|year|
    |Kapindra	|Verma|2  |1992|
