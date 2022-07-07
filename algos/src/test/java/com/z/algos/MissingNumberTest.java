package com.z.algos;

import org.junit.Test;
import junit.framework.Assert;
import static org.junit.Assert.assertTrue;
import org.junit.Before;

public class MissingNumberTest {

    private MissingNumber missingNumber;

    @Before
    public void setUp() {
        missingNumber = new MissingNumber();
    }


    @Test
    public void simpleTest() {
        int expected = 2;
        int actual = missingNumber.findMissingNumber("[0,1,3]");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void unorderedTest() {
        int expected = 2;
        int actual = missingNumber.findMissingNumber("[3,0,1]");
        Assert.assertEquals(expected,actual);
    }

}
