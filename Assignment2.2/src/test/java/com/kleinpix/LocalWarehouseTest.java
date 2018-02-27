package com.kleinpix;

import org.junit.Test;

import static org.junit.Assert.*;

public class LocalWarehouseTest
{
    LocalWarehouse locWh = new LocalWarehouse();

    @Test
    public void testId()
    {
        locWh.setId("R01");

        assertNotNull(locWh.getId(),"null");
    }

    @Test
    public void testAddressTrue()
    {
        locWh.setAddress("CPT");

        assertTrue(locWh.getId(), true);
    }




}