package com.nok83r.designpatterns.creational.singleton;


class Singleton {

    private static Singleton instance;

    private Singleton(){};

    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }

}
