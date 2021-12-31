Feature: Desktops


Background:
	Given user is on retail website
	When user clicks on Desktops tab

@desktop
Scenario: user verifies items are present in the Desktops tab

And clicks on Show All desktop
Then user should see all the items present in Desktop Page

