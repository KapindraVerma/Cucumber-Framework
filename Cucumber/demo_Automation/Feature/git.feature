Feature: Github Home page

@GitTest
Scenario: Navigate to git ang login
Given Verify the actual and expected url is same
Then verify the sign in element is visible 
When Click on Sign in on Homepage
Then verify the actual and expected urls are not same
When pass data into email field
When pass data into password field
When Click on sign in on SignIn Page