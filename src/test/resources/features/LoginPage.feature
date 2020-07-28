Feature: Verifying adactin hotel details

Scenario Outline: Verifying login details with valid credentials
Given User is on login page
When User enters "<username>","<password>"
And User should click login button
When I select "<location>","<hotel>","<roomtype>","<noofroom>","<adult>","<child>"
And I should click search button
When I select radio button
And I should click continue button
When I enters "<firstname>","<lastname>","<address>","<cardno>"
And I select "<cardtype>","<expmonth>","<expyear>","<cvv>"
And I should click book now button
Then I should verify the message

Examples:
        |username|password|location|hotel|roomtype|noofroom|adult|child|firstname|lastname|address|cardno|cardtype|expmonth|expyear|cvv|
        |karthicviji|task|Sydney|Hotel Sunshine|Standard|1 - One|1 - One|1 - One|vijaya|lakshmi|kerala|2345678912365894|VISA|March|2022|456|
