package steps.shoppingCard.closingShoppingCardPopUp;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;

import static org.junit.Assert.assertTrue;

public class ClosingShoppingCardPopSteps {
    HomePage homePage;

    @Given("The home page is opened")
    public void the_home_page_is_opened() { homePage = new HomePage(); }

    @When("Click on shopping card icon")
    public void click_on_shopping_card_icon() { homePage.clickOnShoppingCardButton(); }

    @And("Click outside the shopping card pop-up")
    public void click_outside_the_shopping_card_pop_up() { homePage.clickOutsideShoppingCardPopUp(); }

    @And("Click on add to card button")
    public void click_on_add_to_card_button() { homePage.clickOnAddToCardButton(); }

    @Then("Shopping card pop-up should appear again")
    public void shopping_card_pop_up_should_appear_again() {
        assertTrue("Shopping Card pop-up is displayed", homePage.isShoppingCardPopUpDisplayed());
    }
}
