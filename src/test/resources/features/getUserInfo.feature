Background: Get Token
Given Generate Token request is sent to related end point

@wip2
Scenario: Get User Info
When User sends GET request to receive user information
And User captures status code, userID, username and books information for GET
And User sends GET request to receive all books information
Then Verifies status code username and books information