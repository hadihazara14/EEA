#Author: hadihazara14@Gmail.com
Feature: OrangeHRM Test Cases

  Background: 
    Given I logged into OrangeHRM with "Admin" and "admin123" and click loginButton
    When I click on PIM also I click on Reports

  Scenario: Add, Edit, Delete
    And I click add
    And I enter Report Name "my report"
    And Select Selection Criteria to Sub Unit "Sub Unit"
    And Add Sub Unit
    And Select Selection Criteria to Job Title "Job Title"
    And Add Job Title
    And Select Selection Criteria to Employee Name "Employee Name"
    And Add Employee Name
    And Enter Employee Name "Hannah Flores" that matches the default employee
    Then Verify Display Field Groups Personal is selected
    And Select Display Fields to Employee Id "Employee Id"
    And Add Employee Id
    And Check the box for Display Fields
    Then Click Save

  		Then Validate Report Name appears
  Scenario: Edit
    And I click Edit on existing Report from the previous entry "my report"
    And Select Selection Criteria to Age group "Age Group"
    And Add Age group
    And specify the age group "Greater Than"
    And Select Selection Criteria to Location "Location"
    And Add Location
    And Select the location from the default menu "    New York Sales Office"
    And Verify Display Field Groups Personal is selected "Personal "
    And Select Display Fields to Employee Middle Named "Employee Middle Name"
    And Add Employee Middle Name
    And Check the box for Display Fields
    And Click Save

Scenario: Delete

    And Select the Check Box for the edited Report Name from "my report"
		Then Click Delete
		And click Ok
		Then Verify Report Name does not Exist