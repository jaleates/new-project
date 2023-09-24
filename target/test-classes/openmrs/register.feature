
Feature: Register patient with missing last name  information

  Background:Login to the website same step
    When User provides username and password
    And User chooses location laboratory and clicks login button

  Scenario Outline: Negative Path for patient registration firstname and lastname
    When User click Register a patient Icon
    Then User provide firstName '<firstName>' and lastName '<lastName>'
    And the user clicks the next button
    Then an error message should be displayed '<errorMessage>'
    Examples:
      | firstName | lastName   | errorMessage |
      | Supattra  |            | Required    |
      |           | Boonchalee | Required    |
      |           |            |Required    |