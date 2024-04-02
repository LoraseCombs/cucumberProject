@codefiosFeature
Feature: Codefios page login functionality validation with data from MySQL server

@codefiosLoginDbScenario1 @smoke
Scenario: - User should be able to login with valid credentials from Db
Given User is on codefios login page
When User enters "username" from mysql database
When User enters "password" from mysql database
When User clicks on sign in button
Then User should be landing on dashboard page