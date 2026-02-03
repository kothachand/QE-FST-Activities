from selenium import webdriver
from selenium.webdriver.common.by import By
import time

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print(driver.title)
    e1=driver.find_element(By.XPATH,"//input[@id='checkbox']")
    toggle=driver.find_element(By.XPATH,"//button[@class='svelte-sfj3o4']")
    toggle.click()
    time.sleep(2)
    toggle.click()
    time.sleep(2)
    e1.click()
    driver.quit()
    
    