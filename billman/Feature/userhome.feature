Feature: To Test Function testing for user homepage

  Scenario: View of User Home
    Given The user already logged into the application and gets landed into homepage
    When the User need to view Homepage
    Then the homepage contains the KPIs of  Total/Approved/Unapproved/Rejected bills and lists of draft bills/Invoice

  Scenario: Actions in User Home
    Given Actions
    When the user need to view the bills/Invoice of the vendor
    Then need to click on the view option in the action of bill list
    When the user need to edit the bills of vendor
    Then need to click on the edit option in the action of bill list
    When the user need to delete the bills of vendor
    Then need to click on the delete option in the action of bill list
    When the user need to followup the bills of vendor
    Then need to click on the followup option in the action of bill list

  Scenario: Resubmission of Rejected Bills/Invoices
    Given resubmission
    When the user need to Resubmit the bills of vendor
    Then need to click on the Resubmit option in the action of bill list

  Scenario: Upload of bills from homepage
    Given upload
    When the user clicks on Upload button on the Homepage
    Then the application displays upload bills/Invoice page and the user need to Select the particular bill to upload by clicking browse option or Drag and drop or OCR option
    And to save the bill to upload in the application
