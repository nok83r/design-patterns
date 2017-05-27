package com.nok83r.designpatterns.creational.factoryMethod;


public class TaxFactory {

    public enum Taxes {

        DEFAULT(DefaultTax.class),

        SPECIAL(SpecialTax.class);

        private Class clazz;

        Taxes(Class clazz) {
            this.clazz = clazz;
        }

        public Class getClazz() {
            return clazz;
        }

    }


    public static Tax getTax(Taxes tax) {
        try {
            return (Tax) tax.getClazz().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            return null;
        }
    }


}
