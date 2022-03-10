package com.company;

public class Driver
{
    //Fields
    private String name;
    private int age;

    //Constructor
    Driver(String name, int age )
    {
        this.name=name;
        this.age=age;
    }


    //To string
    @Override
    public String toString()
    {
        return "is driven by "+name;
    }

}
