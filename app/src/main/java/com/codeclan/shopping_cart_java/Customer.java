package com.codeclan.shopping_cart_java;


public class Customer {

    private String name;
    private boolean loyalty;

    public Customer(String name, boolean loyalty) {
        this.name = name;
        this.loyalty = loyalty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLoyalty() {
        return loyalty;
    }

    public void setLoyalty(boolean loyalty) {
        this.loyalty = loyalty;
    }
}
