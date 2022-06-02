Feature: EditProfile feature 
Verify if the user is able to update the profile page

@tag1
Scenario: Edit Profile
When user is on login page
Then user entered user name 
And user entered password
Then user click on login button
Given Verify user is on homepage
Then  user clicks on update profile
Then user clicks on update resume
When user clicks on keyskills 
Then user enters the keyskills
And user clicks on save



