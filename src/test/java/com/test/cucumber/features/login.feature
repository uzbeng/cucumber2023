Feature: Login to application

  Scenario: Valid user login
    Given User opens chrome browser
    And User opens url "https://www.saucedemo.com/"
    When User inserts username "standard_user"
    And User inserts password "secret_sauce"
    And User clicks login button
    Then User successfully logs in and home page is displayed
    
  Scenario: Invalid user login
    Given User opens chrome browser
    And User opens url "https://www.saucedemo.com/"
    When User inserts username "xyz"
    And User inserts password "secret_sauce"
    And User clicks login button
    Then Error message is displayed


