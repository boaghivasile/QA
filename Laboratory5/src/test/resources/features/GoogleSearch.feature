Feature: Google search

  Scenario: Website header exists

    When I open google website

    And I search for computer

    Then Header should exits
