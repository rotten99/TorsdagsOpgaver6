package com.company;

public class Customer
{
    //Fields
    private String firstName;
    private String surname;
    private String username;
    private int id;

    //Constructor
    Customer(String firstName,  String username)
    {
        this.firstName=firstName;
        this.username=username;
    }

    //Methods

    //To string
    @Override
    public String toString()
    {
        return firstName + ": " + username;
    }

    //Get first name
    public String getFirstName()
    {
        return firstName;
    }

    //Get surname
    public String getSurname()
    {
        return surname;
    }

    //Get username
    public String getUsername()
    {
        return username;
    }

    //Get id
    public int getId()
    {
        return id;
    }
}
