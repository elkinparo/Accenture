# elkin.palacios.qa@gmail.com


Feature: as a quality analyst
  I want to test the login flow to the page
  to confirm its correct operation

  @login
  Scenario: fill out the form
    Given  actor enters the page
    When to send information for the login and valite "10" times
    Then I see the make of the car "Kia Soul"