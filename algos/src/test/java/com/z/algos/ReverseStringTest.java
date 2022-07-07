package com.z.algos;

import org.junit.Test;
import junit.framework.Assert;
import static org.junit.Assert.assertTrue;
import org.junit.Before;

public class ReverseStringTest {

    private ReverseString reverseString;

    @Before
    public void setUp() {
        reverseString = new ReverseString();
    }


    @Test
    public void simpleTest() {
        String expected = "zach";
        String actual = reverseString.reverse("hcaz");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void simpleTestTwo() {
        String expected = "zach";
        String actual = reverseString.reverseTwo("hcaz");
        Assert.assertEquals(expected,actual);
    }
}
