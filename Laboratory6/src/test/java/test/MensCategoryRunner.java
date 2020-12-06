package test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/features/VerifyMenCategory.feature",
            glue = {"steps/mensWear"},
            stepNotifications = true
    )
    public class MensCategoryRunner {
    }
