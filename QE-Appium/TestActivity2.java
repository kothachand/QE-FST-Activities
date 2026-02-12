package Demos;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class TestActivity2 {
     private AndroidDriver driver;
     
     @BeforeClass
     public void setup() throws MalformedURLException, URISyntaxException{
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setNoReset(true);
        options.setFullReset(false);
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.setCapability("appium:forceAppLaunch", true);
        options.setCapability("appium:shouldTerminateApp", true);

        URL serverURL = new URI("http://127.0.0.1:4723").toURL();
        driver=new AndroidDriver(serverURL, options);
        driver.get("https://training-support.net");
}

    @Test
    public void test(){
        WebElement a=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Training Support\"]"));
        System.out.println(a.getText());
        WebElement clic=driver.findElement(AppiumBy.accessibilityId("About Us"));
        clic.click();
        WebElement tex=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"About Us\"]"));
        System.out.println(tex.getText());
    }

    @AfterClass
    public void test1(){
        driver.quit();
    }

}