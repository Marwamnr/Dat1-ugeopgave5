import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(2, 4, 3);
        Room room2 = new Room(1, 2, 2);
        Room room3 = new Room(3, 5, 4);

        ArrayList<Room> buildingRooms = new ArrayList<>();
        {
            buildingRooms.add(room1);
            buildingRooms.add(room2);
            buildingRooms.add(room3);


            Building building = new Building(buildingRooms, 2, 6, true);


            int lampsInTotal = countLampsInBuilding(rooms);
            System.out.println("Total number of lamps in the building: " + totalLamps);

            public static int countLampsInBuilding(Building building) {
            int totalLamps = 0;
            for (Room room : building.getRooms()) {
                totalLamps += room.getNumberOfLamps();
            }
            return totalLamps;
        }
        }
    }
}