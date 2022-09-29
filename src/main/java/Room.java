public class Room {

    private String roomName;
    private String roomDescription;

    private Room north;
    private Room south;
    private Room east;
    private Room west;

    public Room(String roomName, String roomDescription) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
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



}