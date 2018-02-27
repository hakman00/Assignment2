package com.kleinpix;

public class Vehicle
{
    private String make;
    private String type;
    private double price;

    public Vehicle()
    {

    }

    public Vehicle(String make,String type,double price)
    {
        this.make = make;
        this.type = type;
        this.price = price;
    }

    //METHODS
    //Setters
    public void setMake(String make)
    {
        this.make = make;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    //Getters
    public String getMake()
    {
        return make;
    }

    public String getType()
    {
        return type;
    }

    public double getPrice()
    {
        return price;
    }
}

