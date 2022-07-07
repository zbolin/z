package com.z.designpatterns.factorymethod;

public abstract class A {

    public abstract String getName();

    public String sayHello() {
        return "Hello, " + getName();
    }
}
