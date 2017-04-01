package com.codeclan.shopping_cart_java;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BasketTest {

    @Before
    public void before(){}

//    Item[] basket = new Item[10];
    ArrayList basket = new ArrayList();
    Item item1 = new Item("Milk", 69, 2);


    @Test
    public void testGetArrayLength()  {
        basket.add(item1);
        assertEquals(1, basket.size());
    }

//    @Test
//    public void testAddtoArrayList(){
//        basket.
//
//    }

}
