package Demos;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {
    @DataProvider(name = "loginData")
public Object[][] data() {
    return new Object[][] {
        {"gopi", "1111"},
        {"chand", "2222"},
        {"test", "3333"}
    };
}

@Test(dataProvider = "loginData")
public void loginTest(String username, String password) {
    System.out.println(username + " - " + password);
} 
}
