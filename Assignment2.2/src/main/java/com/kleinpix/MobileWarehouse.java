package com.kleinpix;

public class MobileWarehouse
{
    private String id;
    private String vehReg;

    public MobileWarehouse()
    {

    }

    public MobileWarehouse(String id, String techName)
    {
        this.id = id;
        this.vehReg = techName;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getVehReg()
    {
        return vehReg;
    }

    public void setVehReg(String techName)
    {
        this.vehReg = techName;
    }
}
