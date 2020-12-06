package test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/features/ShoppingCardClosing.feature",
            glue = {"steps/shoppingCard/closingShoppingCardPopUp"},
            stepNotifications = true
    )
    public class ClosingShoppingCard {
    }
