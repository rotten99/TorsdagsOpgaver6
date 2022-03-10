package com.company;

public class Main
{

    public static void main(String[] args)
    {

        Driver driver = new Driver("Matias",22);
        Car car1 = new Car("Toyota", "Yaris", 2010, "Cool");
        car1.setDriver("Hans", 30);
        System.out.println(car1+ " "+ car1.getDriver());
        Car car2 = new Car("Tesla","Tesla-model", 2020, "Cool");
        car2.setDriver("Hans", 30);
        System.out.println(car2+ " "+ car2.getDriver());

    }
}
