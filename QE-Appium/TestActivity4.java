package Demos;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class TestActivity4 {
    private AndroidDriver driver;
    private WebDriverWait wait;

    public void longPressElement(AppiumBy locator){
    }
     
     @BeforeMethod
     public void setup() throws MalformedURLException, URISyntaxException{
          UiAutomator2Options options = new UiAutomator2Options();
          options.setPlatformName("android");
          options.setAutomationName("UiAutomator2");
          options.setApp("C:\\Users\\KothaGopiChand\\Desktop\\QE-Appium\\qe-appium\\src\\test\\resources\\ts-todo-list-v1.apk");
          options.setAppWaitActivity(".view.MainActivity");
          options.setAppWaitForLaunch(true);
          options.setNoReset(true);
          options.setFullReset(false);
          options.setCapability("appium:forceAppLaunch", true);
          options.setCapability("appium:shouldTerminateApp", true);

          URL serverURL = new URI("http://127.0.0.1:4723").toURL();
          driver=new AndroidDriver(serverURL, options);
          wait=new WebDriverWait(driver, Duration.ofSeconds(20));
}

@Test
public void test1(){
    WebElement plus=driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@resource-id=\"com.app.todolist:id/fab_new_task\"]"));
    plus.click();
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout")));
    WebElement name=driver.findElement(AppiumBy.id("com.app.todolist:id/et_new_task_name"));
    name.sendKeys("Gopi Chand");

    WebElement desc=driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.app.todolist:id/et_new_task_description\"]"));
    desc.sendKeys("he is tester");

    WebElement priority= driver.findElement(AppiumBy.id("com.app.todolist:id/tv_new_task_priority"));
    priority.click();

    WebElement high=driver.findElement(AppiumBy.xpath("//android.widget.ListView[@resource-id=\"android:id/select_dialog_listview\"]/android.widget.LinearLayout[1]"));
    high.click();

    WebElement ok=driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.app.todolist:id/bt_new_task_ok\"]"));
    ok.click();
}

@Test
public void test2(){
    WebElement plus1=driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@resource-id=\"com.app.todolist:id/fab_new_task\"]"));
    plus1.click();
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout")));
    WebElement name1=driver.findElement(AppiumBy.id("com.app.todolist:id/et_new_task_name"));
    name1.sendKeys("Kotha Gopi Chand");

    WebElement desc=driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.app.todolist:id/et_new_task_description\"]"));
    desc.sendKeys("he is developer");

    WebElement priority= driver.findElement(AppiumBy.id("com.app.todolist:id/tv_new_task_priority"));
    priority.click();

    WebElement medium=driver.findElement(AppiumBy.xpath("//android.widget.ListView[@resource-id=\"android:id/select_dialog_listview\"]/android.widget.LinearLayout[2]"));
    medium.click();

    WebElement ok=driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.app.todolist:id/bt_new_task_ok\"]"));
    ok.click();


    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout")));
    driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@resource-id=\"com.app.todolist:id/fab_new_task\"]")).click();
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout")));
    driver.findElement(AppiumBy.id("com.app.todolist:id/et_new_task_name")).sendKeys("chand");
    driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.app.todolist:id/et_new_task_description\"]")).sendKeys("he is developer");
    driver.findElement(AppiumBy.id("com.app.todolist:id/tv_new_task_priority")).click();
    driver.findElement(AppiumBy.xpath("//android.widget.ListView[@resource-id=\"android:id/select_dialog_listview\"]/android.widget.LinearLayout[3]")).click();
    driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.app.todolist:id/bt_new_task_ok\"]")).click();
}

@Test
public void test3(){
        WebElement element = driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout[@resource-id=\"com.app.todolist:id/rl_exlv_task_group_root\"])[1]"));
        Point location = element.getLocation();
        Dimension size = element.getSize();
        Point center = new Point(location.x + size.width / 2, location.y + size.height / 2);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence longPress = new Sequence(finger, 1);

        longPress.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), center.x, center.y));
        longPress.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        longPress.addAction(new Pause(finger, Duration.ofSeconds(2)));
        longPress.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(longPress));

        driver.findElement(AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id=\"android:id/content\"])[1]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.app.todolist:id/tv_todo_list_deadline\"]")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.LinearLayout[@resource-id=\"android:id/date_picker_header\"]/android.widget.LinearLayout")));
        driver.findElement(AppiumBy.accessibilityId("14 February 2026"));
        driver.findElement(AppiumBy.id("com.app.todolist:id/bt_deadline_ok")).click();
        driver.findElement(AppiumBy.id("com.app.todolist:id/bt_new_task_ok")).click();
}
@Test
public void test4(){
    driver.findElement(AppiumBy.xpath("(//android.widget.CheckBox[@resource-id=\"com.app.todolist:id/cb_task_done\"])[1]")).click();
        driver.findElement(AppiumBy.xpath("(//android.widget.CheckBox[@resource-id=\"com.app.todolist:id/cb_task_done\"])[2]")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout[@resource-id=\"com.app.todolist:id/rl_exlv_task_group_root\"])[1]"));
        Point location = element.getLocation();
        Dimension size = element.getSize();
        Point center = new Point(location.x + size.width / 2, location.y + size.height / 2);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence longPress = new Sequence(finger, 1);

        longPress.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), center.x, center.y));
        longPress.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        longPress.addAction(new Pause(finger, Duration.ofSeconds(2)));
        longPress.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(longPress));

        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Edit To-Do Task\"]")).click();
        driver.findElement(AppiumBy.id("com.app.todolist:id/sb_new_task_progress")).click();

        driver.findElement(AppiumBy.id("bt_new_task_ok")).click();
}
}
