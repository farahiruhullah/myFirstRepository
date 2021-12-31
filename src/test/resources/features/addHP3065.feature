Feature: adding items to the cart

@addHp
Scenario: user adds HP LP3065 from desktops tab to cart


Given user is on tek retail website
When user clicks on Desktop tab
And clicks on Show All desktops
And user clicks on Add to Cart for HP LP3065
And user enters one quantity
And userclis on add to cart button
Then user should see messege of "Success: You have added HP LP3065 to your shopping cart!"
