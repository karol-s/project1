$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/buyProductTest.feature");
formatter.feature({
  "name": "Buy product",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Buy product in shop",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is logged in to CodersLab shop",
  "keyword": "Given "
});
formatter.step({
  "name": "User goes to main page",
  "keyword": "When "
});
formatter.step({
  "name": "User chooses \u003cone product\u003e from products",
  "keyword": "And "
});
formatter.step({
  "name": "Check discount is equals to \u003cSAVE howManyProcent\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User chooses \u003cpreffered\u003e size",
  "keyword": "And "
});
formatter.step({
  "name": "User chooses \u003cquantity\u003e pieces",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks submit",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "one product",
        "SAVE howManyProcent",
        "preffered",
        "quantity"
      ]
    },
    {
      "cells": [
        "Hummingbird Printed T-shirt",
        "SAVE 20%",
        "L",
        "3"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Buy product in shop",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is logged in to CodersLab shop",
  "keyword": "Given "
});
formatter.match({
  "location": "BuyProductTest.userIsLoggedInToCodersLabShop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User goes to main page",
  "keyword": "When "
});
formatter.match({
  "location": "BuyProductTest.userGoesToMainPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User chooses Hummingbird Printed T-shirt from products",
  "keyword": "And "
});
formatter.match({
  "location": "BuyProductTest.userChoosesOneProductFromProducts(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check discount is equals to SAVE 20%",
  "keyword": "And "
});
formatter.match({
  "location": "BuyProductTest.checkDiscountIsEqualsToHowManyProcent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User chooses L size",
  "keyword": "And "
});
formatter.match({
  "location": "BuyProductTest.userChoosesMSize(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User chooses 3 pieces",
  "keyword": "And "
});
formatter.match({
  "location": "BuyProductTest.userChoosesHowManyPieces(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks submit",
  "keyword": "And "
});
formatter.match({
  "location": "BuyProductTest.userClicksSubmit()"
});
formatter.result({
  "status": "passed"
});
});