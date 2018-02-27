package com.kleinpix;

import org.junit.Test;

import static org.junit.Assert.*;

public class TechnicianTest
{
    Technician tech = new Technician();

    @Test
    public void testEmpId()
    {
        tech.setEmpId("650157");

        assertEquals("650157",tech.getEmpId());
    }

}