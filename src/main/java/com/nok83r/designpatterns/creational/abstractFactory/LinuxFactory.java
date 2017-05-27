package com.nok83r.designpatterns.creational.abstractFactory;


class LinuxFactory implements AbstractFactory {

    @Override
    public Text createText() {
        return new LinuxText();
    }
}
