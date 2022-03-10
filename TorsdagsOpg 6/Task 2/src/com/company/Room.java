package com.company;

public class Room
{
    //Fields
    private Walls wall;
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    //Constructor
    Room(int numberOfDoors, int numberOfLamps, int numberOfWindows)
    {
        wall= new Walls();
        this.numberOfDoors=numberOfDoors;
        this.numberOfLamps=numberOfLamps;
        this.numberOfWindows=numberOfWindows;
    }

    //Methods

    //Get number of doors
    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }

    //Get number of lamps
    public int getNumberOfLamps()
    {
        return numberOfLamps;
    }

    //Get number of windows
    public  int getNumberOfWindows()
    {
        return numberOfWindows;
    }
}
