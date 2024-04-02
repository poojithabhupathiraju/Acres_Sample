Feature: HomePage Feature
 
Background: Navigate to 99Acres Home Page
		Given user is on the landing page
		When user open the 99Acres website
		Then user should see the 99Acres App home page
		
Scenario Outline: Project Search Section 
		Given user is on the landing page
		When User clicks on specific option
		And user enters the data <cityName>
		And user clicks on search button
		Then user is redirected to other page
		Examples:
		|cityName|
		|"Mumbai"|
		|"Hyderabad"|

Scenario: Post Property Section Invalid Number
Given user is on the landing page
When user clicks on the post property option
And user is redirected to the next page
And user Enters the required details
And user Enters the Invalid phoneNumber 
And it displays error message
Then user clicks on the start Now option

Scenario: Insights and Tools Section
	Given user is on the landing page
	When user scrools down to the Insights and Tools Section
 	And user clicks on the view all Insights
	Then user should be redirected to other page

Scenario: Post Property Section
	Given user is on the landing page
	When user clicks on post your property option
	And user is redirected to next page
	And user Enters the Details 
	And user Enters the valid mobile Number and fill the form
  And user clicks on start now option
	Then user is redirected to other page

Scenario: Navigate to privacy policy in footer Section
Given user is on the landing page
When user scroll to footer section 
And user click on privacy policy link
Then user is redirected to privacy policy page




	

	
	 
	 
	 
		
	

