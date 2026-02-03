from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select
import time

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/popups")
    print(driver.title)
    e1=driver.find_element(By.XPATH,"//button[@id='launcher']")
    e1.click()
    username=driver.find_element(By.XPATH,"//input[@type='text']")
    username.send_keys('admin')
    time.sleep(2)
    
    pwd=driver.find_element(By.XPATH,"//input[@type='password']")
    pwd.send_keys('password')
    time.sleep(2)
    
    btn=driver.find_element(By.XPATH,"//button[@class='svelte-1pdjkmx']")
    btn.click()
    time.sleep(2)
    
    h=driver.find_element(By.XPATH,"//h1[@class='text-center font-display text-6xl font-bold text-emerald-500']")
    print(h.text)
    
    time.sleep(2)
    
    driver.quit()
    