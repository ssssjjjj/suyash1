#Author: suyash
#Background: List of steps run before each of the scenarios
Feature: login to demowebshop successful
  I want to use this template for my feature file

 

  Background: 
    Given john launched chrome browser
    And provided test me site url

 

  Scenario: login to test me site
    When he clicks on login
    Then he shall be able to provide credentials

 

  Scenario: registering to test me site
    When he clicks on register link
    Then he shall be able to provide registration details

 

  Scenario: wishlist on test me site
    When he clicks on cart
    Then he shall be able to view his cart