package test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/features/QuickView.feature",
            glue = {"steps/quickView"},
            stepNotifications = true
    )
    public class QuickViewButtonRunner {
    }
