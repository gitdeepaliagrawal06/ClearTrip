$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Home.feature");
formatter.feature({
  "name": "HomeFeature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add a product to watchlist",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@P2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on IMDB home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_am_on_imdb_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on signin option",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_click_on_signin_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter username",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.enter_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on signin button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.click_signbutton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search \"Road House\" in the search box",
  "keyword": "And "
});
formatter.match({
  "location": "HomeSteps.i_search_in_the_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \"Road House\" from the search result",
  "keyword": "And "
});
formatter.match({
  "location": "HomeSteps.i_click_from_the_search_result(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add \"Road House\" to watchlist",
  "keyword": "And "
});
formatter.match({
  "location": "HomeSteps.i_add_to_watchlist(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[text()\u003d\"Add to Watchlist\"]\"}\n  (Session info: chrome\u003d122.0.6261.112)\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception\nBuild info: version: \u00274.11.0\u0027, revision: \u0027040bc5406b\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002718.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [027ff4abe5802dffd2b0b99f51e40ffb, findElement {using\u003dxpath, value\u003d//div[text()\u003d\"Add to Watchlist\"]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 122.0.6261.112, chrome: {chromedriverVersion: 122.0.6261.111 (9d4c1072da6..., userDataDir: C:\\Users\\DELL\\AppData\\Local...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:50698}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:50698/devtoo..., se:cdpVersion: 122.0.6261.112, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 027ff4abe5802dffd2b0b99f51e40ffb\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:67)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:483)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:196)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:171)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:518)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:349)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:68)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy21.isEnabled(Unknown Source)\r\n\tat pages.HomePage.addOutputInWatchList(HomePage.java:75)\r\n\tat steps.HomeSteps.i_add_to_watchlist(HomeSteps.java:42)\r\n\tat ✽.I add \"Road House\" to watchlist(src/test/java/features/Home.feature:22)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I navigate to \"Watchlist\" option",
  "keyword": "And "
});
formatter.match({
  "location": "HomeSteps.navigate_to(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should be able to view \"Road House\" in my watchlist",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeSteps.verify_item(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});