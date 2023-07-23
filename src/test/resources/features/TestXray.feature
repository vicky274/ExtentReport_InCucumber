@REQ_AUT-29
Feature: Story - XRay Jenkins Integration

  Background:
    Given user the access to the application

  @SmokeTest
  Scenario: First Scenario to validate the application
    When vicky enters the username
    When vicky enters the password
    When vicky click on login button
    Then vicky logged into application
    Then vicky quit the Chrome browser

    @RegressionTest
  Scenario: Second Scenario to validate the application
    When test enters the username <username>
    When test enters the password
    When test on login button
    Then test logged into application
    Then test quit the Chrome browser

  @Demo
  Scenario: Third Scenario to fetch data from Excel
    When user get data from Excel sheet "Tariff.xlsx"