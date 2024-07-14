#Author: vishwajeetwakle@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Stanadrad User E2E Flow.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)

@standarduser
Feature: Standard user end to end flow
  This is the end to end of standard user covers - login, add to cart, order, logout

  @login
  Scenario: login and logout function 
    Given User is on login page
    And user enters username and password
    And user clicks on login button
    Then user able to see product page
    And user clicks ok to alart 
    And user clicks on log out
    And user hits back button 
    Then user able to see error msg 


