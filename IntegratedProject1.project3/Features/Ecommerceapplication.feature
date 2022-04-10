Feature: Ecommerceapplication Feature
Scenario: signin to the application
Given Open browser
And Open Url "https://www.saucedemo.com/"
When Enter username "Hari"
And Enter password "srihari!@#$123"
And Print message for successfull signin