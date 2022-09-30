public class Player {
    Map map = new Map ();

    private Room currentRoom = map.getStarterRoom();

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom (Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public String look() {
        return currentRoom.toString();
    }

    public boolean goWest(){
        Room roomWest = getCurrentRoom().getWest();
        if (roomWest == null) {
            return false;
        }
        else {
            setCurrentRoom(roomWest);
            return true;
        }
    }
    public boolean goNorth() {
        Room roomNorth = getCurrentRoom().getNorth();
        if (roomNorth == null){
            return false;
        }
        else {
            setCurrentRoom(roomNorth);
            return true;
        }

    }

    public boolean goSouth(){
        Room roomSouth = getCurrentRoom().getSouth();
        if (roomSouth == null) {
            return false;
        }
        else {
            setCurrentRoom((roomSouth));
            return true;
        }

    }

    public boolean goEast() {
        Room roomEast = getCurrentRoom().getEast();
        if (roomEast == null) {
            return false;
        } else {
            setCurrentRoom(roomEast);
            return true;
        }
    }
}
