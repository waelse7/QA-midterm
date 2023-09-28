Feature: test1
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
    Then The cart is empty
