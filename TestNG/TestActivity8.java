package Demos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity8 {
     WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public  void setup(){
         driver =new FirefoxDriver();
         driver.get("https://training-support.net/webelements/alerts");
    }

    @Test
    public void test1(){
        WebElement simple=driver.findElement(By.xpath("//button[@id='simple']"));
        simple.click();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        }
    @Test
    public void test2(){
        WebElement conform=driver.findElement(By.xpath("//button[@id='confirmation']"));
        conform.click();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }
    
    @Test
    public void test3(){
        WebElement conform=driver.findElement(By.xpath("//button[@id='confirmation']"));
        conform.click();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();
    }

    @Test
    public void test4(){
        WebElement promt=driver.findElement(By.xpath("//button[@id='prompt']"));
        promt.click();
        promt.sendKeys("successfully login");
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }

    @AfterClass
    public void test5(){
        driver.quit();
    }
}
