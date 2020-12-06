Feature: QuickView

  Scenario: Validate that user can quick view short information about a product
    Given The website is open
    When QuickView button is clicked
    Then Validate that user was redirected to a new page with short information about the item he clicked