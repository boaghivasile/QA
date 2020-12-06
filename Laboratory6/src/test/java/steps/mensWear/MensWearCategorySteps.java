package steps.mensWear;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;

import static org.junit.Assert.assertTrue;

public class MensWearCategorySteps {
    HomePage homePage;

    @Given("The website is opened")
    public void the_website_is_opened() { homePage = new HomePage(); }

    @When("Click on MEN's WEAR category")
    public void click_one_mens_wear_category() { homePage.clickOnMensWearButton(); }

    @And("Click on MEN's Clothing")
    public void click_on_mens_clothing() { homePage.clickOnMensClothingButton(); }

    @Then("New page with men's clothing should be displayed")
    public void new_page_with_mens_clothing_should_be_displayed() {
        assertTrue("Page with men's clothing is displayed", homePage.isMensClothingPageDisplayed());
    }

    @When("Click on MEN's Wear Category again")
    public void click_on_mens_wear_category_again() { homePage.clickOnMensWearButton(); }

    @And("Click on MEN's Accessories")
    public void click_on_mens_accessories() { homePage.clickOnMensAccessoriesButton(); }

    @Then("New page with men's accessories should be displayed")
    public void new_page_with_mens_accessories_should_be_displayed() {
        assertTrue("Page with men's clothing is displayed", homePage.isMensAccessoriesPageDisplayed());
    }
}
