$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/EditPhoneNumber.feature");
formatter.feature({
  "line": 1,
  "name": "Edit Phone number in Eligibility",
  "description": "I want to use this template for my feature file",
  "id": "edit-phone-number-in-eligibility",
  "keyword": "Feature"
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
  "name": "I navigate to Search page",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Search",
      "offset": 14
    }
  ],
  "location": "StepDefinition.navigate_to_page(String)"
});
formatter.result({
  "duration": 6703347621,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Edit Phone Number",
  "description": "",
  "id": "edit-phone-number-in-eligibility;edit-phone-number",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@sample"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "I enter search criteria using the following",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName"
      ],
      "line": 30
    },
    {
      "cells": [
        "Jon",
        "Miller"
      ],
      "line": 31
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click the Search button",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "I click the \"Fourth\" record from the search results",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I am on the Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I click the Edit link",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "I enter \"6142225555\" in the Home Phone phone field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I enter \"6148884444\" in the Cell Phone phone field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I enter \"6148888888\" in the Work Phone phone field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I click the Save link",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I verify that Home Phone text field has \"(614)222-5555\"",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "I verify that Cell Phone text field has \"(614)888-4444\"",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I verify that Work Phone text field has \"(614)888-8888\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchPageStepDefs.i_enter_search_criteria(DataTable)"
});
formatter.result({
  "duration": 921659217,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search",
      "offset": 12
    }
  ],
  "location": "StepDefinition.click_element(String)"
});
formatter.result({
  "duration": 396866952,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Fourth",
      "offset": 13
    }
  ],
  "location": "SearchPageStepDefs.click_the_record_from_search_results(String)"
});
formatter.result({
  "duration": 7668379534,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Home",
      "offset": 12
    }
  ],
  "location": "StepDefinition.on_the_page(String)"
});
formatter.result({
  "duration": 6038978,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Edit",
      "offset": 12
    }
  ],
  "location": "StepDefinition.click_element(String)"
});
formatter.result({
  "duration": 750652946,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6142225555",
      "offset": 9
    },
    {
      "val": "Home Phone",
      "offset": 28
    }
  ],
  "location": "StepDefinition.enter_value_in_the_phone_field(String,String)"
});
formatter.result({
  "duration": 1885736052,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6148884444",
      "offset": 9
    },
    {
      "val": "Cell Phone",
      "offset": 28
    }
  ],
  "location": "StepDefinition.enter_value_in_the_phone_field(String,String)"
});
formatter.result({
  "duration": 2006881736,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6148888888",
      "offset": 9
    },
    {
      "val": "Work Phone",
      "offset": 28
    }
  ],
  "location": "StepDefinition.enter_value_in_the_phone_field(String,String)"
});
formatter.result({
  "duration": 2007467400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Save",
      "offset": 12
    }
  ],
  "location": "StepDefinition.click_element(String)"
});
formatter.result({
  "duration": 398490474,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Home Phone",
      "offset": 14
    },
    {
      "val": "(614)222-5555",
      "offset": 41
    }
  ],
  "location": "StepDefinition.verify_textbox_has_value(String,String)"
});
formatter.result({
  "duration": 320861531,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cell Phone",
      "offset": 14
    },
    {
      "val": "(614)888-4444",
      "offset": 41
    }
  ],
  "location": "StepDefinition.verify_textbox_has_value(String,String)"
});
formatter.result({
  "duration": 441219158,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Work Phone",
      "offset": 14
    },
    {
      "val": "(614)888-8888",
      "offset": 41
    }
  ],
  "location": "StepDefinition.verify_textbox_has_value(String,String)"
});
formatter.result({
  "duration": 353768855,
  "status": "passed"
});
});