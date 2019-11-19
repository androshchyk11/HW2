package com.company;

import java.util.ArrayList;
import java.util.SortedMap;

public class Husband extends Wife {
    ArrayList<Products> fullListOfProducts = new ArrayList<>();

    Wife wife = new Wife();

    public void setFullListOfProducts() {
        System.out.println("Total list:");
        Products apple = new Products("Apple - ", 300);
        fullListOfProducts.add(apple);
        System.out.println(apple.name + apple.value);

        Products sony = new Products("Sony - ", 100);
        fullListOfProducts.add(sony);
        System.out.println(sony.name + sony.value);

        Products potato = new Products("Potato - ", 40);
        fullListOfProducts.add(potato);
        System.out.println(potato.name + potato.value);

        Products samsung = new Products("Samsung - ", 80);
        fullListOfProducts.add(samsung);
        System.out.println(samsung.name + samsung.value);

        Products aser = new Products("Aser - ", 40);
        fullListOfProducts.add(aser);
        System.out.println(aser.name + aser.value);

        Products bread = new Products("Bread - ", 110);
        fullListOfProducts.add(bread);
        System.out.println(bread.name + bread.value);

        Products butter = new Products("Butter - ", 70);
        fullListOfProducts.add(butter);
        System.out.println(butter.name + butter.value);

        Products milk = new Products("Milk - ", 150);
        fullListOfProducts.add(milk);
        System.out.println(milk.name + milk.value);
    }

    public ArrayList<Products> getFullListOfProducts() {
        return fullListOfProducts;
    }

    public void comparisonsOfLists() {
        int totalPrice = 0;
        System.out.println("Bought:");
        int len = fullListOfProducts.size();
        int len2 = neededProducts.size();
        for (int i = 0; i < len2; i++) {
            for (int j = 0; j < len; j++) {
                if (fullListOfProducts.get(j).name.equals(neededProducts.get(i).name)) {
                    totalPrice += fullListOfProducts.get(i).value;
                    System.out.println(fullListOfProducts.get(i).name + fullListOfProducts.get(i).value);
                    fullListOfProducts.remove(j);
                    len = fullListOfProducts.size();
                }
            }
        }
        System.out.println("Total price = " + totalPrice);
    }
}
