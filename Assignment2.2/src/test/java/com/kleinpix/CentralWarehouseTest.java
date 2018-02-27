package com.kleinpix;

import org.junit.Test;

import static org.junit.Assert.*;

public class CentralWarehouseTest
{
    CentralWarehouse cw1 = new CentralWarehouse();

    @Test
    public void testId()
    {
        cw1.setId("10F");

        assertEquals("10F",cw1.getId());
    }

    @Test
    public void testIdTrue()
    {
        cw1.setId("10F");

        assertTrue(cw1.getId(), true);
    }

    @Test
    public void testAddressSame()
    {
        cw1.setAddress("JHB");

        assertSame(cw1.getAddress(),"JHB");
    }


}