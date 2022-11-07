Feature: As an administrator I should be able to view all applicants and search.
  Background:
    Given I'm on logged in to website as admin

  @Test-1
  Scenario: View All applicants
    And I click on the Applicant List
    Then I see applicant list table

    #Scenario: Verifying employee count
    #Scenario: Verifying Adding employee


  @Test-2
  Scenario: Adding applicant with picture
    Then I click on the Add applicant Tab
    Then I fill out applicant information
    And I upload an applicant image
    Then I click on Save applicant button
    And I see applicant information saved successfully