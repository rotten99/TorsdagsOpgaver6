package com.company;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList<Room> rooms = new ArrayList<>();

	    Room room1= new Room(1,1,1);
        Room room2= new Room(2,2,2);
        Room room3= new Room(3,3,3);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        Building building = new Building(rooms,2,4,false);
        System.out.println(room1.getNumberOfLamps()+room2.getNumberOfLamps()+room3.getNumberOfLamps());
        if(building.getNumberOfFloors()>building.getRooms().size())
        {
            System.out.println("This is an odd building");
        }


    }
}
