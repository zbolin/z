package com.z.algos;

import org.junit.Test;
import junit.framework.Assert;
import static org.junit.Assert.assertTrue;

import org.junit.Before;

public class ValidParenTest {

    private ValidParen vp;

    @Before
    public void setUp() {
        vp = new ValidParen();
    }


    @Test
    public void simpleTest() {
        boolean expected = false;
        boolean actual =  vp.isValid("((");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void simpleTest2() {
        boolean expected = true;
        boolean actual =  vp.isValid("()");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void simpleTest3() {
        boolean expected = true;
        boolean actual =  vp.isValid("()()");
        Assert.assertEquals(expected,actual);
    }
}
