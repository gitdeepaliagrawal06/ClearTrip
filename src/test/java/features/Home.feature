Feature: HomeFeature

@P1
Scenario: Navigate to Watchlist
Given I am on IMDB home page
When I click on signin option 
And I enter username 
And I enter password 
And I click on signin button
And I navigate to "Watchlist" option
Then I should be able to view "12th Fail" in my watchlist

@P2
Scenario: Add a product to watchlist
Given I am on IMDB home page
When I click on signin option 
And I enter username 
And I enter password 
And I click on signin button
And I search "Road House" in the search box
And I click "Road House" from the search result
And I add "Road House" to watchlist
And I navigate to "Watchlist" option
Then I should be able to view "Road House" in my watchlist

@P4
Scenario: Add a product to new watchlist
Given I am on IMDB home page
When I click on signin option 
And I enter username 
And I enter password 
And I click on signin button
And I navigate to "Watchlist" option
And I click edit watchlist
And I search to add "Road House" to watchlist
Then I should be able to view "Road House" in my watchlist


@P3
Scenario: Remove a product from a watchlist
Given I am on IMDB home page
When I click on signin option 
And I enter username 
And I enter password 
And I click on signin button
And I search "Road House" in the search box
And I click "Road House" from the search result
And I add "Road House" to watchlist
And I navigate to "Watchlist" option
Then I should be able to view "Road House" in my watchlist
When I select "Road House" in the watchlist 
And I delete "Road House" from my watchlist


