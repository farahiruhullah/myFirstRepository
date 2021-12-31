Feature: add to cart from desktops

@addCanon
Scenario: user adds Canon EOS 5D from Desktops to cart

Given user is on tek retail website
When user clicks on Desktop tab
And clicks on Show All desktops
And user clicks add to cart option on Canon item
And user selects red color from dropdown
And user selects quantity one
And user clicks on add to cart button
Then user should see the msg "Success: You have added Canon EOS 5D to your shopping cart!"