package com.company;

import java.util.ArrayList;

public class Main
{
    static ArrayList<Customer> customers= new ArrayList<>();
    public static ArrayList<Customer> createList(String name, String username)
    {
        customers.add(new Customer(name,username));
        return customers;
    }

    public static void printCustomers()
    {

        for(Customer s : customers)
        {
            System.out.println(s);
        }
    }



    public static void main(String[] args)
    {
	    createList("Hans","Hans1");
        createList("Hans Erik","HansE1");
        createList("Jens Verner","JensV1");
        createList("Hans Verner","HansV1");
        createList("Jan","Jan1");
        createList("Jens","Jens1");
        printCustomers();



    }

}
