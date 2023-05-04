#Author: sumit.chhabra@xceedance.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
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
#Sample Feature Definition Template
@hollardDemo
Feature: DC Policy Demo - Hollard

  @demo
  Scenario Outline: Creation of Personal Line Motors Policy
    Given User Login to DC application using username <username> and password <password>
    And User clicks on New Quote and select the quote for product <product>
    When User fills the applicant info with basic details - firstname  <firstname> lastname <lastname> email <email> address <address> city <city>
    And User fills Policy term and Driver Details with Maritial Status <maritialStatus>
    And User fills the Vehicle Details <modelYear> <make> <model> <financed> and Hit Next Button
    Then Users Bind the quote using payment method and get the Policy Number

    Examples: 
      | username | password     | product                            | firstname | lastname | email      | address     | city   | maritialStatus | modelYear | make | model | financed |
      | admin    | RAIVpflpDOg= | AUS Personal Lines Motor (1.0.0.0) | Sam       | Martin   | sam@xc.com | Adam Street | Boston | Single         |      2019 | FORD | FLEX  | No       |
