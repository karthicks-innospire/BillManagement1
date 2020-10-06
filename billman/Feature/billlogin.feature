Feature: To Test Functional Testing For BillManagement Application

  Scenario: Login in Application
    Given The user enter into the BillManagent URI
    When The user Enter the Login Credentials
    Then The user click on login button

  Scenario: Scan and upload of bills
    Given	  The user already login application and in Bills/Invoice list page

    When The user  click on add button on Bill/Invoice list page
    Then The application views upload bills/Invoice page
    And The user need to Select the particular bill to upload by clicking browse option or Drag and Drop or OCR
    And user need to fill in the vendor and account details and click save

  Scenario: UploadBill Edit For Correction
    Given: user already login bills/Invoice list upload particular bill

    When user click edit option in bill/invoice page
    Then user change the bill information
    And user save the changed bill details

  Scenario: Filling up the details of Bills/Invoice
    Given The user already logged into the application and in upload bills/Invoice page
    When the user need to view the bills/Invoice of the vendor
    Then need to click on the view option in the action of bill list and can able to Print or Download the file
    Given The user already logged into the application and in upload bills/Invoice page
    When the user need to split the amount
    Then need to click on the checkbox split this amount to split the amount of the bill

  Scenario: Actions in the bills/Invoice
    
    Given:The user already created a bill and saved

    When the user need to view the bill
    Then on clicking view option,it displays the bills with information
    Given The user already created a bill and saved
    When the user need to edit the bill
    Then the user need to click on the edit option in the bills list and, by clicking on it displays the bills with information and the user now can able to edit the informations related to the bills and to finally click the save option to update the changes
    Given The user already created a bill and saved
    When the user need to comment on the bill
    Then the user need to click on the edit option in the bills list and it shows the comment option and the user by clicking on it can able to comment on the bill from the list
    Given The user already created a bill and saved
    When the user need to save the bills/Invoice as a draft
    Then user need to click on the save as Draft option and the Bills/Invoice gets saved as the draft
    Given The user already created a bill and saved
    When the user need to delete the bill
    Then the user need to click on the delete option in the bills list and the user by clicking on it can able to delete the bill from the list
