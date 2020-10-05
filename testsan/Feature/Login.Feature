Feature: Testing Google & Gmail Functional Testing

  Scenario: Enter In to Google Page
    Given User enter in the url "https://www.google.com"
    And User validate url title and url
    When user select gmail link
    Then user landed into gmail page
