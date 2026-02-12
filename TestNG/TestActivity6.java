package Demos;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestActivity6 {

    @Test
    @Parameters({"a", "b"})
    public void add( int a,  int b) {
        Assert.assertEquals(a+b,10);
    }

    @Test
    @Parameters({"a", "b"})
    public void sub( int a,  int b) {
        Assert.assertEquals(a-b ,5);
    }
}