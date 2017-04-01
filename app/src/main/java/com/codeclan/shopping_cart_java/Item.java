package com.codeclan.shopping_cart_java;


public class Item {

    private String item_name;
    private double price;
    private int quantity;

    public Item(String item_name, double price, int quantity) {
        this.item_name = item_name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
