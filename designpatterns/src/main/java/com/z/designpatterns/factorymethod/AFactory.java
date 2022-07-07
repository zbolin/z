package com.z.designpatterns.factorymethod;

public class AFactory {

    public A getA(int id) {
        if(id == 0) {
            return new B();
        }
        else if(id == 1) {
            return new C();
        }
        else return new D();
    }
}
