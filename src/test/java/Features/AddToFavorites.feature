Feature: Add The Product To My Favourites

  Scenario:  Scenario 1-1

    Given A user opens the website
    Then A user opens the login page,
    When User enter email and password
    When User search samsung to search input field
    Then User should see samsung in search result
    When User click second page
    Then User checks it exists on the second page
    When User add the third product to user's favorites
    When User click my favorites
    Then User checks that the product has been added to favorites
    When User click the remove from favorites button
    Then User checks that the product has been removed to favorites



