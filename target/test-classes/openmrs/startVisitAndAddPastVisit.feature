@Regression
Feature: Find Patient start visit and add past visit

  Background:Login to the website same step
    When User provides username and password
    And User chooses location laboratory and clicks login button
    Scenario: Find Patient Record
      Given User clicks find patient record icon and searches for the patient 'Jane Doe' and clicks it
      When User validates patient 'Jane', 'Doe' and patient '100L7U'
      Then User clicks start visit button from patients file, and click confirm button
      And User havor over action button and selects add past vist from drop down list
      And User chooses start date and end date for the patient and clicks confirm button
      And User validates the timestamp message

