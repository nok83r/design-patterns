package com.nok83r.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog implements ItemCatalog {

    private List<ItemCatalog> items = new ArrayList();

    private String name;

    public ProductCatalog(String name) {
        this.name = name;
    }

    @Override
    public void add(ItemCatalog item) {
        items.add(item);
    }

    @Override
    public void remove(ItemCatalog item) {
         items.remove(item);
    }

    @Override
    public void print() {
        items.stream().forEach(i -> i.print());
    }
}
