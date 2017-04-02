package com.codeclan.shopping_cart_java;


import java.util.ArrayList;

public class Basket {

    private double totalPrice;
    private double discountedPrice;
    private int itemCount;
    private ArrayList<Item> basket;
    private Customer customer;



    public Basket() {
        this.totalPrice = 0.0;
        this.itemCount = 0;
        this.discountedPrice = 0;
        this.basket = new ArrayList<>();
        this.customer = new Customer(name, loyalty);
    }

    public int basketSize(){
        return basket.size();
    }


    public double addItem(String item_name, double price, int quantity, boolean bogof){
        Item product = new Item(item_name, price, quantity, bogof);

//        if (quantity == 2) && bogof == true {price * 0.5;}
//        switch(finalCost){
//
//            case quantity = 2: case bogof = true:
//                discountedPrice = price * 0.5;
//                break;
//        }
        if (quantity == 2 && bogof == true) {
            discountedPrice = price * 0.5;
        }

        totalPrice += (price * quantity);

        if (totalPrice >= 20000){
            discountedPrice = totalPrice * 0.10;
        }

        if (customer.isLoyalty() == true){
            discountedPrice = totalPrice * 0.02;
        }

        itemCount += quantity;
        basket.add(product);

        return discountedPrice;
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
