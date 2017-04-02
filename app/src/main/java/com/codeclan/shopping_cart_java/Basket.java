package com.codeclan.shopping_cart_java;


import java.util.ArrayList;

public class Basket {

    private double totalPrice;
    private int itemCount;
    private ArrayList<Item> basket;



    public Basket() {
        this.totalPrice = 0.0;
        this.itemCount = 0;
        this.basket = new ArrayList<Item>();
    }

    public int basketSize(){
        return basket.size();
    }


    public void addItem(Item item){
        basket.add(item);
    }

    public void removeItem(){
        basket.remove(0);
    }

    public void clearAllItems(){
        basket.clear();
    }

}
