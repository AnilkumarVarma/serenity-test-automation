@cucumber
@searching
Feature: My Google Search Screen play  Test 

  In order to search things in google to find it
  As a knowledge seeker person
  I want to be able to find the item of my desire and get the useful text information regarding it

  Scenario: Searching an Item in Google Seach Engine
    Given that 'James' start google search
    When he search for 'serenity bdd' 
    Then google search results should be a collection containing a string containing 'Introduction to BDD Test Automation'
