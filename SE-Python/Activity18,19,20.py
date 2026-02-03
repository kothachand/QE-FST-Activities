from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select
import time

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/alerts")
    print(driver.title)
    e1=driver.find_element(By.XPATH,"//button[@id='simple']")
    e1.click()
    time.sleep(2)
    alert=driver.switch_to.alert
    time.sleep(2)
    print(alert.text)
    alert.accept()
    
    '''Activity 19'''
    e2=driver.find_element(By.XPATH,"//button[@id='confirmation']")
    e2.click()
    time.sleep(2)
    alert2=driver.switch_to.alert
    time.sleep(2)
    print(alert2.text)
    alert2.accept()
    time.sleep(2)
    
    e3=driver.find_element(By.XPATH,"//button[@id='confirmation']")
    e3.click()
    time.sleep(2)
    alert3=driver.switch_to.alert
    alert3.dismiss()
    a=driver.find_element(By.XPATH,"//p[@id='result']")
    print(a.text)
    
    '''Activity 20'''
    e4=driver.find_element(By.XPATH,"//button[@id='prompt']")
    e4.click()
    alert4=driver.switch_to.alert
    alert4.send_keys("Awesome!")
    time.sleep(2)
    print(alert4.text)
    alert4.accept()