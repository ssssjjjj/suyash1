Feature: demo web shop multi login


Scenario Outline: Testing multiple login
Given user is on the demo web shop home page
When i provide valid "<login>" and "<password>"
Then the relevent login username is displayed

Examples:
|login|password|
|a1.b1@g.com|a1b1a1|
|a2.b2@g.com|a2b2a2|