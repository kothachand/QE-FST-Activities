package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity {
    WebDriver driver;
    @BeforeClass
    public  void setup(){
         driver =new FirefoxDriver();
         driver.get("https://training-support.net");
    }
    @Test
    public void test1(){
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Training Support");

    }

    @Test
    public void test2(){
        WebElement button = driver.findElement(By.linkText("About Us"));
        Assert.assertTrue(button.isDisplayed());
        button.click();
    }
    @AfterClass
    public void test3(){
        driver.quit();
    }

}
