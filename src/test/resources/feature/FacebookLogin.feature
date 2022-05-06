Feature: To validate the login functionality of facebook application

Scenario Outline: To validate the login functionality of facebook login application

When The user has to enter "<userName>" and "<password>"
Then The user has to click  login button

Examples:
|userName|password|
|aravinthan@gmail.com|7598727010|


Scenario Outline: To validate the create new account functionality of facebook application

When The user has to click create new account
And The user should be enter "<firstName>" and "<lastName>"
Then The user has to click sign up

Examples:
|firstName|lastName|
|Aravinthan|Arunachalam|