package com.nok83r.designpatterns.structural.composite;


public class Product implements ItemCatalog {

    private String name;

    private Integer price;

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Product: " + name + " Price: " + price);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getPrice() {
        return price;
    }

}
