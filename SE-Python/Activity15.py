from selenium import webdriver
from selenium.webdriver.common.by import By
import time

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-attributes")
    print(driver.title)
    e1=driver.find_element(By.XPATH,"//input[@placeholder='Full name']").send_keys('admin')
    time.sleep(2)
    e2=driver.find_element(By.XPATH,"//input[@placeholder='Email Address']").send_keys('gopi123@gmail.com')
    time.sleep(2)
    dat=driver.find_element(By.XPATH,"//input[contains(@name,'-event-date-')]").send_keys('2003-07-06')
    time.sleep(2)
    details=driver.find_element(By.XPATH,"//textarea[@class='focus:ring-0 svelte-7bqce9']")
    details.send_keys('gopi')
    time.sleep(2)
    sub=driver.find_element(By.XPATH,"//button[@class='font-bold svelte-7bqce9']")
    sub.click()
    time.sleep(2)
    res=driver.find_element(By.XPATH,"//h3[@id='action-confirmation']")
    print(res.text)
    time.sleep(2)
    driver.quit()