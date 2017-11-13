@sasi
Feature:Search Feature amazon page
 As a user
 I want to search for a product
  So that i can choose and add to basket

 Scenario: search product
  Given  I am on amazon home page
 When    I search for a product
  Then   I should see the product in the search result
  When   I choose the first product
  And    I add product to basket
  Then   basket is updated with an item count


