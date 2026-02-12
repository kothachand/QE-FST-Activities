package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity2 {
    WebDriver driver;
    @BeforeClass
    public  void setup(){
         driver =new FirefoxDriver();
         driver.get("https://training-support.net/webelements/target-practice");
    }

    @Test
    public void test1(){
       System.out.println(driver.getTitle());
    }

    @Test
    public void test2(){
        WebElement button =driver.findElement(By.xpath("//button[@id='black']"));
        Assert.assertTrue(button.isDisplayed());
    }

    @Test(enabled=false)
    public void test3(){
          System.out.println("this will not run");
    }

    @Test
    public void test4() throws SkipException {
        String s="gopi";
        if(s.equals("gopi")){
            throw new SkipException("this is partially skipped");
        }

    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }
    }

