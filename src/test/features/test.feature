Feature: test1
  Scenario: login to the website
    Given I am on the RamiLevi website
    When I log in to the website
    And I am logged in

  Scenario: login in
    Given I have navigated to Rami Levi
    When On Rami Levi home page - I click login
    When On login popup - I login with user '4everqatesting@gmail.com' and password 'fouad123321'
    Then On Rami Levi home page - 'foad'

  Scenario: invalid login to the website
    Given I am on the RamiLevi website
    When invalid log in to the website
    And I am logged in

  Scenario: buy item from the store
    Given I am on the RamiLevi website
    When I log in to the website
    And I am logged in
    When I search for item "קורנפלקס"
    When I toggle dark mode
    When I add items to cart 5
    And I have 5 items in the cart

  Scenario: remove items from the store
    Given I am on the RamiLevi website
    When I log in to the website
    And I am logged in
    When I search for item "קורנפלקס"
    When I toggle dark mode
    When I add items to cart 5
    When I remove items from side cart
    And The cart is empty