package Demos;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class TestActivity1 {
     private AndroidDriver driver;
     
     @BeforeClass
     public void setup() throws MalformedURLException, URISyntaxException{
          UiAutomator2Options options = new UiAutomator2Options();
          options.setPlatformName("android");
          options.setAutomationName("UiAutomator2");
          options.setApp("C:\\Users\\KothaGopiChand\\Desktop\\QE-Appium\\qe-appium\\src\\test\\resources\\Calculator.apk");
          options.setNoReset(true);
          options.setFullReset(false);
          options.setCapability("appium:forceAppLaunch", true);
          options.setCapability("appium:shouldTerminateApp", true);

          URL serverURL = new URI("http://127.0.0.1:4723").toURL();
          driver=new AndroidDriver(serverURL, options);
     }

     @Test
     public void multipltTest(){
        driver.findElement(AppiumBy.id("digit_4")).click();
        driver.findElement(AppiumBy.accessibilityId("multiply")).click();
        driver.findElement(AppiumBy.accessibilityId("9")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();

        String result = driver.findElement(AppiumBy.id("result_final")).getText();
        Assert.assertEquals(result,"36");
     }

     @AfterClass
     public void teardown(){
        driver.quit();
     }
}

