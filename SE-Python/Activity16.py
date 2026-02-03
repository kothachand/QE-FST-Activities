from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select
import time

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/selects")
    print(driver.title)
    dropdown=Select(driver.find_element(By.XPATH,"//select[@class='h-10 w-64 rounded-lg border-2 border-black bg-purple-200 px-3 shadow-md transition hover:shadow-lg']"))
    dropdown.select_by_visible_text("Two")
    time.sleep(2)
    dropdown=Select(driver.find_element(By.XPATH,"//select[@class='h-10 w-64 rounded-lg border-2 border-black bg-purple-200 px-3 shadow-md transition hover:shadow-lg']"))
    dropdown.select_by_visible_text("Three")
    time.sleep(2)
    dropdown=Select(driver.find_element(By.XPATH,"//select[@class='h-10 w-64 rounded-lg border-2 border-black bg-purple-200 px-3 shadow-md transition hover:shadow-lg']"))
    dropdown.select_by_visible_text("Four")
    time.sleep(2)
    options=dropdown.options
    for opt in options:
        print(opt.text)
    