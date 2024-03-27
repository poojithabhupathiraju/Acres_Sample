Feature: HomePage Feature
 
Background: Navigate to 99Acres Home Page
		Given user is on the landing page
		When user open the 99Acres website
		Then user should see the 99Acres App home page
		
#Scenario: Project Search Section 
#		Given user is on the landing page
#		When User clicks on specific option
#		And user enters the data
#		And user clicks on search button
#		Then user is redirected to other page
#	
#Scenario: Post Property Section
#	Given user is on the landing page
#	When user clicks on post your property option
#	And user is redirected to next page
#	And user Enters the Details 
#	And user Enters the valid mobile Number and fill the form
  #And user clicks on start now option
#	Then user is redirected to other page

Scenario: Insights and Tools Section
 Given user is on the landing page
 When user scrools down to the Insights and Tools Section
 And user clicks on the view all Insights
Then user should be redirected to other page

#Scenario: Checking for Testimonials Section
#Given user is on the landing page
#When user scrolls towards right 
#And  scrolls towards left
#And user selects for a specific Testimonial
#And user can view the Testimonials page
#And user clicks on the city for filter
#Then user can view the Reviews
#	

	
	 
	 
	 
		
	

