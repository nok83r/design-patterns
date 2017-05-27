package com.nok83r.designpatterns.creational.factoryMethod;


public class SpecialTax implements Tax {

    @Override
    public Integer getRate() {
        return 10;
    }
}
