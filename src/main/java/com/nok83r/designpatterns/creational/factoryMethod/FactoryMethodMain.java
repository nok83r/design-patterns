package com.nok83r.designpatterns.creational.factoryMethod;


public class FactoryMethodMain {


    public static void run(TaxFactory.Taxes taxEnum) {

        Tax tax = TaxFactory.getTax(taxEnum);

        System.out.println("Tax value: " + tax.getRate());
    }

}
