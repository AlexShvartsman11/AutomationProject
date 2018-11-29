$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("darksky.feature");
formatter.feature({
  "line": 2,
  "name": "Darksky timline is displayed in correct format",
  "description": "",
  "id": "darksky-timline-is-displayed-in-correct-format",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Dark-regression"
    }
  ]
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
  "name": "I am on Darksky website homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "DarkSkySD.iAmOnDarkskyWebsiteHomepage()"
});
formatter.result({
  "duration": 7218120348,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "I verify timeline is displayed with two hours incremented",
  "description": "",
  "id": "darksky-timline-is-displayed-in-correct-format;i-verify-timeline-is-displayed-with-two-hours-incremented",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@hotel-search-1"
    }
  ]
});
});