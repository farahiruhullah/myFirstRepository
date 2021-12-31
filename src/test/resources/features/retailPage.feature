Feature: user enters into his account

  Background: 
    Given user is on retail website
    And user clicks on my account
    When user clicks on login
    And user enters username "rxf@gmail.com" and password "123456"
    And clicks on login button
    Then user should be logged in to MyAccount

  @tag2
  Scenario: registering as affiliate user with cheque
    When user clicks on register for an affiliated link
    And user fill the information as below
      | company   | website    | taxID | payeename |
      | JP Morgan | www.JP.com | 45645 | Ahmad     |
    And user checks the about us box
    And user clicks on continue button
    Then user should be able to see the success msg.

  @tag3
  Scenario: user edits the payment method
    When user clicks on register for an affiliated link
    And user clicks on bank transfer button
    And user fills the bank informatino as follow
      | bankname | aba  | swiftcode | accountname | accountnumber |
      | Vancity  | 1122 |      5885 | Roger       |        558269 |
    And user clicks on the continue button
    Then user sees the success msg for the edit


@tag4
  Scenario: user edits the account information
    When user clicks on edit your account information
    And user modifies the information as under
      | fname | lname | email                | telephone |
      | John  | Smith | john.smith@gmail.com |   2255879 |
    And user clicks on the continue for change
    Then user sees the success msg for the change"‘Success: Your account has been successfully updated."
