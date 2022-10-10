//TODO add food to rooms.

public class Map {
    private Room currentRoom;
    private Room starterRoom;

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public Room getStarterRoom() {
        return starterRoom;
    }

    public void setCurrentRoom(Room room){
        currentRoom = room;
    }
    public Map() {
        buildMap();
    }

    public void buildMap() {
        Room room1 = new Room("Room 1", "The room to welcome you");
        Room room2 = new Room("Room 2", "The room to make you feel cosy");
        Room room3 = new Room("Room 3", "The room to make you wonder why you are here");
        Room room4 = new Room("Room 4", "The room where you have to make a choice");
        Room room5 = new Room("Room 5", "The room of point of no return");
        Room room6 = new Room("Room 6", "The room where you wonder how you get out");
        Room room7 = new Room("Room 7", "The room where you conclude things arent so bad around here");
        Room room8 = new Room("Room 8", "The room where you wonder when this takes and end");
        Room room9 = new Room("Room 9", "The room where you wonder whats next");

        starterRoom = room1;

        room1.setEast(room2);
        room1.setSouth(room4);
        room2.setWest(room1);
        room2.setEast(room3);
        room3.setWest(room2);
        room3.setSouth(room6);
        room6.setNorth(room3);
        room6.setSouth(room9);
        room9.setNorth(room6);
        room9.setWest(room8);
        room8.setEast(room9);
        room8.setWest(room7);
        room8.setNorth(room5);
        room5.setSouth(room8);
        room7.setNorth(room4);
        room7.setEast(room8);
        room4.setNorth(room1);
        room4.setSouth(room7);

        room1.addItemsToRoom(room1, "shovel");
        room1.addItemsToRoom(room1, "cap");
        room2.addItemsToRoom(room2, "pickaxe");
        room3.addItemsToRoom(room3, "key");
        room4.addItemsToRoom(room4, "boots");
        room6.addItemsToRoom(room6, "bucket");
        room7.addItemsToRoom(room7, "rope");
        room8.addItemsToRoom(room8, "lamp");
        room9.addItemsToRoom(room9, "golden monkey idol");
        room1.addFoodToRoom(room1, "banana", 50);
        room1.addFoodToRoom(room1,"cactus", -50);
        room1.addMeleeWeapon(room1, "sword", 150);
        room1.addRangedWeapon(room1, "crossbow", 300, 5);
    }
}
