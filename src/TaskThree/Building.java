package TaskThree;

import java.util.ArrayList;

public class Building {
   private ArrayList<Room> roomsList;
   private int numberOfBathrooms;
   private int numberOfFloors;
   private boolean isOfficeBuilding;


    public Building(ArrayList<Room> roomsList, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.roomsList = roomsList;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public ArrayList<Room> getRoomsList() {
        return roomsList;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }
}
