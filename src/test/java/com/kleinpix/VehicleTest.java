package com.kleinpix;

import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;


public class VehicleTest extends TestCase
{
    //object equality Pass:
    // - this is when im testing to see if an object already exists in memory, not checking the actual values
    @Test
    public void testObjectEqualityPass()
    {
        Vehicle veh1 = new Vehicle("Toyota","Yaris",300000);

        Vehicle veh2 = new Vehicle("Toyota","Yaris",300000);

        assertEquals(veh1,veh1);
    }
    //object equality FAIL: - this fails due the 1st object being tested against a different memory location
    //expecting mem loc:<com.kleinpix.Vehicle@5305068a> BUT ACTUALLY FOUND :<com.kleinpix.Vehicle@1f32e575>
    @Test
    public void testObjectEqualityFail()
    {
        Vehicle veh1 = new Vehicle("Toyota","Yaris",300000);

        Vehicle veh2 = new Vehicle("Toyota","Yaris",300000); //or even a new veh object eg "Audi","Q7"750000

        assertEquals(veh1,veh2);
    }

    //Object Identity: This is to allocate the identity of an object to another object, in other words,
    //to take the memory allocation of an object and assign that same memory allocation to a different object.
    @Test
    public void testObjectIdentityPass()
    {
        Vehicle veh1 = new Vehicle("Toyota","Yaris",300000);

        Vehicle veh2 = veh1;

        assertEquals(veh1,veh2);
    }
    //Object Identity Fail test
    @Test
    public void testObjectIdentityFail()
    {
        Vehicle veh1 = new Vehicle("Toyota","Yaris",300000);

        Vehicle veh3 = new Vehicle("Toyota","Yaris",300000); //or even a new veh object eg "Audi","Q7"750000

        assertEquals(veh1,veh3);
    }

    //Failing Test:
    @Test
    public void testFailingTest()
    {
        Vehicle veh5 = new Vehicle("Merceds","A_Class",450000);

        Vehicle veh6 = new Vehicle("Merceds","A_Class",450000);

        assertEquals(veh5,veh6);
    }

    //Timeout Test:
    @Test(timeout = 10)
    public void testTimeout()
    {
        Vehicle veh5 = new Vehicle("Merceds","A_Class",450000);
    }



    //Disabling Test: - this allows the specific test to be by-passed and not executed.
    @Ignore
    public void testDisablingTest()
    {
        Vehicle veh5 = new Vehicle("Merceds","A_Class",450000);

        Vehicle veh6 = new Vehicle("Merceds","A_Class",450000);

        assertEquals(veh5,veh6);
    }
}