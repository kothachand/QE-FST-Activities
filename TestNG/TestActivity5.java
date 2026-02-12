package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity5 {
    WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public  void setup(){
         driver =new FirefoxDriver();
         driver.get("https://training-support.net/webelements/target-practice");
    }

    @Test
    public void test1(){
        String title = driver.getTitle();
        Assert.assertEquals(title, "Selenium: Target Practice");
    }

    @Test (groups={"HeaderTests"})
    public void test2(){
        WebElement header =driver.findElement(By.xpath("//h3[@class='text-3xl font-bold text-orange-600']"));
    }

    @Test (groups={"HeaderTests"})
    public void Test3(){
        WebElement head5=driver.findElement(By.xpath("//h5[text()='Heading #5']"));
        Assert.assertEquals(head5.getCssValue("color"),"rgb(147, 51, 234)");
}

    @Test (groups={"ButtonTests"})
    public void test4(){
         WebElement find=driver.findElement(By.xpath("//button[@class='rounded-xl bg-emerald-200 p-2 text-3xl font-bold text-emerald-900 svelte-2hb4ib']"));
         
}
   @Test (groups={"ButtonTests"})
   public void test5(){
    WebElement find1=driver.findElement(By.xpath("//button[@class='rounded-xl bg-teal-200 p-2 text-3xl font-bold text-teal-900 svelte-2hb4ib']"));
    System.out.println(find1.getCssValue("color"));
    Assert.assertEquals(find1.getCssValue("color"),"rgb(19, 78, 74)");
   }

    @AfterClass(alwaysRun = true)
    public void teardown(){
        driver.quit();
}
}

