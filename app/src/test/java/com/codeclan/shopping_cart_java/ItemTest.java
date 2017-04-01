package com.codeclan.shopping_cart_java;

import org.junit.Test;

import static org.junit.Assert.*;


public class ItemTest {

    @Test
    public void testGetItem_Name()  {

        Item item1 = new Item("Milk", 69, 2);

        assertEquals("Milk", item1.getItem_name());
    }

}