package com.nok83r.designpatterns.creational.singleton;


public class SingletonMain {

    public static void run() {
        Singleton singleton = Singleton.getInstance();
        System.out.println("Singleton equals: " + singleton.equals(Singleton.getInstance()));
    }

}
