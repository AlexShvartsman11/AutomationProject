package automation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DarkSkySD extends DriverWrapper {

    PageElements locator = new PageElements ();

   @Given("^I am on Darksky website homepage$")
public void iAmOnDarkskyWebsiteHomepage() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
       initializeWebDriver("http:/darksky.com");
       locator.readHours();


}


}
