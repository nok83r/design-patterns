package com.nok83r.designpatterns.creational.abstractFactory;


class WinFactory implements AbstractFactory {
    @Override
    public Text createText() {
        return new WinText();
    }
}
