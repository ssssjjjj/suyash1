Feature: login
hi hello
hello hi

Scenario: valid login
Given user is on the test me app home page
When the user gives valid login and valid password
Then user should be able to login
