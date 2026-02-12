package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity3 {
     WebDriver driver;
    @BeforeClass
    public  void setup(){
         driver =new FirefoxDriver();
         driver.get("https://training-support.net/webelements/login-form");
    }

    @Test
    public void test1(){
        WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
        WebElement password=driver.findElement((By.xpath("//input[@type='password']")));
        WebElement button=driver.findElement(By.xpath("//button[@class='svelte-1pdjkmx']"));
        username.sendKeys("admin");
        password.sendKeys("password");
        button.click();
        WebElement a=driver.findElement((By.xpath(("//h1[@class='text-center font-display text-6xl font-bold text-emerald-500']"))));
        System.out.println(a.getText());

    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }

}
