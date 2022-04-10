Feature: Patientmanagementsystem Feature
Scenario: signin to the application
Given Open browser
And Open Url "https://demo.openmrs.org/openmrs/referenceapplication/login.page"
When Enter username "Srihari"
And Enter password "srihari!@#$123"
And Print message for accepting username and password
  
