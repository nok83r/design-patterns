package com.nok83r.designpatterns.creational.factoryMethod;


public class DefaultTax implements Tax {

    @Override
    public Integer getRate() {
        return 21;
    }
}
