package appium.core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static AndroidDriver< MobileElement > androidDriver;

    public static AndroidDriver< MobileElement > getAndroidDriver() {
        if( androidDriver == null ) {
            createDriver();
        }
        return androidDriver;
    }

    private static void createDriver()  {

        File applicationParentDirectory = new File( "src/test/resources" );
        File app = new File( applicationParentDirectory, "challenge-qa.apk" );

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability( MobileCapabilityType.PLATFORM_NAME, "Android" );
        desiredCapabilities.setCapability( MobileCapabilityType.DEVICE_NAME, "Nexus_6_API_30" );
        desiredCapabilities.setCapability( MobileCapabilityType.APP, app.getAbsolutePath() );
        desiredCapabilities.setCapability( MobileCapabilityType.AUTOMATION_NAME, "UIautomator2" );

        desiredCapabilities.setCapability( "unicodeKeyboard", true );
        desiredCapabilities.setCapability( "resetKeyboard", true );

        try {
            URL remoteURL = new URL( "http://127.0.0.1:4723/wd/hub" );
            androidDriver = new AndroidDriver( remoteURL, desiredCapabilities );
        } catch( MalformedURLException e ) {
            e.printStackTrace();
        }

        androidDriver
                .manage()
                .timeouts()
                .implicitlyWait( 10, TimeUnit.SECONDS );

    }

    public static void quitDriver() {
        if( androidDriver != null ) {
            androidDriver.quit();
            androidDriver = null;
        }
    }

}