package com.nok83r.designpatterns.creational.factoryMethod;


public class FactoryMethodMain {


    public static void run() {

        Tax tax = TaxFactory.getTax(TaxFactory.Taxes.DEFAULT);

        System.out.println("Tax value: " + tax.getRate());
    }

}
