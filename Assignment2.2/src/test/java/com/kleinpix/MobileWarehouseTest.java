package com.kleinpix;

import org.junit.Test;

import static org.junit.Assert.*;

public class MobileWarehouseTest
{
    MobileWarehouse mobWh = new MobileWarehouse();

    @Test
    public void testVehReg()
    {
        mobWh.setVehReg("DR75DY GP");

        assertEquals("DR75DY GP", mobWh.getVehReg());
    }

    @Test
    public void testId()
    {
        mobWh.setId("105");

        assertFalse(mobWh.getId(),false);
    }

}