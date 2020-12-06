package steps.shoppingCard;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;

import static org.junit.Assert.assertTrue;

public class AddingToShoppingCardSteps {
    HomePage homePage;

    @Given("The website is opened")
    public void the_website_is_opened() { homePage = new HomePage(); }

    @When("AddToCard button is pressed on a item")
    public void addToCard_button_is_pressed_on_a_item() { homePage.clickOnAddToCardButton();}

    @Then("Shopping card pop-up should appear")
    public void shopping_card_pop_up_should_appear() {
        assertTrue("Shopping Card pop-up is displayed", homePage.isShoppingCardPopUpDisplayed());
    }
}
