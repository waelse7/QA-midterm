Feature: test1
#=======================UI only tests
  Scenario: login in
    Given I have navigated to Rami Levi
    When On Rami Levi home page - I click login
    When On login popup - I login
    Then On Rami Levi home page - 'fouad'

  Scenario: invalid login to the website
    Given I have navigated to Rami Levi
    When On Rami Levi home page - I click login
    When On login popup - I login
    Then On Rami Levi home page - 'fouad'

  Scenario: buy item from the store
    Given I have navigated to Rami Levi
    And On Rami Levi home page - I click login
    And On login popup - I login
    When I search for item "קורנפלקס"
    And I add items to cart 5
    Then I have 5 items in the cart

  Scenario: remove items from the store
    Given I have navigated to Rami Levi
    And On Rami Levi home page - I click login
    And On login popup - I login
    When I search for item "קורנפלקס"
    And I add items to cart 5
    When I remove items from side cart
    And The cart is empty
#=================================================Tests    UI + API
Feature: test2
  Scenario: Test the login functionality (valid)
    Given I am on rami levi homepage.
    When On Rami Levi home page - I click login
    And On login popup - I login
    Then I see the user name element on the page.

  Scenario:  Test the login functionality (invalid)
    Given I am on rami levi homepage.
    When On Rami Levi home page - I click login
    And On login popup - I login with wrong credentials
    Then I don't see the user name element on the page.

Feature: test3
  Background: user is logged in
    Given I am on rami levi homepage.
    When On Rami Levi home page - I click login
    And On login popup - I login

  Scenario: Test the search functionality
    And I search for "cola" (via api).
    Then I see the "קולה" on the search page.

  Scenario: Test adding an item to the cart
    And I search for "cola" (via api).
    And add items to the cart (via api).
    Then I see "קולה" in the cart

  Scenario: Test removing an item from the cart
    And I search for "cola" (via api).
    And add items to the cart (via api).
    And I remove items from side cart
    Then The cart is empty

