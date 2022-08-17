package br.com.challenge.builders;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Challenge {

    @Test
    @DisplayName( "Meu primeiro teste" )
    public void deveSomarDoisValores() throws MalformedURLException {

        File applicationParentDirectory = new File( "src/test/resources" );
        File app = new File( applicationParentDirectory, "challenge-qa.apk" );

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability( MobileCapabilityType.DEVICE_NAME, "Nexus_6_API_30" );
        desiredCapabilities.setCapability( MobileCapabilityType.APP, app.getAbsolutePath() );
        desiredCapabilities.setCapability( MobileCapabilityType.AUTOMATION_NAME, "uiautomator2" );

        AndroidDriver androidDriver = new AndroidDriver( new
                URL( "http://127.0.0.1:4723/wd/hub" ),
                desiredCapabilities );

        androidDriver.quit();

    }

}