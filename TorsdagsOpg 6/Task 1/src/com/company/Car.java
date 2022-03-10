package com.company;

public class Car
{
    //Fields
    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    private Driver driver;

    //Constructor
    Car(String make, String model, int year, String bodyStyle)
    {
        this.make=make;
        this.model=model;
        this.year=year;
        this.bodyStyle=bodyStyle;
    }

    //Methods

    //Get driver
    public Driver getDriver()
    {
        return driver;
    }

    public void setDriver(String name, int age)
    {
        driver = new Driver(name,age);
    }

    //To string
    @Override
    public String toString()
    {
        return "Make: "+make+", Model: "+model+", ("+year+"), BodyStyle: "+ bodyStyle;
    }



}
