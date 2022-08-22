package support;

import appium.core.DriverFactory;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Utils {

    public static File gerarScreenshot( Scenario scenario ) {
        File file = (( TakesScreenshot ) DriverFactory.getAndroidDriver() ).getScreenshotAs( OutputType.FILE );
        try {
            FileUtils.copyFile( file, ( new File( "target/screenshot", scenario.getName() + " - " + scenario.getStatus().toString() + ".png" )));
        } catch( IOException e ) {
            e.printStackTrace();
        }
        return file;
    }

    public static void embedScreenshot( File file, String desc ) {
        Path path = Paths.get( file.getPath() );
        try ( InputStream inputStream = Files.newInputStream( path ) ) {
            Allure.addAttachment( desc, inputStream );
        } catch( IOException e ) {
            e.printStackTrace();
        }
    }

}
