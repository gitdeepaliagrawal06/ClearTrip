Feature: LogoutFeature

Scenario: Logout from eBay Account
Given I am on ebay home page
When I click on signin option 
And I enter username 
And I click continue button
And I enter password 
And I click on signin button
And I click on the "Logout" option
Then I should be logged out of my account