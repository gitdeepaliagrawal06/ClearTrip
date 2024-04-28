Feature: LoginFeature

Scenario: Verify login with valid credentials 
Given I am on IMDB home page
When I click on signin option 
And I enter username 
And I enter password 
And I click on signin button
Then now we are under signin page

#Scenario: Password Reset
#Given I am on the eBay Sign In page
#When I click on the "Forgot Password?" link
#And I enter the registered email address associated with my eBay account
#And I click the "Reset Password" button
#Then I should receive a password reset email
#And I should be able to reset my password following the instructions in the email

