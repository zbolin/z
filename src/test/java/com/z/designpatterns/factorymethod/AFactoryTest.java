package com.z.designpatterns.factorymethod;


import org.junit.Test;

import junit.framework.Assert;

import static org.junit.Assert.assertTrue;

import org.junit.Before;

public class AFactoryTest {


    private AFactory aFactory;

    @Before
    public void setUp() {
        aFactory = new AFactory();
    }

    @Test
    public void b_test() {
        A a = aFactory.getA(0);
        String expected = "Hello, b";
        String actual = a.sayHello();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void c_test() {
        A a = aFactory.getA(1);
        String expected = "Hello, c";
        String actual = a.sayHello();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void d_test() {
        A a = aFactory.getA(2);
        String expected = "Hello, d";
        String actual = a.sayHello();
        Assert.assertEquals(expected, actual);
    }
}
