package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static appium.core.DriverFactory.getAndroidDriver;
import static appium.core.DriverFactory.quitDriver;

@RunWith( Cucumber.class )
@CucumberOptions(
        features = "src/test/resources/features",
        glue = { "stepDefinitions" },
        tags =
                "@challengeBuilders",
        plugin = { "pretty", "html:target/cucumber/cucumber.html" },
        publish = true,
        monochrome = true,
        dryRun = false
)
public class RunCucumberTest {

        @BeforeClass
        public static void init() {
                getAndroidDriver();
        }

        @AfterClass
        public static void quit(){
                quitDriver();
        }

}
