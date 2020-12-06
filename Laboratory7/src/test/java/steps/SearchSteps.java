package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.GooglePage;

import static org.junit.Assert.assertTrue;

public class SearchSteps {
    GooglePage googlePage;

    @When("I open google website")
    public void i_open_google_website() {
        googlePage = new GooglePage();
    }

    @And("I search for computer")
    public void i_search_for_computer() {
        googlePage.writeInSearchBar("computer");
    }

    @Then("Header should exits")
    public void validate_that_the_Facebook_age_is_opened() {
        assertTrue("Header is displayed", googlePage.isHeaderDisplayed());
    }
}
