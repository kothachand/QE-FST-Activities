package Demos;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestActivity11 {
    @DataProvider(name = "excelData")
    public Iterator<Object[]> getExcelData() throws IOException {
        List<Object[]> data = new ArrayList<>();
        String excelPath = "src/test/resources/input1.xlsx";

        try (FileInputStream fis = new FileInputStream(excelPath)) {
            Workbook workbook = new XSSFWorkbook(fis);

            Sheet sheet = workbook.getSheetAt(0);
            DataFormatter formatter = new DataFormatter();

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if(row == null) continue;
                
                String[] rowData = new String[row.getLastCellNum()];
                for (int j = 0; j < row.getLastCellNum(); j++) {
                    rowData[j] = formatter.formatCellValue(row.getCell(j));
                }
                data.add(rowData);
            }
            workbook.close();
        }
        return data.iterator();
    }

    @Test(dataProvider = "excelData")
    public void verifyUserDetails(String FullName, String Email, String Date, String Details) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/simple-form");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//input[@placeholder='Full name']")).sendKeys(FullName);
        driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys(Email);
        driver.findElement(By.xpath("//input[@name='event-date']")).sendKeys(Date);
        driver.findElement(By.xpath("//textarea[@name='additional-details']")).sendKeys(Details);
        WebElement e1=driver.findElement(By.xpath("//button[@class='font-bold svelte-7bqce9']"));
        e1.click();
        WebElement e2=driver.findElement((By.xpath("//h3[@id='action-confirmation']")));
        System.out.println(e2.getText());
        driver.quit();

    }




}

