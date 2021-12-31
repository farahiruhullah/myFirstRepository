Feature: product review

@canonReview
Scenario: adding review for Canon EOS

Given user is on tek retail website
When user clicks on Desktop tab
And clicks on Show All desktops
And user clicks add to cart option on Canon item
And user clicks on reveiws tab
And user fills the section with follwing information
|Your name|Your review|
|Ruhullah|This is one the best products availalb online|
And user clicks on the good rating button
And user clicks on contintue button
Then user should see the success msg 'Thank you for your review. It has been submitted to the webmaster for approval.'