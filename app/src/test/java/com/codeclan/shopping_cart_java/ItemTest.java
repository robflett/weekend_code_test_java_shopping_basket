package com.codeclan.shopping_cart_java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class ItemTest {

    @Before
    public void before(){}

        Item item1 = new Item("Milk", 69, 2, true);


    @Test
    public void testIsPartofBogof()  {
        assertEquals(true, item1.isBogof());
    }

    @Test
    public void testGetItem_Name()  {
        assertEquals("Milk", item1.getItem_name());
    }

    @Test
    public void testGetPrice(){
        assertEquals(69, item1.getPrice(), 0.001);
    }

    @Test
    public void testGetQuantity(){
        assertEquals(2, item1.getQuantity());
    }

}