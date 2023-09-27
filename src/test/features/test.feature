Feature: test1
  Scenario: login in
    Given I have navigated to Rami Levi
    When On Rami Levi home page - I click login
    When On login popup - I login with user '4everqatesting@gmail.com' and password 'fouad123321'
    Then On Rami Levi home page - 'fouad'

  Scenario: invalid login to the website
    Given I have navigated to Rami Levi
    When On Rami Levi home page - I click login
    When On login popup - I login with user '4everqatesting@gmail.com' and password '2347'
    Then On Rami Levi home page - 'fouad'

  Scenario: buy item from the store
    Given I have navigated to Rami Levi
    When On Rami Levi home page - I click login
    When On login popup - I login with user '4everqatesting@gmail.com' and password 'fouad123321'
    Then On Rami Levi home page - 'fouad'
    When I search for item "קורנפלקס"
    When I add items to cart 5
    And I have 5 items in the cart

  Scenario: remove items from the store
    Given I have navigated to Rami Levi
    When On Rami Levi home page - I click login
    When On login popup - I login with user '4everqatesting@gmail.com' and password 'fouad123321'
    Then On Rami Levi home page - 'fouad'
    When I search for item "קורנפלקס"
    When I add items to cart 5
    When I remove items from side cart
    And The cart is empty

  Scenario: Test the login functionality
    Given