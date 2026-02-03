from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/mouse-events")
    print(driver.title)
    e1=driver.find_element(By.XPATH,"//button[@class='']").click()
    