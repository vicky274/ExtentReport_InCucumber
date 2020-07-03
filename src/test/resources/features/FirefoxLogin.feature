Feature: Demo Site Form Filling-Firefox

Background:
Given Firefox user is already on Login Page

@firefox
Scenario: Demo Site Form Filling Test Scenario
When Firefox user enters first name data in first name field in firefox
When Firefox user enters Lastname data in last name field in firefox
When Firefox user selects State  in State field in firefox
When Firefox user clicked on radio button in firefox
Then Close the Firefox browser


#@scenario2
#Scenario: Demo Site title check
#When user gets the title of page in firefox
#When user compared title with actual title in firefox
#Then Close the Firefox browser
#
#
#Examples:
#	| username | password |
#	| naveenk  | test@123 |
