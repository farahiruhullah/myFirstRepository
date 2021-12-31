Feature: user checks the homepage

Background:
Given user is on tek retail website

@currency
Scenario: user verifies the currency value change


When user clicks on the currency tab
And user chooses Euro from the dropdown
Then currency value should change to Euro

@shoping
Scenario: user sees the empty shopping cart

When user clicks on shopping cart
Then user sees the msg "Your shopping cart is empty!"

