package com.company;

public class Main {

    public static void main(String[] args) {
        Wife wife = new Wife();
        Husband husband = new Husband();
        wife.setNeededProducts();
        husband.setFullListOfProducts();
        husband.comparisonsOfLists();
    }
}
