Feature: Codefios Add Account functionality validation

@AddAccountFeature
Scenario: User should be able to add account with valid credentials
Given User is on codefios login page
When User enters username as "demo@codefios.com"
When User enters password as "abc123"
When User clicks on sign in button
Then User should be landing on dashboard page

When User clicks on List Account button
When User clicks on Add Account button
When User enters Account Name as "John Doe"
When User enters Description as "New account holder"
When User enters Initial Balance as "100000000"
When User enters Account Number as "123456789"
When User clicks on save button