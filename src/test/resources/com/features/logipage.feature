Feature: Login to the application

Background:
Given user is on login page

Scenario: Verify if all the page fields displayed
Then verify page title is "SpiceClub - The frequent flyer program of SpiceJet"
Then Verify the page filed are displayed
|Title|
|First Name and Middle Name|
|Last Name|
|Country/Territory of Residence|
Then select value "Mr" from dropdown