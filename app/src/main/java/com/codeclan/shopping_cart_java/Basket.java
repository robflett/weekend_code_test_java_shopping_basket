package com.codeclan.shopping_cart_java;


import java.util.ArrayList;

public class Basket {

    private double totalPrice;
    private int itemCount;
    private ArrayList<Item> basket;



    public Basket(double totalPrice, int itemCount, ArrayList<Item> basket) {
        this.totalPrice = totalPrice;
        this.itemCount = itemCount;
        this.basket = basket;
    }


    public void addItem(Item item){
        basket.add(item);
    }


}
