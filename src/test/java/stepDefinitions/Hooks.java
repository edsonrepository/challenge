package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import support.Utils;

import java.io.File;

public class Hooks {

    @After
    public void afterSteps( Scenario scenario ) {
        File screenshot = Utils.gerarScreenshot( scenario );
        Utils.embedScreenshot( screenshot, scenario.getName() );
    }

}
