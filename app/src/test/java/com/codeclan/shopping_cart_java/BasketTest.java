package com.codeclan.shopping_cart_java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasketTest {

    @Before
    public void before(){}

    Item[] basket = new Item[10];;

    @Test
    public void testGetArrayLength()  {
        assertEquals(10, basket.length);
    }
}
