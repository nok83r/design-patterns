package com.nok83r.designpatterns.structural.composite;


public interface ItemCatalog {

    default void print() {
        throw new UnsupportedOperationException("Cannot print");
    };

    default void add(ItemCatalog item) {
        throw new UnsupportedOperationException("Cannot add");
    };

    default void remove(ItemCatalog item) {
        throw new UnsupportedOperationException("Cannot remove");
    };

    default String getName() {
        throw new UnsupportedOperationException("Cannot getName");
    };

    default Integer getPrice() {
        throw new UnsupportedOperationException("Cannot getPrice");
    };

}
