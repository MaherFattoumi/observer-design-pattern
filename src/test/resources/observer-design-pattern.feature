Feature: Observer Design Pattern

Scenario: The weather conditions change
	Given a weather station
	And multiple weather displays
	When the weather conditions change
	Then all weather displays should be updated