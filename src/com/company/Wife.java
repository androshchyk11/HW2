package com.company;

import java.util.ArrayList;

public class Wife {
    static ArrayList<Products> neededProducts = new ArrayList();

    public static void setNeededProducts() {
        Products apple = new Products("Apple - ", 300);
        neededProducts.add(apple);

        Products sony = new Products("Sony - ", 100);
        neededProducts.add(sony);

        Products potato = new Products("Potato - ", 40);
        neededProducts.add(potato);

        Products onion = new Products("Onion - ", 60);
        neededProducts.add(onion);
    }

    public ArrayList<Products> getNeededProducts() {
        return neededProducts;
    }
}