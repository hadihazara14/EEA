$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("addEditDel.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: hadihazara14@Gmail.com"
    }
  ],
  "line": 2,
  "name": "OrangeHRM Test Cases",
  "description": "",
  "id": "orangehrm-test-cases",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5954677661,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I logged into OrangeHRM with \"Admin\" and \"admin123\" and click loginButton",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on PIM also I click on Reports",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 30
    },
    {
      "val": "admin123",
      "offset": 42
    }
  ],
  "location": "addEditDelSteps.i_logged_into_OrangeHRM_with_and_and_click_loginButton(String,String)"
});
formatter.result({
  "duration": 11383520365,
  "status": "passed"
});
formatter.match({
  "location": "addEditDelSteps.i_click_on_PIM_also_I_click_on_Reports()"
});
formatter.result({
  "duration": 2183170291,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 23,
      "value": "#\t\tThen Validate Report Name appears"
    }
  ],
  "line": 27,
  "name": "Edit",
  "description": "",
  "id": "orangehrm-test-cases;edit",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@tag"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "I click Edit on existing Report from the previous entry \"my report\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Select Selection Criteria to Age group \"Age Group\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Add Age group",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "specify the age group \"Greater Than\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Select Selection Criteria to Location \"Location\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Add Location",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Select the location from the default menu \"    New York Sales Office\"",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Verify Display Field Groups Personal is selected \"Personal \"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Select Display Fields to Employee Id \"Employee Id\"",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Add Employee Id",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Check the box for Display Fields",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Click Save",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "my report",
      "offset": 57
    }
  ],
  "location": "addEditDelSteps.i_click_Edit_on_existing_Report_from_the_previous_entry(String)"
});
formatter.result({
  "duration": 2141561,
  "error_message": "java.lang.NullPointerException\r\n\tat com.syntax.stepDefinitions.addEditDelSteps.i_click_Edit_on_existing_Report_from_the_previous_entry(addEditDelSteps.java:146)\r\n\tat ✽.And I click Edit on existing Report from the previous entry \"my report\"(addEditDel.feature:28)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Age Group",
      "offset": 40
    }
  ],
  "location": "addEditDelSteps.select_Selection_Criteria_to_Age_group(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "addEditDelSteps.add_Age_group()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Greater Than",
      "offset": 23
    }
  ],
  "location": "addEditDelSteps.specify_the_age_group(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Location",
      "offset": 39
    }
  ],
  "location": "addEditDelSteps.select_Selection_Criteria_to_Location(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "addEditDelSteps.add_Location()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "    New York Sales Office",
      "offset": 43
    }
  ],
  "location": "addEditDelSteps.select_the_location_from_the_default_menu(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Personal ",
      "offset": 50
    }
  ],
  "location": "addEditDelSteps.verify_Display_Field_Groups_Personal_is_selected(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Employee Id",
      "offset": 38
    }
  ],
  "location": "addEditDelSteps.select_Display_Fields_to_Employee_Id(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "addEditDelSteps.add_Employee_Id()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "addEditDelSteps.check_the_box_for_Display_Fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "addEditDelSteps.click_Save()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 69398,
  "status": "passed"
});
});