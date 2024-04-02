#@codefiosNegativeFeature
#Feature: Codefios page Negative login functionality validation
#
#Background:
#used for implementing identical steps without repeation 
#
#@negativeScenario1
#Scenario Outline: 1 User should NOT be able to login with valid credentials
#Scenario: 1 User should NOT be able to login with valid credentials
#Given User is on codefios login page
#When User enters username as "demo@codefios.com"
#When User enters password as "abc123"
#When User clicks on sign in button
#Then User should be landing on dashboard page
#
#Example
#|username|password|
#|||
#use Scenario Outline 
#
#@negativeScenario2
#Scenario: 2 User should NOT be able to login with valid credentials
#Given User is on codefios login page
#When User enters username as "demo1@codefios.com"
#When User enters password as "abc123"
#When User clicks on sign in button
#Then User should be landing on dashboard page