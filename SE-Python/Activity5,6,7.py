from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print(driver.title)
    print("Activity-5")
    e1=driver.find_element(By.XPATH,"//input[@id='checkbox']")
    print(f"Is the checkbox visible?{bool(e1.is_displayed())}")
    e2=driver.find_element(By.XPATH,"//button[@class='svelte-sfj3o4']")
    e2.click()
    print(f"Is the checkbox visible?{e1.is_displayed()}")
    e2.click()
    print("Activity-6")
    print(f"Is the checkbox selected?{bool(e1.is_selected())}")
    e1.click()
    print(f"Is the checkbox selected?{bool(e1.is_selected())}")
    print("Activity-7")
    e1=driver.find_element(By.XPATH,"//input[@id='textInput']")
    print(f"is the text boxed enabled?{bool(e1.is_enabled())}")
    driver.find_element(By.XPATH,"//button[@id='textInputButton']").click()
    print(f"is the text boxed enabled?{bool(e1.is_enabled())}")
    driver.quit()