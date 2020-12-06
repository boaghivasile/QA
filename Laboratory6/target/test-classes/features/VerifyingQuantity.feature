Feature: Verifying Quantity

  Scenario: Verifying quantity in the shopping card pop-up
    Given The website is open
    When AddToCard button is pressed twice on the same item
    Then The newly added item should have quantity as two