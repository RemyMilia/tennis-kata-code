Feature: Winning a Point Increases Score Correctly
As a library user
I want the score to increase when a player wins a point
So that I can display the current score correctly

Background: 
	Given a new tennis game

Scenario: Score at the beginning of the game
	When the tennis game starts
  Then the game score is 0:0
  And the set score is 0:0
	And the match score is 0:0

Scenario: Score when server wins a point in a game
	When the server wins a game point
	Then the game score is 15:0

Scenario: Score when receiver wins a point in a game
	When the receiver wins a game point
	Then the game score is 0:15
	
Scenario: Server scores after 2 points in a game
	When the game score is 30:30 and the server wins a game point
	Then the game score is 40:30
	
Scenario: Receiver scores after 2 points in a game
	When the game score is 30:30 and the receiver wins a game point
	Then the game score is 30:40 
	
Scenario: Server scores in DEUCE 
	When the game score is 40:40 and the server wins a game point
	Then the game score is 1:40
	
Scenario: Server scores in advantage
	When the game score is 1:40, the set score is 0:0 and the server wins a game point
	Then the set score is 1:0
	And the game score is 0:0

Scenario: Receiver scores in DEUCE 
	When the game score is 40:40 and the receiver wins a game point
	Then the game score is 40:1
	
Scenario: Receiver scores in advantage
	When the game score is 40:1, the set score is 0:0 and the receiver wins a game point
	Then the set score is 0:1
	And the game score is 0:0

Scenario: Server scores in disadvantage
	When the game score is 40:1 and the server wins a game point
	Then the game score is 40:40

Scenario: Server wins a game	
	When the game score is 40:30, the set score is 0:0 and the server wins a game point
	Then the set score is 1:0 
	And the game score is 0:0
	
Scenario: Receiver wins a game	
	When the game score is 30:40, the set score is 0:0 and the receiver wins a game point
	Then the set score is 0:1
	And the game score is 0:0

Scenario: Server wins a set
	When the game score is 40:30, the set score is 5:0 and the server wins a game point
	Then the set score is 6:0 
	And the match score is 1:0
