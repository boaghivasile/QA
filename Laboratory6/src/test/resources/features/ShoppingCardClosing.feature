Feature: Closing shopping card pop-up

  Scenario: Verifying if shopping card pop-up is closing when clicking outside
    Given The home page is opened
    When Click on shopping card icon
    And Click outside the shopping card pop-up
    And Click on add to card button
    Then Shopping card pop-up should appear again