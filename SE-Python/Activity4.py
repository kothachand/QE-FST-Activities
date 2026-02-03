from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/target-practice")
    print(driver.title)
    print(driver.find_element(By.XPATH,"//h3[@class='text-3xl font-bold text-orange-600']").text)
    e1=driver.find_element(By.XPATH,"//h5[@class='text-3xl font-bold text-purple-600']")
    print(e1.value_of_css_property("color"))
    e2=driver.find_element(By.XPATH,"//button[@class='rounded-xl bg-purple-200 p-2 text-3xl font-bold text-purple-900 svelte-2hb4ib']")
    print(e2.get_attribute("class"))
    print(driver.find_element(By.XPATH,"//button[@class='rounded-xl bg-slate-200 p-2 text-3xl font-bold text-slate-900 svelte-2hb4ib']").text)
    driver.quit()