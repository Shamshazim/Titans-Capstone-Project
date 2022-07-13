@completeRetailTest, @Complete
Feature: RetailPage

  Background: 
    Given user is on the home page
    When user click on MyAccount
    And user click on login option
    And user enter user name "shams6@gmail.com" and password "cali123"
    And user click on the login button
    Then user should be able to logged into account

 @Register
  Scenario: Register as an Affiliate user with Chegue Payment Method
    When user click on the Register for an Affiliate account link
    And user fill affiliate form with below information
      | company   | website          | taxID | paymentMethod | Payee Name |
      | TekSchool | www.tekschool.us |   332 | cheqe         | Student    |
    And user check on About us check box
    And user click on Continue button
    Then user should see a success message

 @edit
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName   | abaNumber | swiftCode | accountName | accountNumber |
      | WellsFargo |       021 |    323212 | Student     |      21321234 |
    And User click on Continue button
    Then User should see a success message

   @edit
  Scenario: Edit your account Information
    When User click on Edit your account information link
    And User modify below information
      | firstName | lastName | email                 | telephone  |
      | Shams     | shams    | shams6@gmail.com | 9163181921 |
    And User click on edit continue button
    Then User should see a message ‘Success: Your account has been successfully updated.
