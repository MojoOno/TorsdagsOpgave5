package TaskThree;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Room toilet = new Room(1, 2, 1);
        Room kitchen = new Room(2, 4, 4);
        Room classroom = new Room(1, 8, 6);

        ArrayList<Room> roomsInSchool = new ArrayList<>();
        roomsInSchool.add(toilet);
        roomsInSchool.add(kitchen);
        roomsInSchool.add(classroom);

        Building school = new Building(roomsInSchool, 30, 4, false);

        System.out.println(totalNumberOfLamps(school));
        System.out.println(isNormal(school));
    }

    private static int totalNumberOfLamps(Building building) {
        int counter = 0;
        for (Room room : building.getRoomsList()) {
            counter += room.getNumberOfLamps();
        }
        return counter;
    }
private static boolean isNormal(Building building){
        if(building.getNumberOfFloors() > building.getRoomsList().size()){
            return true;
        } else {
            System.out.println("This is an odd building");
            return false;
        }
}
}
