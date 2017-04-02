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


    public ArrayList<Item> addItem(String item_name, double price, int quantity, boolean bogof){
        Item product = new Item(item_name, price, quantity, bogof);

//        if (quantity == 2)  basket.setPrice() * 0.5;
//          add discounted variable in constructor?

        totalPrice += (price * quantity);
        itemCount += quantity;
        basket.add(product);

        return basket;
    }

//    public int checkout(){
//
//    }

    public void removeItem(){
        basket.remove(0);
    }

    public void clearAllItems(){
        basket.clear();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
}
