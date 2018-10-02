$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Creating Proposal in FMO",
  "description": "",
  "id": "creating-proposal-in-fmo",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Create a new proposal in FMO for Customer type PI.",
  "description": "",
  "id": "creating-proposal-in-fmo;create-a-new-proposal-in-fmo-for-customer-type-pi.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter user name and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enter new proposal option",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User accept DPA Agreement",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User enter all mandatory answers",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User save the form",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User create a quote",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User submit the proposal",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User goto Update screen",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User verify the document",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User Activate the Proposal",
  "keyword": "Then "
});
formatter.match({
  "location": "homeStepdefinition.User_open_browser()"
});
formatter.result({
  "duration": 6685622300,
  "status": "passed"
});
formatter.match({
  "location": "homeStepdefinition.User_enter_user_name_and_password()"
});
formatter.result({
  "duration": 290584400,
  "status": "passed"
});
formatter.match({
  "location": "homeStepdefinition.user_enter_new_proposal_option()"
});
formatter.result({
  "duration": 1891967100,
  "status": "passed"
});
formatter.match({
  "location": "homeStepdefinition.user_accept_DPA_Agreement()"
});
formatter.result({
  "duration": 8084332700,
  "status": "passed"
});
formatter.match({
  "location": "homeStepdefinition.user_enter_all_mandatory_answers()"
});
formatter.result({
  "duration": 37174474000,
  "status": "passed"
});
formatter.match({
  "location": "homeStepdefinition.user_save_the_form()"
});
formatter.result({
  "duration": 168200200,
  "status": "passed"
});
formatter.match({
  "location": "homeStepdefinition.User_create_a_quote()"
});
formatter.result({
  "duration": 52399242800,
  "status": "passed"
});
formatter.match({
  "location": "homeStepdefinition.User_submit_the_proposal()"
});
formatter.result({
  "duration": 40955939300,
  "status": "passed"
});
formatter.match({
  "location": "homeStepdefinition.User_goto_Update_screen()"
});
formatter.result({
  "duration": 24186258300,
  "status": "passed"
});
formatter.match({
  "location": "homeStepdefinition.User_verify_the_document()"
});
formatter.result({
  "duration": 170649454800,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element is not clickable at point (999, 876)\n  (Session info: chrome\u003d69.0.3497.100)\n  (Driver info: chromedriver\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027MKNB798\u0027, ip: \u002710.0.75.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91), userDataDir\u003dC:\\Users\\PSRIVA~1\\AppData\\Local\\Temp\\scoped_dir20288_27196}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d69.0.3497.100, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: d17adc3ed2bcd2e80284636ea09bd236\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:275)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:82)\r\n\tat pageObject.document.upload(document.java:162)\r\n\tat stepDefinition.homeStepdefinition.User_verify_the_document(homeStepdefinition.java:160)\r\n\tat ✽.Then User verify the document(test.feature:14)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "homeStepdefinition.User_Activate_the_Proposal()"
});
formatter.result({
  "status": "skipped"
});
});