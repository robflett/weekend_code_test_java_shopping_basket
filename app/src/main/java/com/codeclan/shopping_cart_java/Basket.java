package com.codeclan.shopping_cart_java;


public class Basket {

    private double totalPrice;
    private int itemCount;
    private static Item[] basket = new Item[10];

    public Basket(double totalPrice, int itemCount) {
        this.totalPrice = totalPrice;
        this.itemCount = itemCount;
    }



}
