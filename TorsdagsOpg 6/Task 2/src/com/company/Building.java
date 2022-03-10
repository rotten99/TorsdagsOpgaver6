package com.company;

import java.util.ArrayList;

public class Building
{
    //Fields
    private ArrayList<Room> rooms = new ArrayList<>();
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    //Constructor
    Building(ArrayList<Room> rooms,int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding)
    {
        this.rooms=rooms;
        this.numberOfBathrooms=numberOfBathrooms;
        this.numberOfFloors=numberOfFloors;
        this.isOfficeBuilding=isOfficeBuilding;
    }

    //Methods

    //Get number of bathrooms
    public int getNumberOfBathrooms()
    {
        return numberOfBathrooms;
    }

    //Get number of floors
    public int getNumberOfFloors()
    {
        return numberOfFloors;
    }

    //Get rooms
    public ArrayList<Room> getRooms()
    {
        return rooms;
    }

}
