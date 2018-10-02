Feature:  Creating Proposal in FMO 

Scenario: Create a new proposal in FMO for Customer type PI.

Given User open browser
When User enter user name and password
Then User enter new proposal option
Then User accept DPA Agreement
Then User enter all mandatory answers
Then User save the form 
Then User create a quote
Then User submit the proposal
Then User goto Update screen
Then User verify the document 
Then User Activate the Proposal