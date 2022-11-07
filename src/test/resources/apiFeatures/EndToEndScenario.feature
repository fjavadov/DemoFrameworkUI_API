Feature: Create new user in API

@CreateUser @ApiRegression

Scenario Outline: End to End

Given User create request data with "<name>" , "<email>" , "<gender>" , "<location>"
When User sumbits POST request to API
And User validates if statusCode is 201
Then User retrieves userID from response 
And User deletes data with userID

Examples:
|name     |email   					  |gender   | location|
|Mr.API   |apiTest@gmail.com          |male     | Toronto |