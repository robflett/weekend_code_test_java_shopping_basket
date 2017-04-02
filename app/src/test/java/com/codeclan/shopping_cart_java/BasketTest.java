package com.codeclan.shopping_cart_java;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BasketTest {

    Basket basket;

    @Before
    public void before() {

        basket = new Basket();

    }

    @Test
    public void testGetArrayLength()  {
        assertEquals(0, basket.basketSize());
    }

    @Test
    public void testAddtoArrayListSize(){
        basket.addItem("Milk", 69, 2, true);
        basket.addItem("Bread", 140, 1, true);
        assertEquals(2, basket.basketSize());
    }

    @Test
    public void testAddtoArrayListTotalPrice(){
        basket.addItem("Milk", 69, 2, true);
        basket.addItem("Bread", 140, 1, true);
        assertEquals(278, basket.getTotalPrice(), 0.0001);
    }

    @Test
    public void testAddtoArrayListQuanitity(){
        basket.addItem("Milk", 69, 2, true);
        basket.addItem("Bread", 140, 1, true);
        assertEquals(3, basket.getItemCount());
    }

    @Test
    public void testRemoveItem(){
        basket.addItem("Milk", 69, 2, true);
        basket.addItem("Bread", 140, 1, true);
        basket.removeItem();
        assertEquals(1, basket.basketSize());
    }

    @Test
    public void testClearItems(){
        basket.addItem("Milk", 69, 2, true);
        basket.addItem("Bread", 140, 1, true);
        basket.clearAllItems();
        assertEquals(0, basket.basketSize());
    }

}
