package com.codeclan.shopping_cart_java;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BasketTest {

    Item item1;
    Basket basket;

    @Before
    public void before() {

        basket = new Basket();

        item1 = new Item("Milk", 69, 2);
    }

    @Test
    public void testGetArrayLength()  {
        assertEquals(0, basket.basketSize());
    }

    @Test
    public void testAddtoArrayList(){
        Item item2 = new Item("Bread", 140, 1);
        basket.addItem(item1);
        basket.addItem(item2);
        assertEquals(2, basket.basketSize());
    }

    @Test
    public void testRemoveItem(){
        Item item2 = new Item("Bread", 140, 1);
        basket.addItem(item1);
        basket.addItem(item2);
        basket.removeItem();
        assertEquals(1, basket.basketSize());
    }

    @Test
    public void testClearItems(){
        Item item2 = new Item("Bread", 140, 1);
        basket.addItem(item1);
        basket.addItem(item2);
        basket.clearAllItems();
        assertEquals(0, basket.basketSize());
    }

}
