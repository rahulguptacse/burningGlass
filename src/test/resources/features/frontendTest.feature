Feature: Selenium Test

  @FrontendTest
  Scenario: 1: Timeout Example
    Given I am on 'https://google.com' website
    And I search for 'Learn Automation Online'
    And I click on 'Learn Automation Online' link
    Then 'Learn Automation Online' is displayed

  @FrontendTest
  Scenario: 2: iFrame Example
    Given I am on 'https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit' website
    And user enter 'Rahul' and 'Gupta'
    Then  'Submitted Form Data' form is displayed




