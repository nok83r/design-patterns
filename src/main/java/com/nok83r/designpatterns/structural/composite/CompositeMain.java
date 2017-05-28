package com.nok83r.designpatterns.structural.composite;


public class CompositeMain {

    public static void run() {

        ItemCatalog itemMaleCatalog = new ProductCatalog("Male Catalog");
        ItemCatalog itemFemaleCatalog = new ProductCatalog("Female Catalog");

        ItemCatalog item1 = new Product("Male T shirt 34", 20);
        ItemCatalog item2 = new Product("Male shoes 42", 30);
        ItemCatalog item3 = new Product("Male jeans 40", 40);

        itemMaleCatalog.add(item1);
        itemMaleCatalog.add(item2);
        itemMaleCatalog.add(item3);

        ItemCatalog item4 = new Product("Female jeans 36", 50);
        ItemCatalog item5 = new Product("Female shoes 38", 60);

        itemFemaleCatalog.add(item4);
        itemFemaleCatalog.add(item5);


        ItemCatalog mainCatalogue = new ProductCatalog("Main Catalog");

        mainCatalogue.add(itemFemaleCatalog);
        mainCatalogue.add(itemMaleCatalog);

        mainCatalogue.print();

    }

}
