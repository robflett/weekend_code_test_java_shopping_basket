package com.codeclan.shopping_cart_java;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before() {

        customer = new Customer("Armand", true);

    }

    @Test
    public void testGetName()  {
        assertEquals("Armand", customer.getName());
    }

    @Test
    public void testLoyaltyCheck(){
        assertEquals(true, customer.isLoyalty());
    }
}

