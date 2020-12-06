package steps.quickView;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuickViewSteps {
        HomePage homePage;

        @Given("The website is open")
        public void the_website_is_open() {
            homePage = new HomePage();
        }

        @When("QuickView button is clicked")
        public void quickView_button_is_clicked() {
            homePage.clickOnQuickViewButton();
        }

        @Then("Validate that user was redirected to a new page with short information about the item he clicked")
        public void validate_that_user_was_redirected_to_a_new_page_with_short_information_about_the_item_he_clicked() {
            assertTrue("User was redirected", homePage.isQuickViewPage());
        }
}
