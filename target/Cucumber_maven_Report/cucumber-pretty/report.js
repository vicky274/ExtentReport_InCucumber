$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ChromeLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Demo Site Form Filling-Chrome",
  "description": "",
  "id": "demo-site-form-filling-chrome",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2476700,
  "status": "passed"
});
formatter.before({
  "duration": 240100,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Chrome user is on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition_Chrome.chrome_user_is_on_Login_Page()"
});
formatter.result({
  "duration": 29401801800,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Demo Site Form Filling Test Scenario",
  "description": "",
  "id": "demo-site-form-filling-chrome;demo-site-form-filling-test-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@chrome"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user quit the Chrome browser",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition_Chrome.user_quit_the_Chrome_browser()"
});
formatter.result({
  "duration": 5324792000,
  "status": "passed"
});
formatter.after({
  "duration": 144300,
  "status": "passed"
});
formatter.uri("FirefoxLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Demo Site Form Filling-Firefox",
  "description": "",
  "id": "demo-site-form-filling-firefox",
  "keyword": "Feature"
});
formatter.before({
  "duration": 113100,
  "status": "passed"
});
formatter.before({
  "duration": 73600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Firefox user is already on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition_Firefox.firefox_user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 17154773200,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot determine loading status\nfrom disconnected: received Inspector.detached event\n  (Session info: chrome\u003d83.0.4103.116)\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-B0O3T20\u0027, ip: \u0027192.168.43.63\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\DELL\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:58090}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 7574af77a7e5c623534ae76ff6b1ad3d\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:273)\r\n\tat ExtentManager.Driverhandle.setup(Driverhandle.java:63)\r\n\tat stepDefinitions.LoginStepDefinition_Firefox.firefox_user_is_already_on_Login_Page(LoginStepDefinition_Firefox.java:26)\r\n\tat ✽.Given Firefox user is already on Login Page(FirefoxLogin.feature:4)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 7,
  "name": "Demo Site Form Filling Test Scenario",
  "description": "",
  "id": "demo-site-form-filling-firefox;demo-site-form-filling-test-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@firefox"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Firefox user enters first name data in first name field in firefox",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Firefox user enters Lastname data in last name field in firefox",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Firefox user selects State  in State field in firefox",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Firefox user clicked on radio button in firefox",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Close the Firefox browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition_Firefox.firefox_user_enters_first_name_data_in_first_name_field_in_firefox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition_Firefox.firefox_user_enters_Lastname_data_in_last_name_field_in_firefox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition_Firefox.firefox_user_selects_State_in_State_field_in_firefox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition_Firefox.firefox_user_clicked_on_radio_button_in_firefox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition_Firefox.close_the_Firefox_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 104800,
  "status": "passed"
});
});