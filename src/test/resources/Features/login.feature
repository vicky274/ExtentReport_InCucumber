Feature: Demo Site Form Filling

Background:
Given user is already on Login Page

@scenario1
Scenario: Demo Site Form Filling Test Scenario
When user enters First Name text in first name field
When user enters Last Name text in last name field
When user selects State  in State field
When user clicked on radio button
When user enters all other fields
Then Close the browser


@scenario2
Scenario: Demo Site title check
When user gets title of page
When user compared with actual title
Then Close the browser


#Examples:
#	| username | password |
#	| naveenk  | test@123 |
