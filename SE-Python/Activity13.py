from selenium import webdriver
from selenium.webdriver.common.by import By
import time

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/tables")
    print(driver.title)
    rows_cols=driver.find_elements(By.XPATH,"//table/thead/tr//th")
    print(len(rows_cols))
    row_cols1=driver.find_elements(By.XPATH,"//table/tbody/tr[3]")
    print(row_cols1)
    rows_cols2=driver.find_elements(By.XPATH,"//table/tbody/tr[2]/td[2]")
    print(rows_cols2)