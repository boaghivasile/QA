package steps.shoppingCard.verifyingQuantity;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;

import static org.junit.Assert.assertTrue;

public class VerifyingQuantitySteps {
    HomePage homePage;

    @Given("The website is open")
    public void the_website_is_open() { homePage = new HomePage(); }

    @When("AddToCard button is pressed twice on the same item")
    public void addToCard_button_is_pressed_twice_on_the_same_item() {
        homePage.clickOnAddToCardButton();
        homePage.clickOnAddToCardButton();
    }

    @Then("The newly added item should have quantity as two")
    public void the_newly_added_item_should_have_quantity_as_two() {
        assertTrue("User was not redirected", homePage.isQuantityCorresponding());
    }
}
