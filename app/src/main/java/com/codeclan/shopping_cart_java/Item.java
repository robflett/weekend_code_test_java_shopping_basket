package com.codeclan.shopping_cart_java;


public class Item {

    private String item_name;
    private double price;
    private int quantity;
    private boolean bogof;
//    use this boolean to calculate if the item can be divided by 2 for the bogof promotion.

    public Item(String item_name, double price, int quantity, boolean bogof) {
        this.item_name = item_name;
        this.price = price;
        this.quantity = quantity;
        this.bogof = bogof;
    }

    public boolean isBogof() {
        return bogof;
    }

    public void setBogof(boolean bogof) {
        this.bogof = bogof;
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
