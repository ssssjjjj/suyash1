Feature: demo web shop multi login


Scenario Outline: Testing login feature
Given user is on the demo web shop home page
When i provide valid "<login>" and "<password>"
Then the relevent login username is displayed

Examples:
|login|password|
|karthik456@gmail.com|karthik456|