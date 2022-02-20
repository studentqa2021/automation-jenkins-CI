@Regression
Feature: Title of your feature
  I want to use this template for my feature file

@Positive
 Scenario Outline: Title of your scenario outline
 Given User need to open any browser
And Put application "<App Link>"
And put user name "<USER>"
And put password "<PASSWORD>"
And click login in button
Then login will be successful with valid credential
Then close the browser when test finish

 Examples:
      | App Link | USER  | PASSWORD|
      | URL | user  | password|
      | URL | user2 | password2|
