Feature: Login Feature
  Verify if user is able to Login in to the site

@StepDefine1
  Scenario: Login as a authenticated user
    Given user is  on homepage
    When user navigates to Login Page
    And user enters username and Password
    Then success message is displayed
    
    @StepDefine2
    Scenario: verify user is able to login to the application
    When user is on login page
    Then user entered user name 
    And user entered password
    Then user click on login button
    Then verify user is on home page
    
     @StepDefine3
     Scenario: verify user is able to login to the application
    When user is on login page
    Then user entered user name 
    And user entered password
    Then user click on login button
    Then verify user is on home page
    Given verify user is able to click on updateprofile
    Then user uploads the user resume
    Then user clicks on keyskills button