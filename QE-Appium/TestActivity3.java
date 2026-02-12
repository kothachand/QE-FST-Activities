package Demos;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class TestActivity3 {
    private AndroidDriver driver;
    private WebDriverWait wait;
     
     @BeforeMethod
     public void setup() throws MalformedURLException, URISyntaxException{
          UiAutomator2Options options = new UiAutomator2Options();
          options.setPlatformName("android");
          options.setAutomationName("UiAutomator2");
          options.setAppActivity(".extensions.GoogleDialtactsActivity");
          options.setAppPackage("com.google.android.dialer");
          options.setNoReset(true);
          options.setFullReset(false);
          options.setCapability("appium:forceAppLaunch", true);
          options.setCapability("appium:shouldTerminateApp", true);

          URL serverURL = new URI("http://127.0.0.1:4723").toURL();
          driver=new AndroidDriver(serverURL, options);
          wait=new WebDriverWait(driver, Duration.ofSeconds(20));
     }
    @Test(priority = 0)
    public void test(){
        driver.findElement(AppiumBy.accessibilityId("key pad")).click();
        driver.findElement(AppiumBy.id("nine")).click();
        driver.findElement(AppiumBy.id("nine")).click();
        driver.findElement(AppiumBy.id("nine")).click();
        driver.findElement(AppiumBy.id("zero")).click();
        driver.findElement(AppiumBy.id("five")).click();
        driver.findElement(AppiumBy.id("zero")).click();
        driver.findElement(AppiumBy.id("four")).click();
        driver.findElement(AppiumBy.id("eight")).click();
        driver.findElement(AppiumBy.id("eight")).click();
        driver.findElement(AppiumBy.id("zero")).click();
 
        WebElement create=driver.findElement(AppiumBy.xpath("//android.support.v7.widget.RecyclerView[@resource-id=\"com.google.android.dialer:id/search_recycler_view\"]/android.widget.FrameLayout[1]"));
        create.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.google.android.contacts:id/editorlite_screen_compose_view\"]/android.view.View")));
          
         
        WebElement first=driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"First name\"]"));
        
        
        first.sendKeys("Gopii");

        WebElement last=driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Last name\"]"));
        last.sendKeys("Kothaa");

        WebElement save=driver.findElement(AppiumBy.xpath("\t\r\n" + "//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.google.android.contacts:id/editorlite_screen_compose_view\"]/android.view.View/android.view.View[2]/android.view.View/android.widget.Button"));
        save.click();

         


    }
    @Test(priority = 2)
    public void assertt(){
        WebElement cont=driver.findElement(AppiumBy.id("com.google.android.dialer:id/navigation_bar_item_active_indicator_view"));
        cont.click();

        WebElement dia=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/contact_name\" and @text=\"Gopii Kothaa\"]"));
       String gopi= dia.getText();

        


        Assert.assertEquals(gopi, "Gopii Kothaa");

    }
    @AfterMethod
    public void wind(){
        driver.quit();
    }
}

