Feature: Users can buy product & verify the price from the online https://www.automationpractice.com

 Description: "User can search dresses, check dress price, and buy the"
                         "dresses with a valid user." 
                        
Scenario:
Login with valid authentication and verify homepage and print the dress price and verify dress and shipping price
Given Customer can open any browser
 And Navigate to url "http://automationpractice.com/" and click onto signin button
 When User can enter userName "akharabdul@gmail.com" and password "2w2w2w2w"
 And Click on Submit button
 And Verify Home page title
 And user click on dress
 And user print all five items price on console
 And user select second item
 And added to the cart
 Then user proceede and verifies shipping and dress prices
 And user close and quit
 