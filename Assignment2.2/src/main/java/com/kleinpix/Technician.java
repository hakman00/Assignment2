package com.kleinpix;

public class Technician
{
    private String empId;
    private String empName;

    public Technician()
    {

    }

    public Technician(String empId, String name)
    {
        this.empId = empId;
        this.empName = name;
    }

    public String getEmpId()
    {
        return empId;
    }

    public void setEmpId(String empId)
    {
        this.empId = empId;
    }

    public String getName()
    {
        return empName;
    }

    public void setName(String name)
    {
        this.empName = name;
    }
}
