Feature: Orange HRM login
Scenario: Logo presence on Orange HRM Home Page
	Given I launch chrome browser
	When I open orange hrm homepage
	Then I verify that logo present on page
	And Close browser