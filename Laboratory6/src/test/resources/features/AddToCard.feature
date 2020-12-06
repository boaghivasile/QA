Feature: Add to card

  Scenario: Verifying adding to shopping card feature
    Given The website is opened
    When AddToCard button is pressed on a item
    Then Shopping card pop-up should appear