public class Adventure {

    Map map = new Map();
    Player player = new Player();
    public String look() {
        return player.getCurrentRoom().toString();
    }

    public boolean goNorth() {
        Room roomNorth = player.getCurrentRoom().getNorth();
        if (roomNorth == null){
            return false;
        }
        else {
            player.setCurrentRoom(roomNorth);
            return true;
        }

    }

    public boolean goSouth(){
        Room roomSouth = player.getCurrentRoom().getSouth();
        if (roomSouth == null) {
            return false;
        }
        else {
            player.setCurrentRoom((roomSouth));
            return true;
        }

    }

    public boolean goWest(){
        Room roomWest = player.getCurrentRoom().getWest();
        if (roomWest == null) {
            return false;
        }
        else {
            player.setCurrentRoom(roomWest);
            return true;
        }
    }

    public boolean goEast(){
        Room roomEast = player.getCurrentRoom().getEast();
        if (roomEast == null) {
            return false;
        }
        else {
            player.setCurrentRoom(roomEast);
            return true;
        }
    }
}