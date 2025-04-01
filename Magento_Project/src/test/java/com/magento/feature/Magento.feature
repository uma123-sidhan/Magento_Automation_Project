 @Magento
 Feature: Create a New User Account on Magento
 @createAccount
 Scenario: Successful Create a new Account
 Given I am on the Magento homepage
 When I click on the Create an Account link
 And I enter the following details:
      | First Name | Last Name | Email                | Password  | Confirm Password |
      | John       | Doe       | johndoe56@gmail.com  | JohnDoe@56 | JohnDoe@56      |
 And I click on the Create an Account button
 Then I should see a confirmation message Thank you for registering with Main Website Store
 And I should be redirected to the My Account dashboard
 
@signIn
Scenario: Successful Sign In with Valid Credentials
Background:
Given I am click the click the sign in button
    
    When I enter a valid email "johndoe56@gmail.com"
    And I enter a valid password "JohnDoe@56"
    And I click on the Sign In button
    Then I should be redirected to the My Account dashboard
    And I should be redirected to the My Account dashboard

 