from selenium import webdriver
from selenium.webdriver.common.by import By
import time

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/tables")
    print(driver.title)
    rows_cols=driver.find_elements(By.XPATH,"//table/thead/tr//th")
    print(len(rows_cols))
    rows_cols1=driver.find_element(By.XPATH,"//table/tbody/tr[5]/td[2]")
    print(rows_cols1.text)
    rows_cols2=driver.find_element(By.XPATH,"//th[@data-svelte-h='svelte-18koz4z']").click()
    rows_col=driver.find_element(By.XPATH,"//table/tbody/tr[5]/td[2]")
    print(rows_col.text)