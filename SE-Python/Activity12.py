from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

import time

with webdriver.Firefox() as driver:
    wait=WebDriverWait(driver,30)
    driver.get("https://training-support.net/webelements/dynamic-content")
    print(driver.title)
    click_me=driver.find_element(By.XPATH,"//button[@id='genButton']")
    click_me.click()
    wait.until(EC.text_to_be_present_in_element((By.ID, "word"), "release"))
    txt=driver.find_element(By.XPATH,"//h2[@id='word']")
    print(txt)
    driver.quit()