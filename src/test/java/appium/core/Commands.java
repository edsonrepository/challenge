package appium.core;

import org.openqa.selenium.WebElement;

import static appium.core.DriverFactory.getAndroidDriver;

public class Commands {

    public void clickOnAccessibilityId( String field ) {
        getAndroidDriver().findElementByAccessibilityId( field ).click();
    }

    public void sendKeysOnField( String keys, String field ) {
        WebElement webElement = getAndroidDriver().findElementByAccessibilityId( field );
        webElement.sendKeys( keys );
    }
    public boolean isVisibleByValue( String value ) {
        return getAndroidDriver().findElementByAccessibilityId( value ).isEnabled();
    }

}