from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select
import time

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/selects")
    print(driver.title)
    dropdown=Select(driver.find_element(By.XPATH,"//select[@class='h-80 w-64 rounded-lg border-2 border-black bg-purple-200 p-3 shadow-md transition hover:shadow-lg focus:border-2 focus:border-black focus:ring-0']"))
    dropdown.select_by_visible_text("HTML")
    dropdown.select_by_index(4)
    dropdown.select_by_index(5)
    dropdown.select_by_index(6)
    dropdown.select_by_value("nodejs")
    dropdown.deselect_by_index(5)
    options=dropdown.options
    for opt in options:
        print(opt.text)
    