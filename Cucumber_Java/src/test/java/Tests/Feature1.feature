Feature: Login
  Scenario: Logo present on the page
    Given User launch chrome browser
    When I open LoginFeatures file
    Then I verify that logo present on page
    And close browser
