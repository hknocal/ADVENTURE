import java.util.ArrayList;

public class Room {

    private String roomName;
    private String roomDescription;

    private Room north;
    private Room south;
    private Room east;
    private Room west;

    private ArrayList<Item> items;


    public Room(String roomName, String roomDescription) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        items = new ArrayList<>();
    }

    public String getRoomDescription() {
        return roomDescription;
    }
    public String getRoomName(){
        return roomName;
    }


    public void setEast(Room room) {
        this.east = room;
    }

    public void setNorth(Room room) {
        this.north = room;
    }

    public void setSouth(Room room) {
        this.south = room;
    }

    public void setWest(Room room) {
        this.west = room;
    }

    public Room getEast() {
        return east;
    }

    public Room getWest() {
        return west;
    }

    public Room getNorth(){
        return north;
    }

    public Room getSouth(){
        return south;
    }

    public void addItem (Item item) {
        items.add(item);
    }

    public void addItemsToRoom(Room room, String itemName) {
        room.addItem(new Item(itemName));
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void showItem(){
        System.out.println(items.toString());
    }

    @Override
    public String toString() {
        return "You are currently in: " + "\n" +
                "Room number: " + roomName + "\n" +
                "Room description: " + roomDescription + "\n" +
                "Current items in the room: " + items + "\n";
    }
}


