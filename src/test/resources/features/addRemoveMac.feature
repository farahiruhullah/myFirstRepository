Feature: add and remove item

Background:
Given user is on retail website
When user clicks on lapto and notebook tab
And user clicks on showall laptops and notebooks
 

@addRemove
Scenario: user add and remove macbook from cart

And user clicks on macbook item
And user clicks on add to cart button for macbook
Then user see the msg "Success: You have added MacBook to your shopping cart!"
And user should see "1 item(s) - $602.00" on the cart button
And user clicks on the cart button
And user clicks on the red x button to remove
Then item should be removed and cart should be at "0 item(s)"

@comparison
Scenario: user compares

And user clicks on MacBook comparison
And user clicks on MacBook Air comparison
Then user should see the "Success: You have added MacBook Air to your product comparison!"
And user clicks on comparison hyperlink
Then user see the compariosn chart

@wish
Scenario: adding to wish list

And user clicks on the heart icon for Sony VaIO to wish list
Then user should witness the "You must login or create an account to save Sony VAIO to your wish list!"

@priceValid
Scenario: MacBook price validation

And user clicks on macbook pro 
Then user sees $2,000.00 in the page







 