Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario: Login as a authenticated user
    Given user is on homepage
    When user searches for "one way" package
    And user enters username and Password
    Then success message is displayed