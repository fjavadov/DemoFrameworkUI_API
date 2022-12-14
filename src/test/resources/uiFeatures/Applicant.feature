@smoke
Feature: User should be able to login with valid credentials
  Background:
    Given Navigate to the page

  @Test-1
  Scenario: User should be able to select one billing options and  verify sign in page
    And user should choose one of the two billing options
    Then land to Sign in page
    Then verify if username, password and login button is present


  @Test-2
  Scenario: User should be able to sign in with valid credentials
    When After landing to Sign in page user should enter valid credentials
    And user lands to details page
    And User validates if landed to details page
    Then user validates if Connection Id, telephone number and Address are pre-populated

  @Test-2
  Scenario: User should be able to search telephone connections
   When user at the details page
    And User search telephone connection providing telephone ID
    Then user verifies list of connections at the search result page
    And user clicks cancel
    When User search telephone connection providing connection ID
    Then user verifies list of connections at the search result page
