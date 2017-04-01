package com.codeclan.shopping_cart_java;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BasketTest {

    @Before
    public void before(){}


    Item item1 = new Item("Milk", 69, 2);
    ArrayList basket = new ArrayList();


    @Test
    public void testGetArrayLength()  {
        assertEquals(0, basket.size());
    }

    @Test
    public void testAddtoArrayList(){
        Item item2 = new Item("Bread", 140, 1);
        basket.add(item1);
        basket.add(item2);
        assertEquals(2, basket.size());
    }

    @Test
    public void testRemoveItem(){
        Item item2 = new Item("Bread", 140, 1);
        basket.add(item1);
        basket.add(item2);
        basket.remove(item2);
        assertEquals(1, basket.size());
    }

}
